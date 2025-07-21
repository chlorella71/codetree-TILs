lista = [ list(map(int, input().split())) for _ in range(1, 5) ]

for i in lista:
    a = 0
    for j in i:
        a +=j
    print(a)