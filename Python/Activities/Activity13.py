def sum(n):
    s = 0
    for n1 in n:
        s += n1
    return s

l = [10, 20, 100, 231]

r = sum(l)
print("Sum of number is",r)
