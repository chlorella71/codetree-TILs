n = int(input())
name = []
height = []
weight = []
for _ in range(n):
    n_i, h_i, w_i = input().split()
    name.append(n_i)
    height.append(int(h_i))
    weight.append(int(w_i))

# Please write your code here.
class Person:
    def __init__(self, n, h, w):
        self.n = n
        self.h = h
        self.w = w

people = [
    Person(name[i], height[i], weight[i]) for i in range(n)
]

people.sort(key= lambda x : (x.h, -x.w))

for i in people:
    print(f'{i.n} {i.h} {i.w}')