n, k = map(int, input().split())
commands = [tuple(map(int, input().split())) for _ in range(k)]

# Please write your code here.
list = [0 for _ in range(n)]
for i in commands:
    for j in range(i[0] -1, i[1]):
        list[j] += 1
list.sort(reverse=True)
print(list[0])