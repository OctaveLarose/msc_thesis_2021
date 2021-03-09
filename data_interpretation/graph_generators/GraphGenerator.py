import datetime
import os
from abc import ABC, abstractmethod
import matplotlib.pyplot as plt
import pandas as pd


class GraphGenerator(ABC):
    name = ""

    def __init__(self, name):
        self.name = name

    def __del__(self):
        plt.close()

    def show(self):
        plt.show()

    def export(self):
        OUTPUT_FOLDER = "output_graphs"
        if not os.path.exists(OUTPUT_FOLDER):
            os.makedirs(OUTPUT_FOLDER)

        cur_timestamp = datetime.datetime.now().strftime("%Y%m%d_%H%M")
        plt.savefig(os.path.join(OUTPUT_FOLDER, self.name + cur_timestamp + ".png"))

    @abstractmethod
    def generate_graph(self, df: pd.DataFrame, **kwargs):
        raise NotImplementedError
