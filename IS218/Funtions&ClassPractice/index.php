<?php
  /* DATABASE CONNECTION */
	$dsn = 'mysql:host=sql2.njit.edu;dbname=no59';
	$username = 'no59';
	$password = 'H4KgQWKp';
	
	try {
		$db = new PDO($dsn, $username, $password);
	}
	catch (PDOException $e) {
		$error_message = $e->getMessage();
		print 'Database Connection Error';
	}
 
  $sql = "empty";
  
  /* USER CLASS */
  class User {
      var $sql = "edit";
      function display($user){
        $this->sql = "SELECT * FROM accounts WHERE email='$user'";
      }
      function delete($user){
        $this->sql = "DELETE FROM accounts WHERE email='$user'";
      }
      function newUser($email, $fname, $lname, $phone, $birthday, $gender, $password){
        $this->sql = "INSERT INTO accounts (email, fname, lname, phone, birthday, gender, password)
                  VALUES ('$email', '$fname', '$lname', '$phone', '$birthday', '$gender', '$password')";
      }
      function updatePass($user, $pass){
        $this->sql = "UPDATE accounts SET password='$pass' WHERE email='$user'";
      }
  }
?>
<style>
  table {
    border: 2px solid blue;
  }
  td {
    text-align: center;
    width: 100px;
    border: 1px solid blue;
  }
  th {
    text-align: center;
    width: 100px;
  }
  p {
    padding-left: 325px
  }
</style>
<!DOCTYPE html>
<html>
  <body>
    <h1>Nicole Ortiz - IS218</h1>
    <h2>Functions and Class Practice</h2>
    <?php
      /* USING USER FUNCTIONS */
      $super = new User();
      $u = 'no59@njit.edu';
      
      echo "<p>Display the user's information</p>";
      $super->display($u);
      $result = "$super->sql";
      foreach ($db->query($result) as $show){
          echo "<table>
                  <tr>
                    <th>ID</th>
                    <th>Email</th>
                    <th>First</th>
                    <th>Last</th>
                    <th>Phone</th>
                    <th>Birthday</th>
                    <th>Gender</th>
                    <th>Password</th>
                  </tr>
                  <tr>
                    <td>".$show['id']."</td>
                    <td>".$show['email']."</td>
                    <td>".$show['fname']."</td>
                    <td>".$show['lname']."</td>
                    <td>".$show['phone']."</td>
                    <td>".$show['birthday']."</td>
                    <td>".$show['gender']."</td>
                    <td>".$show['password']."</td>
                  </tr>
                </table>";
       }
       
       echo "<p>Change the user's password</p>";
       $p = 'newpassword';
       $super->updatePass($u, $p);
       $result = "$super->sql";
       $db->exec($result);
       $super->display($u);
      $result = "$super->sql";
      foreach ($db->query($result) as $show){
          echo "<table>
                  <tr>
                    <th>ID</th>
                    <th>Email</th>
                    <th>First</th>
                    <th>Last</th>
                    <th>Phone</th>
                    <th>Birthday</th>
                    <th>Gender</th>
                    <th>Password</th>
                  </tr>
                  <tr>
                    <td>".$show['id']."</td>
                    <td>".$show['email']."</td>
                    <td>".$show['fname']."</td>
                    <td>".$show['lname']."</td>
                    <td>".$show['phone']."</td>
                    <td>".$show['birthday']."</td>
                    <td>".$show['gender']."</td>
                    <td>".$show['password']."</td>
                  </tr>
                </table>";
       }
       
       echo "<p>Create a new user</p>";
       $c = 'test@me';
       $super->newUser($c, 'My', 'Name', '0987654321', '2001/1/2', 'male', 'elephant');
       $result = "$super->sql";
       $db->exec($result);
       $super->display($c);
       $result = "$super->sql";
      foreach ($db->query($result) as $show){
          echo "<table>
                  <tr>
                    <th>ID</th>
                    <th>Email</th>
                    <th>First</th>
                    <th>Last</th>
                    <th>Phone</th>
                    <th>Birthday</th>
                    <th>Gender</th>
                    <th>Password</th>
                  </tr>
                  <tr>
                    <td>".$show['id']."</td>
                    <td>".$show['email']."</td>
                    <td>".$show['fname']."</td>
                    <td>".$show['lname']."</td>
                    <td>".$show['phone']."</td>
                    <td>".$show['birthday']."</td>
                    <td>".$show['gender']."</td>
                    <td>".$show['password']."</td>
                  </tr>
                </table>";
       }
       
       echo "<p>Delete a user</p>";
       $super->delete($c);
       $result = "$super->sql";
       $db->exec($result);
       $super->display($c);
       $result = "$super->sql";
      foreach ($db->query($result) as $show){
          echo "<table>
                  <tr>
                    <th>ID</th>
                    <th>Email</th>
                    <th>First</th>
                    <th>Last</th>
                    <th>Phone</th>
                    <th>Birthday</th>
                    <th>Gender</th>
                    <th>Password</th>
                  </tr>
                  <tr>
                    <td>".$show['id']."</td>
                    <td>".$show['email']."</td>
                    <td>".$show['fname']."</td>
                    <td>".$show['lname']."</td>
                    <td>".$show['phone']."</td>
                    <td>".$show['birthday']."</td>
                    <td>".$show['gender']."</td>
                    <td>".$show['password']."</td>
                  </tr>
                </table>";
       }
       echo "<p style='padding-left: 0px;'>if you refresh the page, you'll notice that the ID of test@me increases.
       This is the account being created and deleted each time the page is visited.</p>";
    ?>
  </body>
</html>