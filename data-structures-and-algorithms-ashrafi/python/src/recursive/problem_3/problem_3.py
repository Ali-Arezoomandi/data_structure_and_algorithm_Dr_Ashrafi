def reverse(a, s, e):
    if s >= e:
        return a
    x = a[s]
    a[s] = a[e]
    a[e] = x
    
    return reverse(a, s + 1, e - 1)

def main():
    nums = [1.2, 5.3, 9.12, 24.5]
    s = 0
    e = len(nums) - 1

    print(f"Reverse of {nums} : {reverse(nums, s, e)}")


if __name__ == "__main__":
    main()