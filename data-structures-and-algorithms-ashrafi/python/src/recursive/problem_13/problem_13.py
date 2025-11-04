def printHanoi(n, S, D, A):
    if n == 1:
        print(f"{S} -> {D}")
    else:
        printHanoi(n - 1, S, A, D)
        print(f"{S} -> {D}")
        printHanoi(n - 1, A, D, S)

def main():
    n = 3
    charS = 'S'
    charD = 'D'
    charA = 'A'
    
    printHanoi(n, charS, charD, charA)


if __name__ == "__main__":
    main()