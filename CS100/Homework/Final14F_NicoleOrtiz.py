'''
Nicole Ortiz
CS 100 2014 Fall
December 13, 2016
'''

'''
Multiple Choice
1) B
2) A
3) D
4) B
5) A
6) C
7) E
8) D
9) B
10) E
'''

#Question 11
import turtle
t = turtle.Turtle()
def equiTri(t, size):
    num = 2
    while num >=0:
        t.forward(size)
        t.left(120)
        num -=1
def bumps(t, num, init, delta):
    length = init
    while num > 0:
        equiTri(t, length)
        t.forward(length)
        length = length+delta
        num-=1
t.left(15)
bumps(t, 3, 40, 20)


#Question 12
def repeatWords(inpu, outpu):
    i = open(inpu, 'r')
    o = open(outpu, 'w')
    d = {}
    for line in i:
        line.strip()
        wordlist = line.split(" ")
        for word in wordlist:
            if word not in d:
                d[word] = 1
            if word in d:
                d[word] += 1
    for key, value in d.items():
        o.write(str(key) + " " + str(value) + "\n")
repeatWords("FileTest.txt", "output.txt")


#Question 13
def vowelCount(s):
    vowels = ['A', 'E', 'I', 'O', 'U', 'a', 'e', 'i', 'o', 'u']
    count = 0
    for letter in s:
        if letter in vowels:
            count += 1
    return count
def manyVowels(t, i):
    d = {}
    t.strip()
    wordlist = t.split(" ")
    for word in wordlist:
        if vowelCount(word) >= i:
            d[word] = vowelCount(word)
    return d
text = "they are endowed by their creator with certain unalienable rights"
print(manyVowels(text, 3))
        
