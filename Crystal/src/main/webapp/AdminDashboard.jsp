<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ include file="commonHeaderAdminLogin.jsp"%>
<!DOCTYPE html>
<html>

<head>
<link rel="stylesheet" type="text/css" href="style/AdminDashboard.css">
  <title>Admin DashBoard</title>
</head>

<body>

  <div class="welcomeMessage">
    <h1>WELCOME &nbsp;&nbsp;${requestScope.username}
    </h1>

  </div>

  <h5>To improve is to change; to be perfect is to change often.</h5>
  <span class="options">
    <ul>
      <div class=clickme><a href="RegisterAdmin.jsp">
          <li>Add new member</li>
        </a></div>
      <br>
      <div class=clickme><a href="#">
          <li>Add Product</li>
        </a></div><br>
      <div class=clickme> <a href="#">
          <li>Update Existing Product</li>
        </a>
      </div>
    </ul>
  </span>

</body>

</html>