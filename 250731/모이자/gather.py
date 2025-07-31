n = int(input())
A = list(map(int, input().split()))

# Please write your code here.
import sys

INT_MAX = sys.maxsize

cnt_list = [ 0 for i in range(n) ]
cnt = 0

for i in range(n):
    for j in range(n):
        for k in range(A[j]):
            if j > i:
                cnt += (j - i)
            elif j < i:
                cnt += (i - j)
            else:
                continue
    cnt_list[i] = cnt
    cnt = 0

min = INT_MAX
for i in cnt_list:
    if min > i:
        min = i
print(min)

            
         
