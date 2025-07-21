a = input()
arr = a.split()
b = int(arr[0])
c = int(arr[1])
d = 1 if b >= c else 0
print(d)
d = 1 if b > c else 0
print(d)
d = 1 if c >= b else 0
print(d)
d = 1 if c > b else 0
print(d)
d = 1 if b == c else 0
print(d)
d = 1 if b != c else 0
print(d)