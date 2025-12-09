# IT635_Midterm

Hi! These are the steps I took to make this

1. Switch into postgres
sudo -u postgres psql

2. Create database NOmidterm
CREATE DATABASE NOmidterm;

3. Create a User
CREATE USER itmidterm WITH PASSWORD 'midterm';
GRANT ALL PRIVILEGES ON DATABASE nomidterm TO itmidterm;

Logging in as user:
  psql postgres://itmidterm:midterm@localhost:5432/nomidterm

4. Get the files
wget https://raw.githubusercontent.com/nicoleortiz/IT635_Midterm/main/NO_Tables.sql
wget https://raw.githubusercontent.com/nicoleortiz/IT635_Midterm/main/NO_db.py

5. Run the SQL file
sudo psql itmidterm -h 127.0.0.1 -d nomidterm -f NO_Tables.sql

6. Run the python script
python3 ./NO_db.py
