import pandas as pd
import matplotlib.pyplot as plt
import numpy as np
from data_interpretation.graph_generators.GraphGenerator import GraphGenerator


class MethodsPerClassGraphGen(GraphGenerator):
    def __init__(self):
        super().__init__("methods_per_class")

    def generate_graph(self, df):
        # df = pd.read_csv("/home/octavel/bordel/ck_data/class/class_jwtk_jjwt.csv")

        METHOD_GRAPH_CAP = 30
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

        # sub_df = df.loc[df["totalMethodsQty"] <= METHOD_GRAPH_CAP]
        # Config for both axes
        ax1.set_ylabel('Number of classes')
        for ax in [ax1, ax2]:
            ax.set_xlabel('Number of methods')
            ax.margins(x=0)

        # Ax 1 config
        bins = np.arange(-0.5, METHOD_GRAPH_CAP + 1, 1)
        ax1.hist(df["totalMethodsQty"], bins=bins)
        ax1.set_xlim(right=METHOD_GRAPH_CAP)

        # Ax 2 config
        max_len = df["totalMethodsQty"].max()
        bins = np.arange(0, max_len + 1, 20)
        ax2.hist(df["totalMethodsQty"], bins=bins)
        ax2.set_yscale('log')
        ax2.set_xlim([0, max_len])
        # ax2.set_ylim(top=100)
