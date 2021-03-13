import os

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

        corr_df = pd.DataFrame(columns=["attr1", "attr2", "correlation", "p"])
        for idx, (a, b) in enumerate(elem_pairs):
            corr, p = spearmanr(df[a], df[b])
            corr_df.loc[idx] = [a, b, corr, p]

            CORR_THRESHOLD_POS = 1000
            CORR_THRESHOLD_NEG = -0.1
            if corr > CORR_THRESHOLD_POS or corr < CORR_THRESHOLD_NEG:
                print(f'Spearmans correlation for {a} and {b}: {corr:.3f}')
                print(f'p_value: {p:.4f}')
            # print(f"Progress: {idx}/{len(elem_pairs)}")

        if not os.path.exists("output_csvs"):
            os.makedirs("output_csvs")
        corr_df.to_csv("output_csvs/attribute_correlations.csv")


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
