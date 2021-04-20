import pandas as pd
import matplotlib.pyplot as plt
import numpy as np
from data_interpretation.static_metrics.graph_generators.GraphGenerator import GraphGenerator


class FieldsPerClassGraphGen(GraphGenerator):
    possible_arguments = {"field_type": ["total", "static", "public", "private", "protected",
                                         "default", "final", "synchronized"]}

    def __init__(self):
        super().__init__("methods_per_class")

    @staticmethod
    def get_fields(df: pd.DataFrame, field_type: str) -> pd.DataFrame:
        # Note: "totalFieldsQty" seems to be bugged, so I create it manually.
        if field_type == "total":
            return df["publicFieldsQty"] + \
                   df["privateFieldsQty"] + \
                   df["protectedFieldsQty"]

        return df[field_type + "FieldsQty"]

    def generate_graph(self, df, field_type="total"):
        self.name = field_type + "_fields_per_class"

        # df = pd.read_csv("/home/octavel/bordel/ck_data/class/class_jwtk_jjwt.csv")

        FIELD_GRAPH_CAP = 40
        fig, (ax1, ax2) = plt.subplots(1, 2, gridspec_kw={"hspace": 5})

        # Config for both axes
        ax1.set_ylabel('Number of classes')
        x_label = ('Number of ' + field_type + ' fields') if field_type != "total" else "Total number of fields"
        for ax in [ax1, ax2]:
            ax.set_xlabel(x_label)
            ax.margins(x=0)

        fields = self.get_fields(df, field_type)

        # Ax 1 config
        bins = np.arange(-0.5, FIELD_GRAPH_CAP + 1, 1)
        ax1.hist(fields, bins=bins)
        ax1.set_xlim(right=FIELD_GRAPH_CAP)

        # Ax 2 config
        max_len = fields.max()
        bins = np.arange(0, max_len + 1, 20)
        ax2.hist(fields, bins=bins)
        ax2.set_yscale('log')
        ax2.set_xlim([0, max_len])
        # ax2.set_ylim(top=100)
