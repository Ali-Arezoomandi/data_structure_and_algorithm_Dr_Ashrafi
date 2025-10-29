def sum_of_Factorials(n, s, i):
    if i == n:
        return 1 / s
    return 1 / s + sum_of_Factorials(n, s * (i + 1), i + 1)


def main():
    n = 5
    s = 1
    i = 1

    print(f"1! +...+ {n}! = {sum_of_Factorials(n, s, i):.3f}")

if __name__ == "__main__":
    main()