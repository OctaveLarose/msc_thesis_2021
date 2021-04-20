import pandas as pd

from data_interpretation.static_metrics.csv_generators.CsvGenerator import CsvGenerator
from scipy.stats import spearmanr
import itertools


class FeatureCorrelationCsvGenerator(CsvGenerator):

    def __init__(self):
        super().__init__("feature_correlation")

    def generate_df(self, df: pd.DataFrame, **kwargs):
        if kwargs:
            print("Ignoring extra arguments")

        df["totalFieldsQty"] = df["publicFieldsQty"] + \
                               df["privateFieldsQty"] + \
                               df["protectedFieldsQty"]

        # # Test: removing outliers
        # for c in df:
        #     if df[c].dtype != int:
        #         continue
        #     for i in range(50):
        #         df = df.drop(df[c].idxmax())

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

            CORR_THRESHOLD_POS = 0.7
            CORR_THRESHOLD_NEG = -0.1
            if corr > CORR_THRESHOLD_POS or corr < CORR_THRESHOLD_NEG:
                print(f'Spearman CC for {a} and {b}: {corr:.3f}')
                # print(f'p_value: {p:.4f}')
            # print(f"Progress: {idx}/{len(elem_pairs)}")

        self.df = corr_df
