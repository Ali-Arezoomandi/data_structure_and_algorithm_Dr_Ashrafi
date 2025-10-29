def sum_of_Factorials(n, s, i):
    if i == n:
        return s
    return s + sum_of_Factorials(n, s * (i + 1), i + 1)


def main():
    n = 5
    s = 1
    i = 1

    print(f"1! +...+ {n}! = {sum_of_Factorials(n, s, i)}")

if __name__ == "__main__":
    main()