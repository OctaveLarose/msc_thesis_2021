import os
import re


def get_parsed_line(l: str):
    LINE_FORMAT = {"method_access": "", "stack_depth": -1, "thread_id": -1, "class": "", "method": "", "timestamp": ""}

    split_l = re.split(r'[\[\]:=]', l)
    del split_l[2]  # Removing an empty str.

    parsed_line = LINE_FORMAT
    parsed_line["method_access"] = ">" if l[0] == "entry" else "exit"
    parsed_line["stack_depth"] = int(split_l[1])
    parsed_line["thread_id"] = int(split_l[2])  # Always 1, so not very useful.
    parsed_line["class"] = split_l[3]
    parsed_line["method"] = split_l[4]
    parsed_line["timestamp"] = split_l[5][:-1]  # Removing the \n.
    return parsed_line


def parse_calltrace_file(calltrace_fn: str):
    parsed_lines = []

    with open(calltrace_fn, "r") as f:
        for line in f.readlines():
            parsed_lines.append(get_parsed_line(line))

    return parsed_lines


def main():
    calltrace_benchmarks_dir = "../../input_data/calltraces_benchmarks"

    calltrace_permute_txt = "../../input_data/calltraces_benchmarks/calltrace_Json.txt"

    parsed_file = parse_calltrace_file(os.path.join(calltrace_benchmarks_dir, calltrace_permute_txt))
    print(parsed_file)

    # for idx, calltrace_txt_fn in enumerate(os.listdir(calltrace_benchmarks_dir)):
    # One of my files is thick as fuck, so processing it doesn't make my RAM happy
    # if calltrace_txt_fn != "calltrace_Havlak.txt":
    #     parsed_file = parse_calltrace_file(os.path.join(calltrace_benchmarks_dir, calltrace_txt_fn))
    #     print(parsed_file)
    # print(f"{idx + 1}/{len(os.listdir(calltrace_benchmarks_dir))} ({calltrace_txt_fn})...")


if __name__ == "__main__":
    main()
