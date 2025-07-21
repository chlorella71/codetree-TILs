n, m = tuple(map(int, input().split()))
numArr = [list(map(int, input().split())) for _ in range(m)]
for i in range(1, n+1):
    for j in range(1, n+1):
        a = False
        for k in numArr:
            if i == k[0] and j == k[1]:
                a = True
        print(1 if a ==True else 0, end="")
        if j < n:
            print(end=" ")
        else:
            print()
