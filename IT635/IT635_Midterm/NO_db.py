import psycopg2

def getInfo(c, s, i):
    ii = str(i)
    if (s == 1):
        c.execute("SELECT * FROM employees WHERE employee_id=" + ii + ";")
    if (s == 2):
        c.execute("SELECT * FROM employees WHERE department_id=" + ii + ";")
    if (s == 3):
        c.execute("SELECT * FROM employees WHERE title_id=" + ii + ";")

conn = psycopg2.connect("postgresql://itmidterm:midterm@localhost/nomidterm")
cur = conn.cursor()

print("Find an employee by ID(1), Department(2), or Title(3)")
selection = int(input())
eid = 0
if (selection == 1):
    print("Please enter an employee ID")
    eid = int(input())
if (selection == 2):
     print("Please enter a Department ID")
     print("1. Accounting \n2. HR \n3. Marketing \n4. IT \n5. Development")
     eid = int(input())
if (selection == 3):
     print("Please enter a Title ID")
     print("1. Executive \n2. Manager \n3. Supervisor \n4. Intern \n5. Employee")
     eid = int(input())
getInfo(cur, selection, eid)
print(f"Employee: " + str(cur.fetchone()[1]))
conn.commit()

cur.close()
conn.close()