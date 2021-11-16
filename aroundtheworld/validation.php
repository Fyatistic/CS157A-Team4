<?php

session_start();

$host = "localhost:3307"; //users host, MySQL port is set to 3307 since I have two MySQLs on my pc. 
$user = "root"; //users user
$pass = ""; //users password

$conn = mysqli_connect($host, $user, $pass) OR die('Could not connect to my sql' . $conn->connect_error);

mysqli_select_db($conn, 'aroundtheworld');


$name = $_POST['username'];
$pass = $_POST['password'];

$name = filter_var($name, FILTER_SANITIZE_STRING); //sanitize the name that was acquired
$pass = filter_var($pass, FILTER_SANITIZE_STRING);

$s = " select * from signup where username = '$name' AND password = '$pass'";

$result = mysqli_query($conn, $s);

$num = mysqli_num_rows($result);

if($num == 1){
    $_SESSION['username'] = $name;
    header('location:homepage.php');
}
else{
    header('location:login.php');
    Echo "Incorrect Username or Password";
}

?>
