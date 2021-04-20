import pandas as pd
import matplotlib.pyplot as plt
import numpy as np
from data_interpretation.static_metrics.graph_generators.GraphGenerator import GraphGenerator


class MethodsPerClassGraphGen(GraphGenerator):
    possible_arguments = {"method_type": ["total", "static", "public", "private", "protected",
                                          "default", "abstract", "final", "synchronized"]}

    def __init__(self):
        super().__init__("methods_per_class")

    @staticmethod
    def get_methods(df: pd.DataFrame, methods_type: str) -> pd.DataFrame:
        return df[methods_type + "MethodsQty"]

    # Used for testing, might become something more in the future
    @staticmethod
    def find_outliers(attribute_name: str, df: pd.DataFrame):
        df = df.sort_values(by=[attribute_name])
        for elem in df.iterrows():
            print(elem[1].get(df.columns.get_loc('file')),
                  elem[1].get(df.columns.get_loc(attribute_name)))

    def generate_graph(self, df, method_type="total"):
        self.name = method_type + "_methods_per_class"

        METHOD_GRAPH_CAP = 40
        # print(f"Classes with nbr methods <= {METHOD_GRAPH_CAP}: {len(df.loc[df['totalMethodsQty'] <= METHOD_GRAPH_CAP])}")
        # print(f"Classes with nbr methods > {METHOD_GRAPH_CAP}: {len(df.loc[df['totalMethodsQty'] > METHOD_GRAPH_CAP])}")

        # plot = sns.displot(data=sub_df, x="totalMethodsQty", bins=bins)
        # plot.set(xlabel='Number of methods', ylabel='Number of classes')
        # plt.xlim(-1, 30)
        # plt.tight_layout()
        #
        # plot = sns.displot(data=df, x="totalMethodsQty")
        # plot.set(xlabel='Number of methods', ylabel='Number of classes')
        fig, (ax1, ax2) = plt.subplots(1, 2, gridspec_kw={"hspace": 5})

        # plt.subplots_adjust(left=None, bottom=None, right=None, top=None, wspace=0.3, hspace=None)

        methods_series = self.get_methods(df, method_type)

        # self.find_outliers('abstractMethodsQty', df)

        # Config for both axes
        ax1.set_ylabel('Number of classes')
        x_label = 'Number of ' + method_type + ' methods' if method_type != "total" else "Total number of methods"
        for ax in [ax1, ax2]:
            ax.set_xlabel(x_label)
            ax.margins(x=0)

        # Ax 1 config
        bins = np.arange(-0.5, METHOD_GRAPH_CAP + 1, 1)
        ax1.hist(methods_series, bins=bins)
        ax1.set_xlim(right=METHOD_GRAPH_CAP)

        # Ax 2 config
        max_len = methods_series.max()
        bins = np.arange(0, max_len + 1, 20)
        ax2.hist(methods_series, bins=bins)
        ax2.set_yscale('log')
        ax2.set_xlim([0, max_len])
        # ax2.set_ylim(top=100)
