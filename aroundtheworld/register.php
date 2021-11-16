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
                <h2> Register Here </h2>
                <form action = "registration.php" method = "post">
                    <div class = "form-group">
                        Username <input type = "text" name="username" class="form-control" required>
                    </div>
                    <div class = "form-group">
                        Email <input type = "email" name="email" class="form-control" required>
                    </div> 
                    <div class = "form-group">
                        Password <input type = "password" name="password" class="form-control" required>
                    </div> 
                    <br>
                    <button type="submit" class="btn btn-primary"> Register </button>
                    </br>
                    <p>Already have an account? <a href ="login.php"> Login Here</a></p>
                </form>
            </div>
        </div>
        </div>
    </div>
</body>
</html>
