Python 3.5.2 (v3.5.2:4def2a2901a5, Jun 25 2016, 22:01:18) [MSC v.1900 32 bit (Intel)] on win32
Type "copyright", "credits" or "license()" for more information.
#Nicole Ortiz
#CS 100-015
#September 7, 2016
#HW 00

#Exercise 5b
month = 12
minute = 60
year = 365

#Exercise 5c
height = 7.63
width = 2.98
length = 3.5

#Exercise 5d
badGuy = 'Voldemort'
slytherin = 'Draco'
potionsProf = 'Snape'

#Textbook Exercises:
#2.12
s1 = '-'
s2 = '+'
#a
s1 + s2
#'-+'
#b
s1 + s2 + s1
#'-+-'
#c
s2 + s1 + s1
#'+--'
#d
s2 + s1 + s1 + s2 + s1 + s1
#'+--+--'
 
#2.13
s = 'abcdefghijklmnopqrstuvwxyz'
s[0]
#'a'
s[2]
#'c'
s[25]
#'z'
s[24]
#'y'
s[16]
#'q'
 
#2.14
s = 'goodbye'
'g' == s[0]
#True
'g' == s[6]
#False
('g' == s[0]) & ('a' == s[1])
#False
'x' == s[len(s)-2]
#False
'd' == s[round(len(s)/2)-1]
#True
s[0] == s[len(s)-1]
#False
'tion' == s[len(s)-5:len(s)-1]
#False

#2.15
w1 = 'anachronistically'
w2 = 'counterintuitive'
len(w1) - len(w2)
#1
 
s = ['misinterpretation', 'misrepresentation']
s.sort()
s
#['misinterpretation', 'misrepresentation']
 
'e' in 'floccinaucinihilipilification'
#False
 
len('counterrevolution') == len('counter' + 'resolution')
#True
 
#2.16
a = 6
b = 7
c = (a+b)/2
c
#6.5
first = 'John'
middle = 'Fitzgerald'
last = 'Kennedy'
sp = ' '
fullname = first + sp + middle + sp + last
fullname
#'John Fitzgerald Kennedy'
 
