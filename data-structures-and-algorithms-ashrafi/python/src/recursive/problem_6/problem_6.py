def multiply(a , b):
    if b == 0:
        return 0
    return a + multiply(a, b - 1)


def main():
    num_1 = 4
    num_2 = 5

    print(f"{num_1} x {num_2} = {multiply(num_1, num_2)}")


if __name__ == "__main__":
    main()