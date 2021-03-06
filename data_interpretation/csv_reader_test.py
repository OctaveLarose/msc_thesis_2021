import os
import pandas as pd
import numpy as np
import seaborn as sns
import matplotlib.pyplot as plt


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


def get_classes_per_project_plot(df):
    # df = pd.read_csv("/home/octavel/bordel/ck_data/class/class_jwtk_jjwt.csv")

    data = zip(df["project_name"].unique(), [0] * len(df["project_name"].unique()))

    classes_df = pd.DataFrame(data=data, columns=['projectName', 'classesNbr'])
    for idx, project_name in enumerate(classes_df["projectName"]):
        classes_df.at[idx, "classesNbr"] = len(df[df["project_name"] == project_name])

    CLASS_PER_PROJECT_CAP = 3000
    classes_df = classes_df.loc[classes_df["classesNbr"] <= CLASS_PER_PROJECT_CAP]

    sns.set_theme(style="darkgrid")
    # bins = np.arange(-0.5, METHOD_GRAPH_CAP + 1, 1)
    plot = sns.displot(data=classes_df, x="classesNbr")
    plot.set(xlabel='Number of classes', ylabel='Number of projects')
    # plt.xlim(-1, 30)
    plt.margins(x=0)
    plt.tight_layout()
    plt.show()
    # plt.savefig("classes_per_project.png")


def get_methods_per_class_plot(df):
    # df = pd.read_csv("/home/octavel/bordel/ck_data/class/class_jwtk_jjwt.csv")

    METHOD_GRAPH_CAP = 30
    # print(f"Classes with nbr methods <= {METHOD_GRAPH_CAP}: {len(df.loc[df['totalMethodsQty'] <= METHOD_GRAPH_CAP])}")
    # print(f"Classes with nbr methods > {METHOD_GRAPH_CAP}: {len(df.loc[df['totalMethodsQty'] > METHOD_GRAPH_CAP])}")

    # plot = sns.displot(data=sub_df, x="totalMethodsQty", bins=bins)
    # plot.set(xlabel='Number of methods', ylabel='Number of classes')
    # plt.xlim(-1, 30)
    # plt.tight_layout()
    #
    # plot = sns.displot(data=df, x="totalMethodsQty")
    # plot.set(xlabel='Number of methods', ylabel='Number of classes')
    fig, (ax1, ax2) = plt.subplots(1, 2, gridspec_kw={"hspace": 5})

    # plt.subplots_adjust(left=None, bottom=None, right=None, top=None, wspace=0.3, hspace=None)

    # sub_df = df.loc[df["totalMethodsQty"] <= METHOD_GRAPH_CAP]
    # Config for both axes
    ax1.set_ylabel('Number of classes')
    for ax in [ax1, ax2]:
        ax.set_xlabel('Number of methods')
        ax.margins(x=0)

    # Ax 1 config
    bins = np.arange(-0.5, METHOD_GRAPH_CAP + 1, 1)
    ax1.hist(df["totalMethodsQty"], bins=bins)
    ax1.set_xlim(right=METHOD_GRAPH_CAP)

    # Ax 2 config
    max_len = df["totalMethodsQty"].max()
    bins = np.arange(0, max_len + 1, 20)
    ax2.hist(df["totalMethodsQty"], bins=bins)
    ax2.set_yscale('log')
    ax2.set_xlim([0, max_len])
    # ax2.set_ylim(top=100)
    plt.show()
    # plt.savefig("methods_per_class.png")


def main():
    # generate_mega_class_csv()

    df = pd.read_csv("mega_class.csv")
    get_methods_per_class_plot(df)
    # get_classes_per_project_plot(df)


if __name__ == "__main__":
    main()
