def count_coin (n, c2, c5, c10, max_c):
    if n == 0:
        print(f"c2 : {c2} \nc5 : {c5} \nc10 : {c10}")
        print()
        
    if n >= 10 and max_c >= 10:
        c10 += 1
        count_coin(n - 10, c2, c5, c10, 10)        
    if n >= 5 and max_c >= 5:
        c5 += 1
        count_coin(n - 5, c2, c5, c10, 5)        
    if n >= 2 and max_c >= 2:
        c2 += 1
        count_coin(n - 2, c2, c5, c10, 2)
    
    
def main():
    n = 17
    c2 = 0
    c5 = 0
    c10 = 0
    max_c = 10
    
    count_coin(n, c2, c5, c10, max_c)
    
    
if __name__ == "__main__":
    main()