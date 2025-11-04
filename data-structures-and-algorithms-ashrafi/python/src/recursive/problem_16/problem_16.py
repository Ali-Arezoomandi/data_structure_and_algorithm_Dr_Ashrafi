all_sub_set = []

def sub_sets(set, i, sub_set):
    if i == len(set):
        all_sub_set.append(sub_set.copy())
        return
    sub_sets(set, i + 1, sub_set)
    sub_set.append(set[i])
    sub_sets(set, i + 1, sub_set)
    sub_set.pop()


def main():
    set = [1, 2, 3]
    sub_set = []
    i = 0
    
    
    sub_sets(set, i, sub_set)
    
    print(all_sub_set)


if __name__ == "__main__":
    main()