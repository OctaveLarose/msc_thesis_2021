import os


def get_file_content_no_dups(filename: str):
    with open(filename, "r") as f:
        methods_ops = {}
        for line in f:
            line = line
            methods_ops[line] = next(f)

        return methods_ops


def write_content_to_file(methods_ops_dict, filename):
    with open(filename, "w") as f:
        for idx, line in enumerate(methods_ops_dict):
            f.write(line)
            f.write(methods_ops_dict[line][:-1])
            if idx != len(methods_ops_dict) - 1:
                f.write("\n")


def main():
    folder_name = "../output_data/disl_data/disl_awfy_operations/"

    for filename in os.listdir(folder_name):
        filepath = os.path.join(folder_name, filename)
        new_file_content = get_file_content_no_dups(filepath)
        os.remove(filepath)
        write_content_to_file(new_file_content, filepath)


if __name__ == "__main__":
    main()
