'''
Nicole Ortiz
8 December 2016
CS100 Spring 2016 Final
'''

'''
Multiple Choice
1) A
2) D
3) E
4) D
5) B
6) D
7) A
8) B
9) B
10) C
'''

'''
#Question 11
def midline(t, length):
    t.down()
    t.forward(length/2)
    t.backward(length)
    t.up()
    t.forward(length/2)
def starburst(t, num, init, delta, angle):
    midline(t, init)
    num -= 1
    length = init
    while num > 0:
        midline(t, length*delta)
        t.left(angle)
        length = length*delta
        num -= 1
import turtle
t = turtle.Turtle()
t.left(45)
starburst(t, 7, 50, 1.2, 20)
'''

#Question 12
'''
num = 0
test = True
def mostFrequent(t):
    string = ""
    i = open(inFile, 'r')
    o = open(outFile, 'w')
    charsList = []
    dict = {}
    for line in i:
        charsList = list(t.strip())
        for char in charsList:
            if char not in dict:
                dict[char] = 1
            elif char in dict:
                dict[char] += 1
        if ' ' in dict:
            del dict[' ']
        string += maxNumInDict(dict)
        o.write(string + "\n")
        string = ""
    i.close()
    o.close()
def maxNumInDict(d):
    values = list(d.values())
    keys = list(d.keys())
    num = max(values)
    if d[max(d)] == num:
        del d[max(dict)]
        maxNumInDict[d]
    return keys[values.index(max(values))]
'''

#Question 13
'''
def longEnough(s, threshold):
    if len(s) >= threshold:
        return True
    return False
def longWords(t, i):
    words = t.split(' ')
    
    dict = {}
    for word in words:
        if longEnough(word, i):
            if word not in dict:
                dict[word] = 1
            if word in dict:
                dict[word] += 1
    print(dict)
longWords("one fish two fish red fish blue fish", 4)
'''
