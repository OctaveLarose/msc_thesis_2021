import pandas as pd


def one_method_adventures(class_df):
    classes_with_one_method = class_df[class_df["totalMethodsQty"] == 1]

    print(len(classes_with_one_method))
    print(len(classes_with_one_method[classes_with_one_method["type"] == "class"]))
    print(len(classes_with_one_method[classes_with_one_method["type"] == "interface"]))
    print(len(classes_with_one_method[classes_with_one_method["type"] == "innerclass"]))
    print(len(classes_with_one_method[classes_with_one_method["type"] == "anonymous"]))

    anon_classes = classes_with_one_method[classes_with_one_method["type"] == "anonymous"]

    count = 0
    for project in anon_classes["project_name"].unique():
        print(f'{project}: {len(anon_classes[anon_classes["project_name"] == project])}')
        if len(anon_classes[anon_classes["project_name"] == project]) < 200:
            count += 1
    print(count)
    print(len(anon_classes["project_name"].unique()))
    print(count / len(anon_classes["project_name"].unique()))


def no_method_adventures(class_df):
    no_method_classes = class_df[class_df["totalFieldsQty"] == 0]

    print(len(no_method_classes))
    print(len(no_method_classes[no_method_classes["type"] == "class"]))
    print(len(no_method_classes[no_method_classes["type"] == "interface"]))
    print(len(no_method_classes[no_method_classes["type"] == "innerclass"]))
    print(len(no_method_classes[no_method_classes["type"] == "anonymous"]))
    print(len(no_method_classes[no_method_classes["type"] == "enum"]))

    # anon_classes = no_method_classes[no_method_classes["type"] == "anonymous"]
    # count = 0
    # for project in anon_classes["project_name"].unique():
    #     print(f'{project}: {len(anon_classes[anon_classes["project_name"] == project])}')
    #
    # # print(len(anon_classes["project_name"].unique()))
    # # print(count / len(anon_classes["project_name"].unique()))
    #
    # # print(no_method_classes[no_method_classes["type"] == "interface"])
    # for idx, row in no_method_classes[no_method_classes["type"] == "innerclass"].iterrows():
    #     print(row["file"])
    #     if "test" in row["file"]:
    #         count += 1
    # print(len(no_method_classes[no_method_classes["type"] == "innerclass"]))
    # print(count)


def mess_around_for_thesis_data():
    class_df = pd.read_csv("mega_class.csv")

    class_df["totalFieldsQty"] = class_df["publicFieldsQty"] + \
                   class_df["privateFieldsQty"] + \
                   class_df["protectedFieldsQty"]

    for idx, row in class_df[class_df["totalMethodsQty"] > 1500 ].iterrows():
        print(row["totalMethodsQty"], row["file"])

    # one_method_adventures(class_df)
    # no_method_adventures(class_df)


def main():
    mess_around_for_thesis_data()


if __name__ == "__main__":
    main()
