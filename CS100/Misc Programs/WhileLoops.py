#Basic While Loop
'''
i = 0
while i <=4:
    i+=1
print(str(i))
'''

#Continuous Asking
def isPositive(integer):
    while(integer >= 0):
        integer = askInt()
    return str(integer)

def askInt():
    integer = input('Enter a negative integer: ')
    return int(integer)

print(isPositive(askInt()))


