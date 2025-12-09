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
?>
<html>
  <head>
    <title>Welcome</title>
		<link rel="stylesheet" href="css/style2.css">
  </head>
  <body>
    <?php
      $sql = "SELECT * FROM lists WHERE title='$title'";
      $current = "";
      foreach ($db->query($sql) as $show){
        $current = $show['complete'];
      }
      $sql = "";
      if ($current == 0) {
        $sql = "UPDATE lists SET complete='1' WHERE title='$title'";
      }
      if ($current == 1) {
        $sql = "UPDATE lists SET complete='0' WHERE title='$title'";
      }
      $db->exec($sql);
    ?>
    <meta http-equiv="refresh" content="0; URL=index.php">
  </body>
</html>