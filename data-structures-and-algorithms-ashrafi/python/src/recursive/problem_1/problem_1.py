def devision(a, b):
    if a < b:
        return 0
    return 1 + devision(a - b, b)


def main():
    a = 13
    b = 3

    print(f"13 / 3 = {devision(a, b)}")
    
    
if __name__ == "__main__":
    main()