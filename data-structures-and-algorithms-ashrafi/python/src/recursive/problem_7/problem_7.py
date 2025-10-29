def gcd(a, b):
    if b == 0:
        return a
    return gcd(b, a % b)


def main():
    num_1 = 18
    num_2 = 12

    print(f"({num_1}, {num_2}) = {gcd(num_1, num_2)}")
    
    
if __name__ == "__main__":
    main()