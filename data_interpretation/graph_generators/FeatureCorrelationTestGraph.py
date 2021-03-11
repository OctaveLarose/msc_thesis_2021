import pandas as pd
import matplotlib.pyplot as plt
import numpy as np
from data_interpretation.graph_generators.GraphGenerator import GraphGenerator
from scipy.stats import spearmanr, shapiro
import math

class FeatureCorrelationTestGraph(GraphGenerator):

    def __init__(self):
        super().__init__("feature_correlation_test")

    def generate_graph(self, df, **kwargs):
        if kwargs:
            print("Ignoring extra arguments")

        df["totalFieldsQty"] = df["publicFieldsQty"] + \
                   df["privateFieldsQty"] + \
                   df["protectedFieldsQty"]


        plt.xlim(0, 300)
        plt.ylim(0, 300)
        plt.scatter(df["totalMethodsQty"], df["totalFieldsQty"])
        # plt.scatter(df["totalFieldsQty"], df["totalMethodsQty"])


        corr, p_val = spearmanr(df["totalMethodsQty"], df["totalFieldsQty"])
        print('Spearmans correlation: %.3f' % corr)
        print('%.4f' % p_val)

        shapiro_test = shapiro(df["totalMethodsQty"])
        print(shapiro_test)
        shapiro_test = shapiro(df["totalFieldsQty"])
        print(shapiro_test)
