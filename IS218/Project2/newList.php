<?php
  session_start();
  
	$dsn = 'mysql:host=sql2.njit.edu;dbname=no59';
	$username = 'no59';
	$password = 'H4KgQWKp';
	
	try {
		$db = new PDO($dsn, $username, $password);
	}
	catch (PDOException $e) {
		echo 'Database Connection Error';
	}
 
  $list = $_POST['listname'];
  $title = $_POST['title'];
  $message = $_POST['message'];
  $due = $_POST['due'];
  
  /* Gets Username */
  $user = "Error";
  if(isset($_SESSION['user'])){ 
    $user=$_SESSION['user'];
  }
?>
<html>
  <body>
    <?php
    $sql = "INSERT INTO lists (username, list, title, due, message, complete)
          VALUES ('$user', '$list', '$title', '$due', '$message', '0')";
          
    $db->exec($sql);
    ?>
    <meta http-equiv="refresh" content="0; URL=index.php">
  </body>
</html