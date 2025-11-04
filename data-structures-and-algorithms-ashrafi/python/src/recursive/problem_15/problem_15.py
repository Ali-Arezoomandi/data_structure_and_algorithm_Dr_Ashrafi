def chess_board(a, num):
    if num == 8:
        for i in range(0, 8):
            print(f"{a[i]}", end=" / ")
        print()
    else:
        for i in range(0, 8):
            is_true = True
            for j in range(0, num):
                if (i == a[j]) or (i - num == a[j] - j) or (i + num == a[j] + j):
                    is_true = False
            if is_true:
                a[num] = i
                chess_board(a, num + 1)
                    
            
def main():
    a = [0, 0, 0, 0, 0, 0, 0, 0]
    num = 0

    chess_board(a, num)

if __name__ == "__main__":
    main()