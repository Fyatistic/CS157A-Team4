<?php

session_start();
header('location:login.php');

$host = "localhost:3307"; //users host, MySQL port is set to 3307 since I have two MySQLs on my pc. 
$user = "root"; //users user
$pass = ""; //users password

$conn = mysqli_connect($host, $user, $pass) OR die('Could not connect to my sql' . $conn->connect_error);

mysqli_select_db($conn, 'aroundtheworld');


$name = $_POST['username'];
$email = $_POST['email'];
$pass = $_POST['password'];

$name = filter_var($name, FILTER_SANITIZE_STRING); //sanitize the name that was acquired
$email = filter_var($email, FILTER_SANITIZE_STRING);
$pass = filter_var($pass, FILTER_SANITIZE_STRING);

$s = " select * from signup where username = '$name'";

$result = mysqli_query($conn, $s);

$num = mysqli_num_rows($result);

if($num == 1){
    echo "Username already taken";
}else{
    $reg = " insert into signup(username, email, password) values ('$name', '$email', '$pass')";
    mysqli_query($conn, $reg);
    echo "Registration Succesfful";
}

?>