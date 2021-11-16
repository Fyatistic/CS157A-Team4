<html>

<head>
    <title>User Login And Registration </title>
<link rel = "stylesheet" type="text/css" href="style.css">
    <link rel = "stylesheet" type="text/css" 
    href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css">
</head>
<body>
    <div class = "container">

        <div class="login-box login-left">
        <div class ="row">

            <div class ="col-md-6">
                <h2> Login Here </h2>
                <form action = "validation.php" method = "post">
                    <div class = "form-group">
                        <label>Username</label>
                        <input type = "text" name="username" class="form-control" required>
                    </div>
                    <div class = "form-group">
                       <br> Password: <input type = "password" name="password" class="form-control" required></br>
                    </div> 
                    <button type="submit" class="btn btn-primary"> Login </button>
                    <p>Don't have an account? <a href ="register.php"> <br> Sign up Here</a></br></p>
                </form>
            </div>

        </div>
        </div>

    </div>
    
</body>
</html>
