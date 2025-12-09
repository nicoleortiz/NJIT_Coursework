<?php
	/*PART ONE*/
	$dsn = 'mysql:host=localhost;dbname=accounts';
	$username = 'hello';
	$password = 'pass';
	
	try {
		$db = new PDO($dsn, $username, $password);
		echo 'Connected Successfully<br/>';
	}
	catch (PDOException $e) {
		$error_message = $e->getMessage();
		echo '$error_message </br>';
	}
?>
<html>
	<body>
		<?php
			/*PART TWO*/
			$query = 'SELECT * 
				FROM accounts
				WHERE id < :id';
			$statement = $db->prepare($query);
			$statement->bindValue(':id', $id);
			$statement->execute();
			$accounts = $statement->fetchAll();
			$statement->closeCursor();
			
			/*PART THREE */
			$count = 0;
			foreach($accounts as $acc){
				if($accounts['id'] <= 6){?>
				<table>
					<tr>
						<td>
							<?phpecho $accounts['id'];?>
						</td>
						<td>
							<?phpecho $accounts['email'];?>
						</td>
						<td>
							<?phpecho $accounts['fname'];?>
						</td>
						<td>
							<?phpecho $accounts['lname'];?>
						</td>
						<td>
							<?phpecho $accounts['phone'];?>
						</td>
						<td>
							<?phpecho $accounts['birthday'];?>
						</td>
						<td>
							<?phpecho $accounts['gender'];?>
						</td>
						<td>
							<?phpecho $accounts['password'];?>
						</td>
					</tr>
				</table>
					<?phpcount++;
				}
			}
			echo 'Results: $count <br/>';
		?>
	</body>
</html>