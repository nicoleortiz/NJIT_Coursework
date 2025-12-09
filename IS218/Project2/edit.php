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
 
  $title = $_POST['title'];
  $message = $_POST['message'];
  $due = $_POST['due'];
?>
<html>
  <head>
    <title>Welcome</title>
		<link rel="stylesheet" href="css/style2.css">
  </head>
  <body>
    <?php
        if($message == " "){
          if($due != 00/00/0000){
            $sql = "UPDATE lists SET due='$due' WHERE title='$title'";
          }
        }
        else {
          $sql = "UPDATE lists SET message='$message' WHERE title='$title'";
        }
      $db->exec($sql);
    ?>
    <meta http-equiv="refresh" content="0; URL=index.php">
  </body>
</html>