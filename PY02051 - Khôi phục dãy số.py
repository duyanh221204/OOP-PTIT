n = int(input())
b = [list(map(int, input().split())) for _ in range(n)]

if n == 2:
    print (1, b[0][1] - 1)
else:
    x = b[0][1] + b[0][2] - b[1][2] >> 1
    print (x, end=" ")
    for i in range(1, n):
        print (b[0][i] - x, end=" ")
