<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>    
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Welcome</title>
</head>
<body>
<h1>Add New Employee</h1>  
       <form:form method="post" action="login_dao">    
        <table >    
         <tr>    
          <td>USER NAME : </td>   
          <td><form:input path="username"  /></td>  
         </tr>    
         <tr>    
          <td>PASSWORD :</td>    
          <td><form:input path="password" /></td>  
         </tr>   
         <tr>    
          <td> </td>    
          <td><input type="submit" value="Save" /></td>    
         </tr>    
        </table>    
       </form:form>    

</body>
</html>