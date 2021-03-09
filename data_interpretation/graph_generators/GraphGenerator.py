import os
from abc import ABC, abstractmethod
import matplotlib.pyplot as plt
import pandas as pd


class GraphGenerator(ABC):
    name = ""

    def __init__(self, name):
        self.name = name

    def show(self):
        plt.show()

    def export(self):
        OUTPUT_FOLDER = "output_graphs"
        if not os.path.exists(OUTPUT_FOLDER):
            os.makedirs(OUTPUT_FOLDER)

        plt.savefig(os.path.join(OUTPUT_FOLDER, self.name + ".png"))

    @abstractmethod
    def generate_graph(self, df: pd.DataFrame, **kwargs):
        raise NotImplementedError
