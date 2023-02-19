<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>Employee Registration</h1>
<form action="register.do" method="post">
<label>EmployeeName:</label>    <input type="text" name="emname">
<br>
<br>
<label>EmployeeJob:</label>     <input type="text" name="emjob">
<br>
<br>
 <label>JobType:</label><select name="emjobtype">
  <option value="Manager">Manager</option>
  <option value="MTS">MTS</option>
  <option value="Accountent">Accountent</option>
  <option value="Casher">Casher</option>
</select>
<br>
<br>
<label>EmployeePlace:</label>    <input type="text" name="emplace">
<br>
<br>
<label>EmployeeAge:</label>    <input type="number" name="emage">
<br>
<br>
<label>EmployeeEmail:</label>    <input type="email" name="ememail">
<br>
<br>
<label>EmployeePassword:</label>    <input type="password" name="empwd">
<br>
<br>
<input type="submit" value="Registerd">

</form>
<br>
<a href="Login.jsp">Login</a>
</body>
</html>