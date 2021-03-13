import datetime
import os
from abc import ABC, abstractmethod
import pandas as pd


class CsvGenerator(ABC):
    name = ""
    df: pd.DataFrame

    def __init__(self, name):
        self.name = name

    def export(self):
        OUTPUT_FOLDER = "output_csvs"
        if not os.path.exists(OUTPUT_FOLDER):
            os.makedirs(OUTPUT_FOLDER)

        cur_timestamp = datetime.datetime.now().strftime("%Y%m%d_%H%M")
        self.df.to_csv(os.path.join(OUTPUT_FOLDER, self.name + cur_timestamp + '.csv'))

    @abstractmethod
    def generate_df(self, df: pd.DataFrame, **kwargs):
        raise NotImplementedError
