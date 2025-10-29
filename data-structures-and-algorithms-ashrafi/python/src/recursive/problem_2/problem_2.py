def average(a, l, i):
    if i == l - 1:
        return a[i] / l
    return (a[i] / l) + average(a, l, i + 1) 


def main():
    nums = [2, 1, 4, 3, 6, 5]
    length = len(nums)
    i = 0
    
    print(f"Average = {average(nums, length, i)}")


if __name__ == "__main__":
    main()