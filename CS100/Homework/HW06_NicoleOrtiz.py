#Nicole Ortiz
#CS 100 - 15
#10/11/16

#Problem 1:
def twoWords(length, firstLetter):
    first = ""
    second = ""
    while True:
        first = input("Enter a " + str(length) + "-letter word: ")
        if len(first) == length:
            break
    while True:
        second = input("Enter a word beginning with '" + firstLetter + "': ")
        if second[0].lower() == firstLetter or second[0].upper() == firstLetter:
            break
    plist = [first, second]
    return plist
print(twoWords(4, 'B'))

print(" \n")

#Problem 2:
def twoWordsV2(length, firstLetter):
    first = ""
    second = ""
    while len(first) != length:
        first = input("Enter a " + str(length) + "-letter word: ")
    firstLetter = firstLetter.lower()
    second[0] = second[0].lower()
    while second != firstLetter:
        second = input("Enter a word beginning with '" + firstLetter + "': ")
    plist = [first, second]
    return plist
print(twoWords(4, 'B'))

print(" \n")

#Problem 3: (5.29)
def lastFirst(argu):
    lastList = []
    firstList = []
    newList = []
    for i in range(len(argu)):
        for x in argu[i].split(', '):
            newList.append(x.strip())
    for y in range(len(newList)):
        if y%2 == 0:
            lastList.append(newList[y])
        else:
            firstList.append(newList[y])
    fin = [firstList, lastList]
    return fin
print(lastFirst(['Gerber, Len', 'Fox, Kate', 'Dunn, Bob']))

print(" \n")

#Problem 4: (5.33)
def mystery(n):
    count = 0
    while n != 1:
        n = n//2
        count += 1
    return count
print(str(mystery(11)))

#Problem 5:
def enterNewPassword():
    entry = input("Enter Your Password: ")
    test = 0
    while len(entry) < 8:
        entry = input("Password must be longer than 8 characters: ")
    while len(entry) > 15:
        entry = input("Password must be shorter than 15 characters: ")
    while test == 0:
        entry = input("Password must include a digit: ")
        for i in range(len(entry)):
            if entry[i].isdigit:
                test += 1    
    return ("Your password: " + entry)
print(enterNewPassword())
    
