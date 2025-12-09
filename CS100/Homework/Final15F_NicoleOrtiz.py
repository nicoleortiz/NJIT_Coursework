'''
Nicole Ortiz
December 1, 2016
2015 Fall Final
'''

'''
Multiple Choice
1) A
2) E
3) B
4) D
5) C
6) A
7) B
8) C
9) E
10) D
'''

#Question 11
import turtle
t = turtle.Turtle()
def tri(t, sideLen):
    c=3
    while c > 0:
        t.forward(sideLen)
        t.left(120)
        c = c-1
def tris(t, initial, incr, num, angle):
    for n in range(num):
        sideLen = initial + (n*incr)
        tri(t, sideLen)
        t.left(angle)
tris(t, 20, 50, 5, 60)

#Question 12
'''
def wordsByLine(inFile, outFile):
    i = open(inFile, 'r')
    o = open(outFile, 'w')
    seen = {}
    for line in i:
        ll = line.split(' ')
        for word in ll:
            if ll[word] not in seen:
                seen[ll[word]] = 1
            else:
                seen[ll[word]] = seen[word] + 1
    o.write(seen)
    o.close()
    i.close()
wordsByLine('FileTest.txt', 'Result.txt')
'''

#Question 13
def lineIndex(fName):
    d = {}
    f = open(fName, 'r')
    count = 0
    for line in f:
        count = count+1
        line = line.strip()
        words = line.split(' ')
        for w in words:
            if w not in d:
                d[w] = [count]
            else:
                if count in d[w]:
                    continue
                else:
                    d[w].append(count)
    print(d)
lineIndex('FileTest.txt')
