n = int(input())
moves = [tuple(input().split()) for _ in range(n)]
dir = [move[0] for move in moves]
dist = [int(move[1]) for move in moves]

def go(arr, arr2):
    if arr2[0] == 'N':
        arr[1] += int(arr2[1])
    elif arr2[0] == 'S':
        arr[1] -= int(arr2[1])
    elif arr2[0] == 'E':
        arr[0] += int(arr2[1])
    elif arr2[0] =='W':
        arr[0] -= int(arr2[1])
    return arr

# Please write your code here.
result=[0,0]
for i in moves:
    go(result, i)
x, y = result
print(f'{x} {y}')