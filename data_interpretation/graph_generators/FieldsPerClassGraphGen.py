import pandas as pd
import matplotlib.pyplot as plt
import numpy as np
from data_interpretation.graph_generators.GraphGenerator import GraphGenerator


class FieldsPerClassGraphGen(GraphGenerator):
    def __init__(self):
        super().__init__("methods_per_class")

    def generate_graph(self, df):
        # df = pd.read_csv("/home/octavel/bordel/ck_data/class/class_jwtk_jjwt.csv")

        FIELD_GRAPH_CAP = 40
        fig, (ax1, ax2) = plt.subplots(1, 2, gridspec_kw={"hspace": 5})

        # Config for both axes
        ax1.set_ylabel('Number of classes')
        for ax in [ax1, ax2]:
            ax.set_xlabel('Number of methods')
            ax.margins(x=0)

        ## IMPORTANT NOTE: "totalFieldsQty" seems to be bugged, so I create it manually.
        ## However, it seems to never generate classes with only one method...
        ## ...so whether I'm misunderstanding it (and it's normal, somehow), either it's bugged.
        ## The numbers/curve look weird, as well.
        df["totalFieldsQty"] = df["staticFieldsQty"] + \
                               df["publicFieldsQty"] + \
                               df["privateFieldsQty"] + \
                               df["protectedFieldsQty"] + \
                               df["defaultFieldsQty"] + \
                               df["visibleFieldsQty"] + \
                               df["finalFieldsQty"]

        # Ax 1 config
        bins = np.arange(-0.5, FIELD_GRAPH_CAP + 1, 1)
        ax1.hist(df["totalFieldsQty"], bins=bins)
        ax1.set_xlim(right=FIELD_GRAPH_CAP)

        # Ax 2 config
        max_len = df["totalFieldsQty"].max()
        bins = np.arange(0, max_len + 1, 20)
        ax2.hist(df["totalFieldsQty"], bins=bins)
        ax2.set_yscale('log')
        ax2.set_xlim([0, max_len])
        # ax2.set_ylim(top=100)
