<?php
  session_start();
  
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
 
   $name = $_POST['name'];
   $username = $_POST['username'];
   $password = $_POST['password'];
   
   $user = $_POST['user'];
   $pass = $_POST['pass'];
   
   $current = " ";
   $cn = " ";
   
   $check = " ";
   
   $_SESSION['user']=$user;
   $_SESSION['listnum']=0;
?>

<!DOCTYPE html>
    <head>
        <meta charset="UTF-8" />
        <!-- <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">  -->
        <title>Keep Track, Simply</title>
		<link rel="stylesheet" href="css/style.css">
		<link rel="stylesheet" type="text/css" href="https://maxcdn.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css" />
		<link href="https://fonts.googleapis.com/css?family=Raleway:100,100i,200,200i,300,300i,400,400i,500,500i,600,600i,700,700i,800,800i,900,900i" rel="stylesheet">
		
    </head>
    <body>
        <div class="container">
            <section>
              <div style="float: left; width: 50%; padding-top: 5%; color: #fafafa; text-shadow: 0 0 5px #404040;">
                <h1 style="font-size: 80px;">Keep Track Of Your To-Do.</h1>
                <br><br>
                <h1 style="font-size: 100px;">Simply.</h1>
                <br><br><br><br><br>
                <h3 style="color: #fafafa">Created by Nicole Ortiz for IS218 Project #2</h1>
              </div>
            </section>
            <section>			
                <div id="container_demo" >
                    <a class="hiddenanchor" id="toregister"></a>
                    <a class="hiddenanchor" id="tologin"></a>
                    <div id="wrapper">
                        <div id="login" class="animate form" align="center">
                            <?php
                              $sql = "SELECT * FROM users WHERE username='$user'";
                              foreach ($db->query($sql) as $show){
                                  $current = $show['password'];
                                  $cn = $show['name'];
                              }
                              
                              if ($current == $pass) {
                                ?>
                                <meta http-equiv="refresh" content="0; URL=index.php">
                                <?php
                              }
                              else if ($current == " ") {
                                echo "<p>User Not Found</p>";
                                ?>
                                <br>
                                <a href="welcome.html">Go Back</a>
                                <?php
                              }
                              else {
                                echo "<p>Incorrect Password</p>";
                                ?>
                                <br>
                                <a href="welcome.html">Go Back</a>
                                <?php
                              }
                            ?>
                        </div>

                        <div id="register" class="animate form" align="center">
                            <?php
                                $sql = "SELECT * FROM users WHERE username='$username'";
                                foreach ($db->query($sql) as $show){
                                  $check = $show['username'];
                                }
                                
                                if($check == $username){
                                  echo "<p>That username is being used.<br>Please login or enter a new username.</p>";
                                  ?>
                                <br>
                                <a href="welcome.html">Go Back</a>
                                <?php
                                }
                                else {
                                  $sql = "INSERT INTO users (username, name, password)
                                          VALUES ('$username', '$name', '$password')";
                                  $db->exec($sql);
                                  echo "<p>Thank You For Registering</p>";
                                  ?>
                                  <br>
                                  <a href="welcome.html">Log In</a>
                                  <?php
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