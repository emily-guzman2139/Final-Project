
<?php
  /**
  * Requires the "PHP Email Form" library
  * The "PHP Email Form" library is available only in the pro version of the template
  * The library should be uploaded to: vendor/php-email-form/php-email-form.php
  * For more info and help: https://bootstrapmade.com/php-email-form/
  */
  
  //FROM https://www.w3schools.com/php/php_mysql_insert.asp
  
  $servername = "localhost";
  $username = "root";
  $password = "root";
  $dbname = "restaurant_db";
  
  // Create connection
  $conn = mysqli_connect($servername, $username, $password, $dbname);
  // Check connection
  if (!$conn) {
    die("Connection failed: " . mysqli_connect_error());
	
	$name = $_POST['name'];
	$email = $_POST['email'];
	$phone = $_POST['phone'];
	$booking_date = $_POST['booking_date'];
	$booking_time = $_POST['booking_time'];
	$num_of_guest = $_POST['num_of_guest'];
	
	
	$sql = "INSERT INTO customers (name, email, phone, booking_date, booking_time, num_of_guest)
	VALUES ('$name', '$email', '$phone', '$booking_date', $booking_time', '$num_of_guest')";
	
	if (mysqli_query($conn, $sql)) {
	  echo "New record created successfully";
	} else {
	  echo "Error: " . $sql . "<br>" . mysqli_error($conn);
	}

	mysqli_close($conn);
	?>
	
	
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  //FROM https://www.w3schools.com/angular/angular_sql.asp
  /*
  header("Access-Control-Allow-Origin: *");
  header("Content-Type: application/json; charset=UTF-8");

  
  $conn = new mysqli("localhost", "root", "root", "restaurant_db");

  $result = $conn->query("SELECT id, name, email, phone, booking_date, booking_time, num_of_guest FROM customer");

  $outp = "";
  while($rs = $result->fetch_array(MYSQLI_ASSOC)) {
    if ($outp != "") {$outp .= ",";}
    $outp .= '{"ID":"'    . $rs["id"]                . '",';
    $outp .= '"Name":"'   . $rs["name"]              . '",';
    $outp .= '"Email":"'  . $rs["email"]             . '"}';
	$outp .= '"Phone":"'  . $rs["phone"]             . '"}';
	$outp .= '"BookingDate":"' . $rs["booking_date"] . '"}';
	$outp .= '"BookingTime":"' .$rs["booking_time"]  . '"}';
	$outp .= '"NumOfGuest":"' .$rs["num_of_guest"]   .'"}';
  }
  $outp ='{"records":['.$outp.']}';
  $conn->close();

  echo($outp);
  */
  
  
  
  

  // Replace contact@example.com with your real receiving email address
  
  

