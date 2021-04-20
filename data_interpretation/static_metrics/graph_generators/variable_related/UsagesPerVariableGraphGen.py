import pandas as pd
import matplotlib.pyplot as plt
import numpy as np

from data_interpretation.static_metrics.graph_generators.GraphGenerator import GraphGenerator


class UsagesPerVariableGraphGen(GraphGenerator):
    possible_arguments = {"variable_type": ["field", "local"]}

    def __init__(self):
        super().__init__("usages_per_variable")

    def generate_graph(self, df: pd.DataFrame, variable_type):
        self.name = variable_type + "_usages_per_variable"

        VAR_GRAPH_CAP = 13
        fig, (ax1, ax2) = plt.subplots(1, 2, gridspec_kw={"hspace": 5})

        ax1.set_ylabel('Number of variables')

        if variable_type == "field":
            x_label = 'Number of calls per field'
        elif variable_type == "local":
            x_label = 'Number of calls per local variable'
        else:
            raise TypeError("Invalid variable_type")

        for ax in [ax1, ax2]:
            ax.set_xlabel(x_label)
            ax.margins(x=0)

        # Ax 1 config
        bins = np.arange(-0.5, VAR_GRAPH_CAP + 1, 1)
        ax1.hist(df["usage"], bins=bins)
        ax1.set_xlim(right=VAR_GRAPH_CAP)

        # Ax 2 config
        max_len = df["usage"].max()
        bins = np.arange(0, max_len + 1, 1)
        ax2.hist(df["usage"], bins=bins)
        plt.yscale('log')
        ax2.set_yticks([1, 2, 3, 5, 10] + [max_len])
        ax2.set_xlim([0, max_len])
