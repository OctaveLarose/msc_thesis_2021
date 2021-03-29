import datetime
import os
from abc import ABC, abstractmethod
import matplotlib.pyplot as plt
import pandas as pd

from data_interpretation.constants import OUTPUT_GRAPH_DIR


class GraphGenerator(ABC):
    name = ""

    def __init__(self, name):
        self.name = name

    def __del__(self):
        plt.close()

    def show(self):
        plt.show()

    def export(self):
        if not os.path.exists(OUTPUT_GRAPH_DIR):
            os.makedirs(OUTPUT_GRAPH_DIR)

        cur_timestamp = datetime.datetime.now().strftime("%Y%m%d_%H%M")
        plt.savefig(os.path.join(OUTPUT_GRAPH_DIR, self.name + cur_timestamp + ".png"))

    @abstractmethod
    def generate_graph(self, df: pd.DataFrame, **kwargs):
        raise NotImplementedError
