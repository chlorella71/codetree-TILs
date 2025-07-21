inp = input()
arr = inp.split()
a = int(arr[0])
b = int(arr[1])
initVal = 0
for i in range(a, b+1):
    initVal += i
print(initVal)

