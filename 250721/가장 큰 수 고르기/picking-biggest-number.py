inpArr = list(map(int, input().split()))
initVal = inpArr[0]
for i in inpArr:
    if initVal > i:
        continue
    else:
        initVal = i
print(initVal)