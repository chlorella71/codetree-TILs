a = [input().upper().split(' ') for i in range(5)]
for i in a:
    for j in range(3):
        print(i[j], end='')
        if j < 2:
            print(end=' ')
        else:
            print()

