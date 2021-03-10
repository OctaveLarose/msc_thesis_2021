import os
import pandas as pd
import shutil

from data_interpretation.graph_generators.ClassesPerProjectGraphGen import ClassesPerProjectGraphGen
from data_interpretation.graph_generators.FieldsPerClassGraphGen import FieldsPerClassGraphGen
from data_interpretation.graph_generators.MethodsPerClassGraphGen import MethodsPerClassGraphGen


def generate_mega_class_csv():
    class_csv_path = "/home/octavel/bordel/ck_data/class/"
    csv_filenames = os.listdir(class_csv_path)

    df = None
    for idx, csv_name in enumerate(csv_filenames):
        csv_path = os.path.join(class_csv_path, csv_name)
        new_df = pd.read_csv(csv_path)
        new_df["project_name"] = csv_name[6:-4]  # Removing "class_" and ".csv"
        if df is not None:
            df = pd.concat((df, new_df))
        else:
            df = new_df
        print(f"Progress: {idx + 1}/{len(csv_filenames)}")

    df.to_csv("mega_class.csv", sep=',', encoding='utf-8')


def clean_output_graphs():
    OUTPUT_GRAPH_DIR = 'output_graphs'

    if os.path.isdir(OUTPUT_GRAPH_DIR):
        shutil.rmtree('output_graphs')


def mass_export():
    clean_output_graphs()

    df = pd.read_csv("mega_class.csv")

    graph_classes = [MethodsPerClassGraphGen, FieldsPerClassGraphGen, ClassesPerProjectGraphGen]

    print("Exporting every graph...")

    # Involves evil dict manipulation, since there's only one kwarg per generate_graph() call for now
    for idx, g_cls in enumerate(graph_classes):
        cls = g_cls()
        flag = list(cls.possible_arguments.keys())[0]
        possible_flag_values = list(cls.possible_arguments.values())[0]
        for idx2, arg in enumerate(possible_flag_values):
            cls.generate_graph(df, **{flag: arg})
            cls.export()
            print(f"Current graph class progress: {arg} ({idx2 + 1}/{len(possible_flag_values)})")
        print(f"# Graph classes progress: {g_cls} ({idx + 1}/{len(graph_classes)})")


def main():
    # generate_mega_class_csv()
    df = pd.read_csv("mega_class.csv")

    # graph_cls = MethodsPerClassGraphGen()
    # graph_cls = FieldsPerClassGraphGen()
    graph_cls = ClassesPerProjectGraphGen()

    graph_cls.generate_graph(df)
    # graph_cls.generate_graph(df, field_type="public")
    # graph_cls.generate_graph(df, field_type="protected")
    # graph_cls.generate_graph(df, method_type="static")
    # graph_cls.generate_graph(df, class_type="any")
    graph_cls.generate_graph(df, class_type="class")

    graph_cls.show()
    # graph_cls.export()


if __name__ == "__main__":
    # main()
    mass_export()
