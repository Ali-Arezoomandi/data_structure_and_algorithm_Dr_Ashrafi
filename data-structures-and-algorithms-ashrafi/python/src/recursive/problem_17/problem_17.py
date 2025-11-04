def calculet_for_x(s, x):
    
    s = s.replace(" ", "")
    
    if s == "x":
        return x
    else:
        for i in range(len(s) - 1, 0, -1):
            c = s[i]
            if c == "+":
                return calculet_for_x(s[0:i], x) + calculet_for_x(s[i + 1:], x)
            elif c == "-":
                return calculet_for_x(s[0:i], x) - calculet_for_x(s[i + 1:], x)        
        for i in range(len(s) - 1, 0, -1):
            c = s[i]
            if c == "*":
                return calculet_for_x(s[0:i], x) * calculet_for_x(s[i + 1:], x)
            elif c == "/":
                return calculet_for_x(s[0:i], x) / calculet_for_x(s[i + 1:], x)
          
        return float(s)      

def main():
    s = "x + x * x / x - x + x + x - x + x"
    x = 2
    
    result = calculet_for_x(s, x)
    print(f"Result = {result}")


if __name__ == "__main__":
    main()