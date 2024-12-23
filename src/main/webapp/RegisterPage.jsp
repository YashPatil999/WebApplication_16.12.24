<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
  <head>
    <meta charset="UTF-8" />
    <title>Registration Form</title>
    <style>
      body {
        font-family: Arial, sans-serif;
        background-color: #f2f2f2;
        display: flex;
        justify-content: center;
        align-items: center;
        /* height: 100vh; */
        margin: 0;
		
      }
      .container {
        background-color: #fff;
		padding: 10px 25px 20px 25px;
		margin: 30px;
        border-radius: 10px;
        box-shadow: 0 4px 8px rgba(0, 0, 0, 0.1);
        width: 700px;
        display: flex;
        flex-wrap: wrap;
      }
      h1 {
        text-align: center;
        width: 100%;
        color: #fd66d0;
      }
      .form-section {
        width: 50%;
        padding: 10px;
        box-sizing: border-box;
      }
      label {
        font-weight: bold;
        color: #fd66d0;
      }
      input[type="text"],
      input[type="number"],
      input[type="date"],
      input[type="password"],
      textarea {
        width: 100%;
        padding: 10px;
        margin-top: 5px;
        margin-bottom: 20px;
        border: 1px solid #ccc;
        border-radius: 5px;
        box-sizing: border-box;
      }
      input[type="radio"] {
		margin: 4.5%;
        margin-right: 5px;
      }
      input[type="submit"] {
        width: 100%;
        background-color: #ffc2ed;
        color: white;
        padding: 15px;
        border: none;
        border-radius: 5px;
        cursor: pointer;
        font-size: 16px;
		font-weight: bold;
      }
      input[type="submit"]:hover {
        background-color: #fd66d0;
      }
      a {
        display: block;
        text-align: center;
        margin-top: 20px;
        text-decoration: none;
        color: #fd66d0;
        font-weight: bold;
        width: 100%;
      }
      a:hover {
        text-decoration: underline;
      }
      #regifom {
        display: flex;
      }
      #div2 {
        display: flex;
        flex-direction: column;
        justify-content: space-between;
      }
    </style>
  </head>
  <body background="Imgs/schoolBG.jpg">
    <div class="container">
      <h1>Registration Form</h1>
      <form action="register" method="post">
        <div id="regifom">
          <div class="form-section">
            <label>First Name</label>
            <input
              type="text"
              placeholder="Enter First Name"
              name="fname"
            />

            <label>Last Name</label>
            <input type="text" placeholder="Enter Last Name" name="lname" />

            <label>Gender</label><br />
            <input type="radio" value="Male" name="gender" /> <label>Male</label>
            <input type="radio" value="Female" name="gender" />
            <label>Female</label><br /><br />

            <label>Age</label>
            <input type="number" name="age" />

            <label>Date of Birth</label>
            <input type="date" name="dob" />

            <label>Address</label>
            <input type="text" placeholder="Enter Address" name="address" />

            <label>City</label>
            <input type="text" placeholder="Enter City" name="city" />
          </div>
          <div class="form-section" id="div2">
            <label>State</label>
            <input type="text" placeholder="Enter State" name="state" />

            <label>Country</label>
            <input type="text" placeholder="Enter Country" name="country" />

            <label>Mobile Number</label>
            <input type="number" name="mnumber" />

            <label>Degree</label>
            <input type="text" placeholder="Enter Degree" name="degree" />

            <label>Passing Year</label>
            <input type="number" name="pyear" />

            <label>Email</label>
            <input type="text" placeholder="Enter Email" name="email" />

            <label>Password</label>
            <input
              type="password"
              placeholder="Enter Password"
              name="password"
            />
          </div>
        </div>
        <div class="form-section" style="width: 100%">
          <input type="Submit" value="Submit" />
          <a href="LoginPage.html">Returning User? Sign In</a>
        </div>
      </form>
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
