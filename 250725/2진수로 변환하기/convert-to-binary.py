n = int(input())
list = []
# Please write your code here.
while True:
    list.append(n%2)
    n //= 2
    if (n == 1 or n == 0):
        list.append(n)
        break
list = list[::-1]
for i in list:
    print(i,end='')