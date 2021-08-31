import pandas as pd


def one_method_adventures(class_df):
    classes_with_one_method = class_df[class_df["totalMethodsQty"] == 1]

    print(len(classes_with_one_method))
    # print(len(classes_with_one_method[classes_with_one_method["type"] == "class"]))
    # print(len(classes_with_one_method[classes_with_one_method["type"] == "interface"]))
    # print(len(classes_with_one_method[classes_with_one_method["type"] == "innerclass"]))
    anon_classes = classes_with_one_method[classes_with_one_method["type"] == "anonymous"]

    print(anon_classes)
    count = 0
    for project in anon_classes["project_name"].unique():
        print(f'{project}: {len(anon_classes[anon_classes["project_name"] == project])}')
        if len(anon_classes[anon_classes["project_name"] == project]) < 100:
            count += 1
    print(count)
    print(len(anon_classes["project_name"].unique()))
    print(count / len(anon_classes["project_name"].unique()))


def no_method_adventures(class_df):
    no_method_classes = class_df[class_df["totalMethodsQty"] == 0]

    print(len(no_method_classes))


def mess_around_for_thesis_data():
    # generate_mega_class_csv()
    class_df = pd.read_csv("mega_class.csv")

    # one_method_adventures(class_df)
    no_method_adventures(class_df)


def main():
    mess_around_for_thesis_data()


if __name__ == "__main__":
    main()
