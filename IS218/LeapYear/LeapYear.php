<?php
$date =  date('Y/m/d', time());
echo "The value of $date: ".$date."<br>";

$tar = "2017/05/24";
echo "The value of $tar: ".$tar."<br>";

echo "---<br>";

if ($date > $tar) {
   echo "The Future";
} 
else if ($date < $tar) {
   echo "The Past";
} 
else {
   echo "Oops";
}

echo "<br>--- <br>";

echo "Spots containing '/' in \$date: ";
$needle = "/";
$lastPos =0;
$positions = array();
while (($lastPos = strpos($date, $needle, $lastPos))!== false) {
    $positions[] = $lastPos;
    $lastPos = $lastPos + strlen($needle);
}
foreach ($positions as $value) {
    echo $value ." ";
}

echo "<br>--- <br>";

echo "Number of words in \$date: " . str_word_count($date);

echo "<br>---<br>";

$str = "a string";
echo "Length: " . strlen($str);

echo "<br>---<br>";

$str2 = "another string";
echo "ASCII Value: " . ord($str2);

echo "<br>---<br>";

echo "Last two chars in \$date: " . substr($date, -2);

echo "<br>---<br>";

echo "\$date: ";
$arr = explode("/",$date);
$i =0;
foreach ($arr as $piece){
	echo $piece . " ";
}

echo "<br>---<br>";

echo "Leap Years: ";
$year = array("2012", "396", "300","2000", "1100", "1089");
foreach ($year as $try){
	switch (($try%4 == 0) && (($try%100 > 0) || ($try%400 == 0))){
		case true:
			echo $try . " ";
			break;
		case false:
			break;
		default:
			break;
	}
}
?>