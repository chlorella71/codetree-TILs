n = input()
inpArr = list(map(int, input().split()))
resArr = [ i for i in range(1, 10)]
cnt = 0
for i in resArr:
    for j in inpArr:
        if i == j:
            cnt+=1
    print(cnt)
    cnt = 0