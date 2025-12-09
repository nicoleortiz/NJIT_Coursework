var = 0
def learnMath():
        print("MENU:")
        learn = input("Choice 1: to add \nChoice 2: to subtract \nChoice 3: to multiply \nChoice 4: to divide \nChoice 5: Exit\n")
        learn = int(learn)
        if learn == 1:
            var = 1
            add()
        if learn == 2:
            var = 2
            subtract()
        if learn == 3:
            var = 3
            multiply()
        if learn == 4:
            var = 4
            divide()
        if learn == 5:
            quit()
            
def checkAns(c, i):
    if c == i:
        print("Correct")
    else:
        print("Incorrect")
    inp = input("Try Another? (Y/N) ")
    if inp == "Y" or inp == "y":
        if var == 1:
            add()
        if var == 2:
            subtract()
        if var == 3:
            multiply()
        if var == 4:
            divide()
    if inp == "N" or inp == "n":
        print("\n")

from random import randint
def add():
    a = randint(0, 100)
    b = randint(0, 100)
    c = a + b
    i = input(str(a) + " + " + str(b) + "= ")
    i = int(i)
    print(str(c))
    print(str(i))
    checkAns(c, i)

def subtract():
    
learnMath()
