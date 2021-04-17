<%@page import="java.awt.event.ItemEvent"%>
<%@page import="dao.ProductDao"%>
<%@page import="model.Product" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ include file="commonHeaderProducts.jsp" %>
<!DOCTYPE html>
<html>
<head>
<title>Products</title>
</head>
<body>
<%
try{
ProductDao pd = new ProductDao();
Product[] prodArr = pd.returnProduct();
if(prodArr.length==0){
%>
<div class="disp">No Products Available!</div>
<%
}
else{
	for(Product item:prodArr){
		%>
		<div class="grid-container">
		<div class="grid-item">
		<div class="imgtable">
		<table>
		<tr><img src="<%item.getPfilename();%>"></tr>
		</table>
		<table class="datatable">
		<tr><td><% item.getPname();%></td></tr>
		<tr><td><% item.getPcompany();%></td></tr>
		<tr><td><% item.getPprice();%></td></tr>
		</table>
		</div>
		</div>
		</div>
		
<%}}}
catch(Exception e){%>
<p><% e.getMessage(); %></p>
<%}%>
</body>
</html>