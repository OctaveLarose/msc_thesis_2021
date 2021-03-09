import pandas as pd
import matplotlib.pyplot as plt
import numpy as np

from data_interpretation.graph_generators.GraphGenerator import GraphGenerator


class ClassesPerProjectGraphGen(GraphGenerator):
    possible_arguments = {"class_type": ["any", "class", "innerclass", "interface", "anonymous", "enum"]}

    def __init__(self):
        super().__init__("classes_per_project")

    @staticmethod
    def prune_df_by_class(df: pd.DataFrame, class_type: str):
        if class_type == "any":
            return df

        return df.loc[df["type"] == class_type]

    def generate_graph(self, df: pd.DataFrame, class_type="any"):
        self.name = class_type + "_classes_per_project"

        data = zip(df["project_name"].unique(), [0] * len(df["project_name"].unique()))

        df = self.prune_df_by_class(df, class_type)

        classes_df = pd.DataFrame(data=data, columns=['projectName', 'classesNbr'])
        for idx, project_name in enumerate(classes_df["projectName"]):
            classes_df.at[idx, "classesNbr"] = len(df[df["project_name"] == project_name])

        CLASS_PER_PROJECT_CAP = 3000

        # Seaborn version, has a nice theme
        # classes_df = classes_df.loc[classes_df["classesNbr"] <= CLASS_PER_PROJECT_CAP]
        # sns.set_theme(style="darkgrid")
        # plot = sns.displot(data=classes_df, x="classesNbr")
        # plot.set(xlabel='Number of classes', ylabel='Number of projects')
        # plt.margins(x=0)
        # plt.tight_layout()
        # plt.show()
        # plt.savefig("classes_per_project.png")

        fig, (ax1, ax2) = plt.subplots(1, 2, gridspec_kw={"hspace": 5})

        # plt.subplots_adjust(left=None, bottom=None, right=None, top=None, wspace=0.3, hspace=None)

        # sub_df = df.loc[df["totalMethodsQty"] <= METHOD_GRAPH_CAP]
        # Config for both axes
        ax1.set_ylabel('Number of projects')
        if class_type == "any":
            x_label = 'Number of classes (all types)'
        elif class_type == "class":
            x_label = 'Number of classes (no interfaces, etc.)'
        else:
            x_label = 'Number of ' + class_type + ' classes'

        for ax in [ax1, ax2]:
            ax.set_xlabel(x_label)
            ax.margins(x=0)

        # Ax 1 config
        bins = np.arange(-0.5, CLASS_PER_PROJECT_CAP + 1, 100)
        ax1.hist(classes_df["classesNbr"], bins=bins)
        ax1.set_xlim(right=CLASS_PER_PROJECT_CAP)

        # Ax 2 config
        max_len = classes_df["classesNbr"].max()
        bins = np.arange(0, max_len + 1, 100)
        ax2.hist(classes_df["classesNbr"], bins=bins)
        ax2.set_yscale('log')
        ax2.set_xlim([0, max_len])
        # ax2.set_ylim(top=100)