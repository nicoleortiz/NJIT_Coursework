def WholeSquare(x,y):
    c = x**2 + y**2 + 2*x*y
    return c

x = int(input("Enter first int: "))
y = int(input("Enter second int: "))
print(WholeSquare(x,y))

print("\n")

def Welcome(f, l):
    print( "Welcome to the class " + f + " " + l)

first = input("First Name: ")
last = input("Last Name: ")
Welcome(first, last)
