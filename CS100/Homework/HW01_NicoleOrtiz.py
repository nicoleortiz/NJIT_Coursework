#Python 3.5.2 (v3.5.2:4def2a2901a5, Jun 25 2016, 22:01:18) [MSC v.1900 32 bit (Intel)] on win32
#Type "copyright", "credits" or "license()" for more information.
"""
Nicole Ortiz
CS 100-15
HW 1, September 13, 2016
"""

print("Textbook Exercises:")
#Textbook Exercises:
print(" 2.18")
# 2.18
flowers = ['rose', 'bougainvillea', 'yucca', 'marigold', 'daylilly','lilly of the valley']
print(flowers)
#['rose', 'bougainvillea', 'yucca', 'marigold', 'daylilly', 'lilly of the valley']
print("Is 'potato' in the above list?")
#Is 'potato' in the above list?
'potato' in flowers
#False
thorny = [flowers[0], flowers[1], flowers[2]]
print(thorny)
#['rose', 'bougainvillea', 'yucca']
poisonous = [flowers[len(flowers)-1]]
print(poisonous)
#['lilly of the valley']
dangerous = [thorny, poisonous]
print(dangerous)
#[['rose', 'bougainvillea', 'yucca'], ['lilly of the valley']]

print(" 2.19")
# 2.19
answers = ['Y', 'N', 'N', 'Y', 'N', 'Y', 'Y', 'Y', 'N', 'N', 'N']
print(answers)
#['Y', 'N', 'N', 'Y', 'N', 'Y', 'Y', 'Y', 'N', 'N', 'N']
numYes = answers.count('Y')
print("numYes: " + str(numYes))
#numYes: 5
numNo = answers.count('N')
print("numNo: " + str(numNo))
#numNo: 6
percentYes = (numYes/len(answers))*100
print("percentYes:" + str(percentYes) + "%")
#percentYes:45.45454545454545%
answers.sort()
print("Sorted List: " + str(answers))
#Sorted List: ['N', 'N', 'N', 'N', 'N', 'N', 'Y', 'Y', 'Y', 'Y', 'Y']
print("First instance of 'Y': " + str(answers.index('Y')))
#First instance of 'Y': 6

print(" 2.21")
# 2.21
s = 'Ortiz'
t = 'Nicole'
print(t[0] + s[0])
#NO

print('#3')
#3
grades = ['A', 'F', 'C', 'F', 'A', 'B', 'A']
frequency = [grades.count('A'), grades.count('B'), grades.count('C'), grades.count('D'), grades.count('F')]
print("Grade List: " + str(grades))
#Grade List: ['A', 'F', 'C', 'F', 'A', 'B', 'A']
print("Frequency List: " + str(frequency))
#Frequency List: [3, 1, 1, 0, 2] 
