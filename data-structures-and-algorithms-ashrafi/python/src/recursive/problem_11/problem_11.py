def count_coin (n, c2, c5, c10):
    if n == 0:
        print(f"c2 : {c2} \nc5 : {c5} \nc10 : {c10}")
        print()
        
    if n >= 10:
        c10 += 1
        count_coin(n - 10, c2, c5, c10)        
    if n >= 5:
        c5 += 1
        count_coin(n - 5, c2, c5, c10)        
    if n >= 2:
        c2 += 1
        count_coin(n - 2, c2, c5, c10)
    
    
def main():
    n = 17
    c2 = 0
    c5 = 0
    c10 = 0
    
    count_coin(n, c2, c5, c10)
    
    
if __name__ == "__main__":
    main()