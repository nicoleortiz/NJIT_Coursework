def pygLatin(word):
    word = word.lower()
    end = 'ay'
    lst = word.split(" ")
    nLst = []
    for i in range(0, len(lst)):
        first = lst[i][0]
        rest = ""
        for x in range(1, len(lst[i])):
            rest = rest + lst[i][x]
        nLst.append(rest + first + end)
    final = ''
    for z in range(len(nLst)):
        final = final  + nLst[z] + " "
    return final

inpu = input("Enter Text: ")
print(pygLatin(inpu))
