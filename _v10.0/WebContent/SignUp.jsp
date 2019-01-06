<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<html>
<head><title>signup</title>  
<link rel="stylesheet" href="css/signup.css">
<style>
body { 
    background-image: url('lnm.jpg');
    background-repeat: no-repeat;
    background-attachment: fixed;
    background-position: center; 
}
</style> </head>
<body>
<form action="signit" style="border:1px solid #ccc" method="post">
  <div class="container">
    <h1 style="color:white">Sign Up</h1>


    <p style="color:white">Please fill in this form to create an account.</p>
    <hr>

    <label for="email" style="color:white"><b>Email</b></label>
    <input type="text" placeholder="Enter Email" name="email" required>

    <label for="psw" style="color:white"><b>Password</b></label>
    <input type="password" placeholder="Enter Password" name="psw" required>

    <label for="psw-repeat" style="color:white"><b>Repeat Password</b></label>
    <input type="password" placeholder="Repeat Password" name="psw-repeat" required>

	
    

    <div class="clearfix">
      <button type="submit" class="signupbtn">Sign Up</button>
</a>        
    </div>
  </div>
</form>
</body>
</html>