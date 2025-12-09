'''
A
function triangle
input: turtle, length
initial position = middle of base of triangle
use a for loop
'''
'''
B
draws concentric triangles, smaller inside biggers
inputs: turtle, initial length, num, incr, distance
t, 50, 5, 2.5, 10
'''
import turtle
t = turtle.Turtle()
def triangle(t, length):
    t.down()
    t.forward(length/2)
    t.left(120)
    for i in range(2):
        t.forward(length)
        t.left(120)
    t.forward(length/2)
    
def concentricTriangle(t, initial, num, incr, distance):
    for i in range(num):
        triangle(t, initial)
        moveNext(t, distance)
        initial += incr/2
def moveNext(t, distance):
    t.up()
    t.right(90)
    t.forward(distance)
    t.left(90)
    t.down()
concentricTriangle(t, 50, 5, 2.5, 10)
