'''
Nicole Ortiz
CS 100 - 15
HW08 : Files
October 20, 2016
'''

#Problem 1: 4.27
def fcopy(file1, file2):
    o = open(file1, 'r')
    c = open(file2, 'w')
    c.write(o.read())
    o.close()
    c.close()

file = input('Input Original File Name: ')
    #FileTest
name = input('Enter Name Of Copy File: ')
    #FileTest2
fcopy(file, name)

print("\n")

#Problem 2: 4.29
def stats(text):
    lines = 0
    words = 0
    characters = 0
    o = open(text, 'r')
    for i in o:
        lines += 1
        words += len(i.split(' '))
        characters += len(i)
    o.close()
    return "Lines: " + str(lines) + "\nWords: " + str(words)+ "\nCharacters: " + str(characters)
file = input('Input File Name: ')
print(stats(file))

#Problem 3:
import string
def repeatWords(inputFile, outputFile):
    o = open(inputFile, 'r') #Reading File
    r = open(outputFile, 'w') #New File
    for i in o: #for each line in inputFile
        i = i.lower() #sets all to lowercase
        i = i.strip() #removes excess
        s = i.split(' ') #creates list of the words
        seen = []
        prints = []
        for w in s: #for each word in s list
            for p in string.punctuation: #for each symbol in string
                w = w.replace(p, "") #removes punctuation
            if w in seen and w not in prints: #check if word has been viewed
                prints.append(w)
                seen.append(w)
            else: #first of its kind, add to seen
                seen.append(w)
        for y in prints: #prints all the words
            r.write(y + " ")
        r.write("\n")
    o.close()
    r.close()
file = input('Input File Name: ')
name = input('Enter Name of Result File: ')
repeatWords(file, name)
        
