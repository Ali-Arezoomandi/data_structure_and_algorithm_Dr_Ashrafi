def print_truth_table(n, s):
    if len(s) == n:
        print(s)
    else:
        print_truth_table(n, s + "0")
        print_truth_table(n, s + "1")


def main():
    n = 2
    s = ""
    
    print_truth_table(n, s)


if __name__ == "__main__":
    main()