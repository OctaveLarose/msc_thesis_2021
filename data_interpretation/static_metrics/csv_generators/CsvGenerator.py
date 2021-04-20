import datetime
import os
from abc import ABC, abstractmethod
import pandas as pd

from data_interpretation.static_metrics.constants import OUTPUT_CSV_DIR


class CsvGenerator(ABC):
    name = ""
    df: pd.DataFrame

    def __init__(self, name):
        self.name = name

    def export(self):
        if not os.path.exists(OUTPUT_CSV_DIR):
            os.makedirs(OUTPUT_CSV_DIR)

        cur_timestamp = datetime.datetime.now().strftime("%Y%m%d_%H%M")
        self.df.to_csv(os.path.join(OUTPUT_CSV_DIR, self.name + cur_timestamp + '.csv'))

    @abstractmethod
    def generate_df(self, df: pd.DataFrame, **kwargs):
        raise NotImplementedError
