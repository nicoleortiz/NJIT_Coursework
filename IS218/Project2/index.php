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
  
  /* Gets Username */
  $user = "Error";
  if(isset($_SESSION['user'])){ 
    $user=$_SESSION['user'];
  }
  
  /* Get Name */
  $name = " ";
  $sql = "SELECT * FROM users WHERE username='$user'";
  foreach ($db->query($sql) as $show){
    $name = $show['name'];
  }
  
  /* Get Lists */
  $lists = array();
  $count = 0;
  $sql = "SELECT * FROM lists WHERE username='$user'";
  foreach ($db->query($sql) as $show){
      $lists[$count] = $show['list'];
      $count = $count+1;
  }
  
  $listsSort = array();
  $count = 0;
  foreach ($lists as $e){
    if (!in_array($e, $listsSort)){
      $listsSort[$count] = $e;
      $count = $count+1;
    }
  }
  
  
  /* Get Completed */
  $dnums = array();
  $unums = array();
  function getComp($c){
    global $dnums, $unums;
    $dc = 0;
    $du = 0;
    for($i=0; $i<count($c); $i++){
      if($c[$i] == 1) {
        $dnums[$dc]=$i;
        $dc=$dc+1;
      }
      else {
        $unums[$du]=$i;
        $du=$du+1;
      }
    }
  }
  
  /* Specific List */ 
  $title = array();
  $message = array();
  $due = array();
  $complete = array();
  function specificList($list, $listnum){
    global $title, $message, $due, $complete, $db;
    $sql = "SELECT * FROM lists WHERE list='$list' ORDER BY due ASC";
    $count = 0;
    foreach ($db->query($sql) as $show){
      $title[$count] = $show['title'];
      $message[$count] = $show['message'];
      $due[$count] = $show['due'];
      $complete[$count] = $show['complete'];
      $count = $count+1;
    }
  }
  
  $length = count($listsSort);
?>

<!DOCTYPE html>
<html>
  <head>
    <title>Welcome</title>
		<link rel="stylesheet" href="css/style2.css">
   <link rel="stylesheet" href="https://fonts.googleapis.com/icon?family=Material+Icons">
  </head>
  <body>
    <div class="welcome">
      <p class="intro"><strong><?php echo "Welcome ".$name."!"; ?></strong></p>
    </div>
    <div class="toppanel">
      <a class="logout" href="https://web.njit.edu/~no59/subcat/IS218/Project2/welcome.html" id="l">log out</a>
    </div>
    <div class="leftpanel">
      <h3 align='center'>Lists:</h3>
      <button class='newButton' onclick='view("x")'>+ New List</button><br>
      <?php
        $count = 0;
        foreach ($listsSort as $e){
          echo "<button class='listButton' onclick='view($count)'><p>".$e."</p></button><br>";
          $count = $count+1;
        }
      ?>
    </div>
    <div class="rightpanel">
      <?php
        $count = 0;
        foreach ($listsSort as $e){
          echo "<div id='v$count' class='shows' style='display: none'>";
          $callMe = "'getList(\"$e\");'";
          echo '<dl>
                  <a onclick='.$callMe.'>
                  <div class="decor" align="center">
                    <i class="material-icons" style="font-size:36px">add</i>
                    <dt>Add New Item</dt>
                  </div>
                  </a>
                </dl>';
          echo "<dl>";
          unset($title);
          unset($message);
          unset($due);
          unset($dnums);
          unset($unums);
          specificList($listsSort[$count], $count);
          getComp($complete);
          $len = count($title);
          echo "<h3 style='padding-left: 25px;'><em>Incomplete:</em></h3>";
          foreach($unums as $i){
            echo "<div class='decor'>";
              echo "<div class='leftinfo'>";
                echo "<dt><strong>".$title[$i]."</strong></dt>";
                echo "<dd>Description: <i>".$message[$i]."</i></dd>";
                echo "<dd>Due: <i>".$due[$i]."</i></dd>";
              echo "</div>";
              echo "<div class='rightact'>";
                echo "<form action='update.php' method='post' style='width:45px;float:left'>";
                  echo "<button type='submit' name='title' value='$title[$i]' style='background: none; border: none'>";
                    echo "<i class='material-icons' style='font-size:36px'>check_box_outline_blank</i>";
                  echo "</button>";
                  echo "</form>";
                echo "<button onclick='getList2(\"$e\", \"$title[$i]\")' style='background: none; border: none'>";
                    echo "<i class='material-icons' style='font-size:36px; float:left;'>mode_edit</i>";
                echo "</button>";
                echo "<form action='delete.php' method='post' style='width:45px;float:left;'>";
                  echo "<button type='submit' name='title' value='$title[$i]' style='background: none; border: none'>";
                    echo "<i class='material-icons' style='font-size:36px'>delete</i>";
                  echo "</button>";
                echo "</form>";
              echo "</div>";
            echo "</div>";
          }
          echo "<br><h3 style='padding-left: 25px;'><em>Complete:</em></h3>";
          foreach($dnums as $i){
            echo "<div class='decor'>";
              echo "<div class='leftinfo'>";
                echo "<dt><strong>".$title[$i]."</strong></dt>";
                echo "<dd>Description: <i>".$message[$i]."</i></dd>";
                echo "<dd>Due: <i>".$due[$i]."</i></dd>";
              echo "</div>";
              echo "<div class='rightact'>";
                echo "<form action='update.php' method='post' style='width:45px;float:left'>";
                  echo "<button type='submit' name='title' value='$title[$i]' style='background: none; border: none'>";
                    echo "<i class='material-icons' style='font-size:36px'>check_box</i>";
                  echo "</button>";
                echo "</form>";
                  echo "<button onclick='getList2(\"$e\", \"$title[$i]\")' style='background: none; border: none'>";
                    echo "<i class='material-icons' style='font-size:36px; float:left;'>mode_edit</i>";
                  echo "</button>";
                echo "<form action='delete.php' method='post' style='width:45px;float:left'>";
                  echo "<button type='submit' name='title' value='$title[$i]' style='background: none; border: none'>";
                    echo "<i class='material-icons' style='font-size:36px'>delete</i>";
                  echo "</button>";
                echo "</form>";
              echo "</div>";
            echo "</div>";
          }
          echo "</dl></div>";
          $count = $count + 1;
        }
      ?>
      <div id='vedit' class='shows' style='display:none'>
        <h2>Edit Existing Entry</h2>
        <form action="edit.php" method='post'>
          <em>List:</em><br>
            <input type="text" name="listname" id="lname2" value=" " required><br>
          Title:
            <input type="text" name="title" id="tname2" value=" " required><br>
          Message:
            <input type="text" name="message" value=" "><br>
          Due:
            <input type="date" name="due" value="00/00/0000"><br>
          <input type="submit" value="Submit">
        </form>
      </div>
      <div id='vx' class='shows' style='display: none'>
        <h2>Create A New List</h2>
        <form action="newList.php" method='post'>
          <em>List Name:</em><br>
            <input type="text" name="listname" required>
          <br><br>
          <em>First Entry:</em><br>
          Title:
            <input type="text" name="title" required><br>
          Message:
            <input type="text" name="message" required><br>
          Due:
            <input type="date" name="due" required><br>
          <input type="submit" value="Submit">
        </form> 
      </div>
      <div id='vy' class='shows' style='display: none'>
        <form action="newList.php" method='post'>
          List:<br>
            <input type="text" name="listname" id="lname" value=" " required><br>
          Title:<br>
            <input type="text" name="title" required>
          <br>
          Message:<br>
            <input type="text" name="message" required>
          <br>
          Due:<br>
            <input type="date" name="due" required>
          <br>
          <input type="submit" value="Submit">
        </form> 
      </div>
      <div id='vz' class='shows' style='display: block;' align='center'>
        <h1>Welcome to your to-do lists!</h1>
        <br><br>
        <h2>To create a new list, select the option to the left.</h2>
        <h2>To view / edit a list, select the preferred list on the left</h2>
        <br><br>
        <img src="img/background.jpg" style="float:center" width="80%">
      </div>
    </div>
  </body>
  <footer align='center'>
    <p>This web application was created by Nicole Ortiz for the assignment 'Project 2' in IS218. The assignment was to create an interactive to-do list, including a login/signup screen</p>
    <a href='https://github.com/nicoleortiz'>Github</a>
    <a href='https://web.njit.edu/~no59'>Website</a>
  </footer>
</html>

<script>
  // Get List Name //
  function getList(name){
    document.getElementById("lname").value = name;
    view("y");
  }
  function getList2(name, title){
    document.getElementById("lname2").value = name;
    document.getElementById("tname2").value = title;
    view("edit");
  }

  // View Different Lists //
  function view(num){
    var myID = 'v' + num;
    var i;
					var x = document.getElementsByClassName("shows");
					for (i = 0; i < x.length; i++) {
						if (x[i].id != myID){
							x[i].style.display = "none";
						}
						if (x[i].id == myID){
							x[i].style.display = "block";
						}
					}
  }
</script>