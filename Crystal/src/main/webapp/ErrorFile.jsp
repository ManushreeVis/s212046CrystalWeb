<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>

<head>
  <title>Error Found</title>
  <link rel="stylesheet" type="text/css" href="style/ErrorFile.css"></link>
</head>

<body>
  <h1>Oops! Something went wrong!</h1>
  <!-- Can be every error you want -->
  <h2> ${requestScope.errorInfo}</h2>
</body>

</html>