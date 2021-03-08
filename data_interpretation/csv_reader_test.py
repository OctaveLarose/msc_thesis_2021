import os
import pandas as pd

import data_interpretation.graph_generators.classes_per_project as classes_per_project
import data_interpretation.graph_generators.methods_per_class as methods_per_class


def generate_mega_class_csv():
    class_csv_path = "/home/octavel/bordel/ck_data/class/"
    csv_filenames = os.listdir(class_csv_path)

    df = None
    for idx, csv_name in enumerate(csv_filenames):
        csv_path = os.path.join(class_csv_path, csv_name)
        new_df = pd.read_csv(csv_path)
        new_df["project_name"] = csv_name[6:-4] # Removing "class_" and ".csv"
        if df is not None:
            df = pd.concat((df, new_df))
        else:
            df = new_df
        print(f"Progress: {idx + 1}/{len(csv_filenames)}")

    df.to_csv("mega_class.csv", sep=',', encoding='utf-8')


def main():
    # generate_mega_class_csv()

    df = pd.read_csv("mega_class.csv")
    methods_per_class.generate_graph(df)
    # classes_per_project.generate_graph()


if __name__ == "__main__":
    main()
