'''
Nicole Ortiz
6 December 2016
CS Final 2015 Spring Practice
'''

'''
Multiple Choice
1) B - pay attention to what the dictionary is: aDict[NUM] = LETTER
2) A - s1[0:0] = '', which is in s2 bc s2[0:0]
3) A - 1:len-1 2:len-2 3:len-3 if same, return
4) D - ????
5) B - D: first indicated what key to go to
6) E - 4:1 4:2 2:1 5:1 5:2 5:3 = 4:2 2:1 5:3 = 3
7) D - follow the orders
8) C - FTTTF
9) C - 0(forward100, turn120)(forward100, turn120) 1(forward100, turn120)
10) D - len(fishLine)=8, 0<8: len(indx)=3 +5, 5<8: len(indx)=4 +1, 6<8: len(indx)=4 +1, 7<8: len(indx)=4 +1, 8<8 false indx=8
'''

#Question 11
def capT(turt, height):
    turt.down()
    turt.left(90)
    turt.forward(height)
    turt.right(90)
    turt.forward(height/4)
    turt.backward(height/2)
    turt.up()
    turt.forward(height/4)
    turt.left(90)
    turt.backward(height)
    turt.right(90)
def tRow(t, num, init, ratio):
    capT(t, init)
    last = init
    while num > 0:
        t.backward(last/2)
        last = last * ratio
        capT(t, last)
        num = num -1
import turtle
t = turtle.Turtle()
tRow(t, 3, 40, 1.5)

#Question 12
'''
def fileStats(inFile, outFile):
    import string
    charsList = []
    wordList = []
    characters = 0
    words = 0
    lines = 0
    digits = 0
    punc = 0
    i = open(inFile, 'r')
    o = open(outFile, 'w')
    for x in i:
        lines += 1
        words += len(x.split(' '))
        characters += len(x)
        charsList.append(list(x.strip()))
        if i[x].isnumeric():
            digits += 1
        if not i[x].isnumeric() and not i[x].isalpha() and not i[x].isspace():
            punc += 1
    i.close()
    o.close()
    print(characters, words, lines, digits, punc)
    print("\n")
    print(charsList)
fileStats("in.txt", "out.txt")
'''

#Question 13
'''
def symmetry(text):
    d ={}
    word = text.split(' ')
    for i in range(len(word)):
        if word[i][0] == word[i][len(word[i])-1]:
            if word[i][0] not in d:
                d[word[i][0]] += 1
            else:
                d[word[i][0]] = 1
    return d
t =  "The sun did not shine it was too wet to play so we sat in the house all that cold cold wet day I sat there with Sally we sat there we two and I said how I wish we had something to do"
print(symmetry(t))
'''
