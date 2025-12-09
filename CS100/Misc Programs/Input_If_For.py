#Exercise A
age = input("Age: ")
if age >= 18:
    print("Adult\n")
else:
    print("Child\n")

#Exercise B
report = "There will be large bonuses given to the following:"
if 'large bonuses' in report:
    print("Vacation Time\n")

#Exercise C
hit = 12
shield = 0
if hit > 10 and shield == 0:
    print("You're dead\n")

#Else Ifs
fruit = input('Type banana: ')
if fruit[0] == 'b' and fruit[2] == 'n':
    print("Banana!\n")
else:
    print("Nope. Try Again.\n")

#For Loops
for i in range(0,3):
    print("hi", end=" ")

print("\n")

#Find in Section of String
test = "another turning point a fork stuck in the road"
if 'another' in test[0:15]:
    print("Good Riddance")
else:
    print("I Dunno")

print("\n")

#Combined Functions:
for i in range(0,7):
    name = input('Enter Name: ')
    if name[0:6] == 'nicole':
        print("Bored")
    elif name[0:5] == 'wendy':
        print("Crazy")
    elif name[0:4] == 'adel':
        print("Loveable Weirdo")
    elif name[0:3] == 'kev':
        print("Amazing")
    elif name[0:2] == 'ja':
        print("Babe")
    elif name[0] == 'd':
        print("Fav Nerd")
    else:
        print("Don't care.")
