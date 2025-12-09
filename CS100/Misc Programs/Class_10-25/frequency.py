def frequency(lst):
    x = {}
    seen = []
    for i in lst:
        if lst[i] not in seen:
            seen.append(lst[i])
            x[lst[i]] = 1
        else:
            x[lst[i]] = x[lst[i]] + 1
    print (x)
o = open('Betty.txt', 'r')
lst = []
for i in o:
    temp = (i.split(' '))
    lst.append(temp)
frequency(lst)
print(lst)
o.close()
