m1, d1, m2, d2 = map(int, input().split())

# Please write your code here.
month = m1
day = d1
cnt = 1
calendar = [0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31]
while (month != m2 or day !=d2):
    day+=1
    cnt +=1
    if calendar[month] == day:
        day = 0
        month +=1
print(cnt)