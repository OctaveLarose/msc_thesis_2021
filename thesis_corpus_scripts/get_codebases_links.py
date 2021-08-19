import os


def main():
    # codebase_path = "../input_data/old_input_data/java_codebases_pre_19_03/"
    codebase_path = "../input_data/java_codebases/"

    for f in os.listdir(codebase_path):
        author, repo_name = f.split("_", 1)
        # print(author, repo_name)
        print(f"https://www.github.com/{author}/{repo_name}\n")


main()
