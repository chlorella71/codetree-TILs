dirs = input()

# Please write your code here.

dx = [0, 1, 0, -1]
dy = [1, 0, -1, 0]
dir_num_list = [0, 1, 2, 3]

def right(dir):
    if dir == 0:
        return 1
    elif dir == 1:
        return 2
    elif dir == 2:
        return 3
    elif dir == 3:
        return 0

def left(dir):
    if dir == 0:
        return 3
    elif dir == 1:
        return 0
    elif dir == 2:
        return 1
    elif dir == 3:
        return 2
    

def move(a, b):
    if a =='L':
        b = left(b)
    elif a == 'R':
        b = right(b)
    return b


result = [0, 0]
dir = 0
list = list(dirs)
for i in list:
    if i == 'L' or i == 'R':
        dir = move(i, dir)
    if i == 'F':
        result[0] = result[0] + dx[dir]
        result[1] = result[1] + dy[dir]
print(f'{result[0]} {result[1]}')
