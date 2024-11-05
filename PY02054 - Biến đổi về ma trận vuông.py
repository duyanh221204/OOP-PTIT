n, m = map(int, input().split())
a = [list(map(int, input().split())) for _ in range(n)]

if n > m:
    h = [0] * n
    d = 0
    for i in range(0, n, 2):
        if d < n - m:
            d += 1
            h[i] = 1
        else:
            break
    for i in range(n):
        if not h[i]:
            for j in range(m):
                print (a[i][j], end=" ")
            print ()
else:
    c = [0] * m
    d = 0
    for i in range(1, m, 2):
        if d < m - n:
            d += 1
            c[i] = 1
        else:
            break
    for i in range(n):
        for j in range(m):
            if not c[j]:
                print (a[i][j], end=" ")
        print ()
