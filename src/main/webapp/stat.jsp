<%-- 
    Document   : stat.jsp
    Created on : Jan 09, 2023, 2:45:37 PM
    Author     : kuntsev
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Statistics</title>
<style>
        h1 {
        text-align: center;
        }

        page {
        width: 600px;
        margin:auto;
        }
        form {
        width: 400px;
        margin: 20px auto;
        }
        input [type=submit] {
        margin: auto;
        }
        .list, .list td, .list th {
        margin: auto;
        border:1px solid black;
        border-collapse: collapse;
        }
        .list td, .list th {
        padding: 10px;
        }
</style>
    </head>
   <body> 
	<hl>Statistics</hl> 
	<table> 
		<tbody> 
			<tr>
				<td><label for="surname">Popular mail domain:</label></td> 
				<td>${stat.getPopularMail()}</td>
			</tr>
			<tr>
				<td><label for="surname">Max Age:</label></td> 
				<td>${stat.getMaxAge()}</td>
			</tr>
			<tr>
				<td><label for="surname">Min Age:</label></td> 
				<td>${stat.getMinAge()}</td>
			</tr>
			<tr> 
				<td><label for="name">Mean Age:</label></td> 
				<td>${stat.getMeanAge()}</td>
			</tr>
			<tr>
				<td><label for="surname">Sumdu Mails:</label></td> 
				<td>${stat.getSumduMails()}</td>
			</tr>
		</tbody>
	</table> 
</body> 
    
</html>
