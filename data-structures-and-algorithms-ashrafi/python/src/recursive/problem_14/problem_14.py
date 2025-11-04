def printHanoi(n, S, D, A):
    if n == 1:
        print(f"{S} -> {A}")
        print(f"{A} -> {D}")
    else:
        printHanoi(n - 1, S, D, A)
        print(f"{S} -> {A}")
        printHanoi(n - 1, D, S, A)
        print(f"{A} -> {D}")
        printHanoi(n - 1, S, D, A)

def main():
    n = 2
    charS = 'S'
    charD = 'D'
    charA = 'A'
    
    printHanoi(n, charS, charD, charA)


if __name__ == "__main__":
    main()