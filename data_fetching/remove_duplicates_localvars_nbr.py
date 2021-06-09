import os


def get_file_content_no_dups(filename: str):
    cleaned_lines = []

    with open(filename, "r") as f:
        for line in f:
            if line not in cleaned_lines:
                cleaned_lines.append(line)

    return cleaned_lines


def write_content_to_file(content, filename):
    with open(filename, "w") as f:
        for line in content:
            f.write(line)


def main():
    folder_name = "../output_data/disl_data/disl_awfy_local_vars_nbr"

    for filename in os.listdir(folder_name):
        filepath = os.path.join(folder_name, filename)
        new_file_content = get_file_content_no_dups(filepath)
        os.remove(filepath)
        write_content_to_file(new_file_content, filepath)


if __name__ == "__main__":
    main()
