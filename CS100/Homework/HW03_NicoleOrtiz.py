#Nicole Ortiz
#September 9, 2016
#CS 100-15
#Homework 003

print("Problem 1 and 2")
a = 3
b = 4
c = 5
ok = "OK"
nok = "NOT OK"

if a < b:
    print(ok + "1")
else:
    print(nok + "1")
if c < b:
    print(ok + "2")
else:
    print(nok + "2")
if a + b == c:
    print(ok + "3")
else:
    print(nok + "3")
if a**2 + b**2 == c**2:
    print(ok + "4")
else:
    print(nok + "4")

print("\n")

print("Problem 3")
import turtle

color = input("What Colour? ")
width = input("What Line Width? ")
length = input("What Line Length? ")
shape = input("Line, Triangle, Circle, or Square? ")

width = int(width)
length = int(length)

s = turtle.Screen()
t = turtle.Turtle()

t.color(color)
t.width(width)
if ('sq') in shape[0:3]:
    for i in range(0,4):
        t.forward(length)
        t.right(90)
elif ('tri') in shape[0:4]:
    for i in range(0,3):
        t.forward(length)
        t.right(120)
elif ('li') in shape[0:3]:
    t.forward(length)
elif ('cir') in shape[0:4]:
    t.circle(length/2)
else:
    print("Invalid Shape")
