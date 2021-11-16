<?php
session_start();
if(!isset($_SESSION['username']) && !isset($_SESSION['password'])){ //can't enter the homepage without the login and password
    header('location:login.php');
}
?>

<html>
    <head>
        <title>Home Page</title>
        <link rel = "stylesheet" type="text/css" href="style.css">
    <link rel = "stylesheet" type="text/css" 
    href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css">
    </head>
        <body>

            <div class ="container">
                <a href = "logout.php" style = "float:right"> LOGOUT </a>
                <h1>Welcome <?php echo $_SESSION['username']; ?></h1>
            </div>

        </body>
</html>
