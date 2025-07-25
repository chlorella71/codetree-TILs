a, b, c, d = map(int, input().split())

# Please write your code here.
hour = a
min = b
cnt = 0
while (hour != c or min != d):
    min +=1
    cnt +=1
    if min == 60:
        min = 0
        hour +=1
    
print(cnt)