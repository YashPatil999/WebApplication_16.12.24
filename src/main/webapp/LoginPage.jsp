<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Login Page</title>
    <style>
        body {
            margin: 0;
            padding: 0;
            background: url('Imgs/schoolBG3.jpg') no-repeat center center fixed;
            background-size: cover;
        }
        .overlay {
            position: absolute;
            top: 0;
            left: 0;
            width: 100%;
            height: 100%;
            background: rgba(0, 0, 0, 0.4);
            z-index: 1;
        }
        .container {
            position: relative;
            z-index: 2;
            background-color: #e3eae1;
            padding: 40px;
            border-radius: 10px;
            box-shadow: 0 4px 8px rgba(0, 0, 0, 0.2);
            width: 350px;
            margin-right: 100px;
            margin-left: auto;
            margin-top: 100px;
            border: 2px solid #af9b89;
        }
        h1 {
            text-align: center;
            color: #44444e;
        }
        label {
            font-weight: bold;
            color: #44444e;
        }
        input[type="text"], 
        input[type="password"] {
            width: 100%;
            padding: 10px;
            margin-top: 5px;
            margin-bottom: 20px;
            border: 1px solid #af9b89;
            border-radius: 5px;
            box-sizing: border-box;
            background-color: #e3eae1;
            color: #44444e;
        }
        input[type="submit"] {
            width: 100%;
            background-color: #af9b89;
            color: white;
            padding: 15px;
            border: none;
            border-radius: 5px;
            cursor: pointer;
            font-size: 16px;
        }
        input[type="submit"]:hover {
            background-color: #44444e;
        }
        a {
            display: block;
            text-align: center;
            margin-top: 20px;
            text-decoration: none;
            color: #af9b89;
            font-weight: bold;
        }
        a:hover {
            color: #44444e;
        }
    </style>
</head>
<body>
    <div class="overlay"></div>
    <div class="container">
        <h1>Member Login</h1>
        <form action="login" method="post">
            <label>Email</label>
            <input type="text" placeholder="Enter Email" name="email">
            
            <label>Password</label>
            <input type="password" placeholder="Enter Password" name="pass">
            
            <input type="submit" value="Submit">
        </form>
        <a href="RegisterPage.html">Don't have an account? Register here</a>
    </div>
    <script>
    
    const message = '<%= request.getAttribute("message") %>';
    
    // Show alert if message exists
    if (message && message !== "null") {
        alert(message);
    }
    </script>
</body>
</html>
