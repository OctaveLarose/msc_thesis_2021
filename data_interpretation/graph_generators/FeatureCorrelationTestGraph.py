import pandas as pd
import matplotlib.pyplot as plt
import numpy as np
from data_interpretation.graph_generators.GraphGenerator import GraphGenerator
from scipy.stats import spearmanr, shapiro
import itertools


class FeatureCorrelationTestGraph(GraphGenerator):

    def __init__(self):
        super().__init__("feature_correlation_test")

    def get_correl_vals(self, df: pd.DataFrame):
        int_cols = [c for c in df[1:] if df[c].dtype == int]
        int_cols = int_cols[1:]  # Removing first element (index col.)

        elem_pairs = []
        for a, b in itertools.product(int_cols, int_cols):
            if a != b and (b, a) not in elem_pairs:
                elem_pairs.append((a, b))

        for idx, p in enumerate(elem_pairs):
            corr, p_val = spearmanr(df[p[0]], df[p[1]])
            if p_val > 0.005:
                print(f'Spearmans correlation for {p[0]} and {p[1]}: {corr:.3f}')
                print(f'p_value: {p_val:.4f}')

    def generate_graph(self, df, **kwargs):
        if kwargs:
            print("Ignoring extra arguments")

        df["totalFieldsQty"] = df["publicFieldsQty"] + \
                               df["privateFieldsQty"] + \
                               df["protectedFieldsQty"]

        self.get_correl_vals(df)

        # plt.xlim(0, 300)
        # plt.ylim(0, 300)
        # plt.scatter(df["totalMethodsQty"], df["totalFieldsQty"], s=2)

        # corr, p_val = spearmanr(df["totalMethodsQty"], df["totalFieldsQty"])
        # print('Spearmans correlation: %.3f' % corr)
        # print('%.4f' % p_val)
        #
        #
        # shapiro_test = shapiro(df["totalMethodsQty"])
        # print(shapiro_test)
        # shapiro_test = shapiro(df["totalFieldsQty"])
        # print(shapiro_test)
