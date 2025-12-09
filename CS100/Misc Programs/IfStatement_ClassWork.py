#What are we drinking today?
intro = "Today you will drink "
today = input("What day is today? \n")
if 'Mon' in today:
    print(intro + "tea")
elif 'Tues' in today:
    print(intro + "coffee")
elif 'Wed' in today:
    print(intro + "apple juice")
elif 'Thurs' in today:
    print(intro + "a milkshake")
elif 'Fri' in today:
    print(intro + "hot cocoa")
else:
    print(intro + "whatever you like")
