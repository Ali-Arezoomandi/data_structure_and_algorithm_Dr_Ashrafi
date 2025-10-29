def max_finder_1(a, s, e):
    if s == e:
        return a[s]
    mid = (s + e) // 2
    num_1 = max_finder_1(a, s, mid)
    num_2 = max_finder_1(a, mid + 1, e)
    if num_1 > num_2:
        return num_1
    else:
        return num_2


def max_finder_2(a, l):
    if l == 0:
        return a[l]
    num1 = a[l - 1]
    num2 = max_finder_2(a, l - 1)
    if num1 > num2:
        return num1
    else:
        return num2


def main():
    nums = [1, 20, 12, 16, 39, 2, 3]
    
    # For maxFinder1

    s = 0
    e = len(nums) - 1

    # For maxFinder2

    length = len(nums) 

    print(f"Maximum in nums is : {max_finder_1(nums, s, e)}")

if __name__ == "__main__":
    main()