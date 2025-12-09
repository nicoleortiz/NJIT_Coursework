#Write loops from 1 to 10, printing int +1
for inte in range(1,11):
    print(inte + 1)

print("\n")

#Write loops from 0 to 10, printing int^2
for inte in range(1,11):
    print(inte * inte)

print("\n")

#Write loops from 0 to 10, printing evens
for inte in range(0, 11):
    if inte%2 == 0:
        print(inte)
    
print("\n")

#Write loops from 0 to 10, printing odds
for inte in range(0, 11):
    if inte%2 != 0:
        print(inte)

print("\n")

#Never Ending: (uncomment lines) - each loop adds to the list
lst = [1,2,3]
for item in lst:
    print(item)
    #lst.append(item+3)
    #print('lst= ', lst)

print("\n")

#1 to 100, print prime numbers- DEFINE ISPRIME IN ORDER TO WORK
for inte in range(1, 101):
    if isPrime(inte) == True:
        print(inte)
