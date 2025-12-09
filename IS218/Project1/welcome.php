<?php
	/*PART ONE*/
	$dsn = 'mysql:host=sql2.njit.edu;dbname=no59';
	$username = 'no59';
	$password = 'H4KgQWKp';
	
	try {
		$db = new PDO($dsn, $username, $password);
	}
	catch (PDOException $e) {
		$error_message = $e->getMessage();
		echo 'Database Connection Error';
	}
 
   $fname = $_POST['fname'];
   $lname = $_POST['lname'];
   $email = $_POST['email'];
   $phone = $_POST['phone'];
   $birthday = $_POST['birthday'];
   $gender = $_POST['gender'];
   $password = $_POST['password'];
   
   $emaillog = $_POST['emaillog'];
   $passwordlog = $_POST['passwordlog'];
   
   $current = " ";
   $cfn = " ";
   $cln = " ";
   
   $check = " ";
?>

<!DOCTYPE html>
    <head>
        <meta charset="UTF-8" />
        <!-- <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">  -->
        <title>Welcome Bands</title>
		<link rel="stylesheet" href="css/style2.css">
		<link rel="stylesheet" type="text/css" href="https://maxcdn.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css" />
		<link href="https://fonts.googleapis.com/css?family=Raleway:100,100i,200,200i,300,300i,400,400i,500,500i,600,600i,700,700i,800,800i,900,900i" rel="stylesheet">
		
    </head>
    <body>
        <div class="container">
           
            <header>
				<img src="img/logo.png" width="100px">
				<br/>
            </header>
            <section>			
                <div id="container_demo" >
                    <a class="hiddenanchor" id="toregister"></a>
                    <a class="hiddenanchor" id="tologin"></a>
                    <div id="wrapper">
                        <div id="login" class="animate form" align="center">
                            <?php
                              $sql = "SELECT * FROM accounts WHERE email='$emaillog'";
                              foreach ($db->query($sql) as $show){
                                  $current = $show['password'];
                                  $cfn = $show['fname'];
                                  $cln = $show['lname'];
                              }
                              
                              if ($current == $passwordlog) {
                                echo "<p>Hello ".$cfn." ".$cln."!</p><br>";
                                echo "<p>Welcome to Aweless Agencies</p>";
                              }
                              else if ($current == " ") {
                                echo "<p>Email Not Found</p>";
                              }
                              else {
                                echo "<p>Incorrect Password</p>";
                              }
                            ?>
                        </div>

                        <div id="register" class="animate form" align="center">
                            <?php
                                $sql = "SELECT * FROM accounts WHERE email='$email'";
                                foreach ($db->query($sql) as $show){
                                  $check = $show['email'];
                                }
                                
                                if($check == $email){
                                  echo "<p>That email is being used.<br>Please login or enter a new email.</p>";
                                }
                                else {
                                  $sql = "INSERT INTO accounts (email, fname, lname, phone, birthday, gender, password)
                                          VALUES ('$email', '$fname', '$lname', '$phone', '$birthday', '$gender', '$password')";
                                  $db->exec($sql);
                                  echo "<p>Thank You For Registering</p>";
                                }
                            ?>
                        </div>
                    </div>
                </div>  
            </section>
        </div>
    </body>
</html>
<?php
  $db = null;
?>