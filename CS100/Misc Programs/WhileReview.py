print("Fibonacci:")

def fibonacci(n):
    listy = [0, 1]
    var = listy[-1] + listy[-2]
    while var <= n:
        listy.append(var)
        var = listy[-1] + listy[-2]
    return listy
num = input("Enter the max number: ")
print(fibonacci(int(num)))

print(" \n") #space
print("SkipCount:")

def skipCount(maxN, by):
    listy = [by]
    var = by + by
    while var <= maxN:
        listy.append(var)
        var = var + by
    return listy
maxN = input("Enter max num: ")
by = input("Enter factor: ")
print(skipCount(int(maxN), int(by)))

print(" \n") #space


