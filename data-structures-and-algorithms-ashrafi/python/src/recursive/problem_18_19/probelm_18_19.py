def isDuplicate(s):
    if len(s) == 0:
        return True

    mid = (len(s) - 1) // 2 
    
    if s[0:mid + 1] == s[mid + 1:]:
        return isDuplicate(s[1:mid + 1])
    else:
        return False
    
    
def main():
    s = "AllAll"
    
    print(isDuplicate(s))


if __name__ == "__main__":
    main()