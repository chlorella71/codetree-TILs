a, b = tuple(map(int, input().split()))

nums = []
for i in range(a, b+1):
    if i %2 ==0:
        nums.append(i)

nums.sort(reverse=True)
# for i in nums:
#     print(i)

for i in range(1, 10):
    for j in nums:
        print(f'{j} * {i} = {j*i}', end='')
        if j > a:
            print(end=' / ')
        else:
            print()

