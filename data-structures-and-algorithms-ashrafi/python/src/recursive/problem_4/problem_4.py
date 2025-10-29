def to_binary(a):
    if a // 2 == 0: 
        print(a, end="")
    else: 
        to_binary(a // 2)
        print(a % 2, end="")
        

def main():
    num = 13
    
    to_binary(num)
    
    
if __name__ == "__main__":
    main()