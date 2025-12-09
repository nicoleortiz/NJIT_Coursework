string = "g fmnc wms bgblr rpylqjyrc gr zw fylb. rfyrq ufyr amknsrcpq ypc dmp. bmgle gr gl zw fylb gq glcddgagclr ylb rfyr'q ufw rfgq rcvr gq qm jmle. sqgle qrpgle.kyicrpylq() gq pcamkkclbcb. lmu ynnjw ml rfc spj."
answer = string.maketrans("koe", "mqg")
print(answer)

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
o = open('suffering.txt', 'r')
lst = []
for i in o:
    lst.append(i.split())
#frequency(lst)
print(lst)
o.close()
