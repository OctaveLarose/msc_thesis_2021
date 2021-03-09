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
        plt.savefig(self.name + ".png")

    @abstractmethod
    def generate_graph(self, df: pd.DataFrame, **kwargs):
        raise NotImplementedError
