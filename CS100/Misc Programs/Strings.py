string = "b.a n# a* N @"

print(string.isalpha())
#isalpha() checks whether all of the characters are alphabetic

print(string.isdigit())
#isdigit() checks whether all of the characters are digits

print(string.islower())
#islower() checks whether all of the characters are lowercase

print(string.isupper())
#isupper() checks whether all of the characters are uppercase

print(string.isspace())
#isspace() checks whether all of the characters are spaces

print(string.replace('a', '@'))
#replace replaces a with b

print(string.split('a'))
#split removes (a) and seperates the string at that point

s1 = "-"
s2 = "ABC"
print(s1.join(s2))
#join puts s1 between each character of s2

print("----------")

'''
Instructions:
def fun strLength(string, short (int), long (int))
return list of words whose length will be >= short and  <= long
'''
strings = "Betty bought butter. Butter was bitter. Betty bought more butter to make the bitter butter better"
def strLength(string, short, long):
    string = string.split(" ")
    newString = ""
    for i in range(len(string)):
        if not string[i].isalpha():
            string[i] = string[i].replace('.', '')
        while len(string[i]) >= short and len(string[i]) <= long:
            newString = newString + " " + string[i]
            break
    return newString
print(strLength(strings, 3, 5))
