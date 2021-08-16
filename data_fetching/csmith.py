import subprocess


def count_program_lines(program_instrs: [str]):
    nbr_instrs = 0

    for line in program_instrs:
        if line == "/************************ statistics *************************":
            break
        if line == "\n":
            continue
        if line[0:2] == "/*" or line[0:2] == " *":
            continue
        nbr_instrs += 1

    return nbr_instrs


def run_csmith():
    result = subprocess.run(['csmith'], stdout=subprocess.PIPE)
    return count_program_lines(result.stdout.decode('utf-8').split("\n"))


def main():
    total_run_instrs = []

    for _ in range(100):
        nbr_instrs = run_csmith()
        total_run_instrs.append(nbr_instrs)

    print(total_run_instrs)
    print(min(total_run_instrs))
    print(max(total_run_instrs))
    print(sum(total_run_instrs) / len(total_run_instrs))


main()
