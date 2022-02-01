<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
	<head>
	<meta charset="ISO-8859-1">
	<title>Fill The Student Details for Placement Purposes</title>
		<style type="text/css">
			p
				{
					font-size: 35px;
					display: flex;
					justify-content: center;
					color:blue;
					animation: move 1s infinite ease-in-out;
				}
			span
				{
					    font-size: 25px;
					    display: flex;
					    justify-content: flex-end;
					    margin: 42px;
				}
			A 	{
					text-decoration: none;
					margin: 9px;
					padding: 7px;
				}
			input 
				{
				  cursor: pointer;
				  border-radius: 12px;
				  box-sizing: border-box;
				  display: inline-block;
				  border: 1px solid purple;
				  padding: 12px 2px;
				  margin: 8px 0;
				}
			.input1	
				{
					padding: 10px 5px;
					cursor: pointer;
					background-color: #b24cfd;
					border-radius: 10px;
				}
			select 
				{
					  cursor: pointer;
					  border-radius: 12px;
					  box-sizing: border-box;
					  display: inline-block;
					  border: 1px solid purple;
					  padding: 12px 2px;
					  margin: 8px 0;
				}
			label 
				{
		  			padding: 8px 8px;
				}
				@keyframes move {
		    					0% {
		      							transform: scale(1) rotate(0deg);
		    						}
		    					50% {
		      							transform: scale(1.1) rotate(0.1deg);
		    						}
		  						}
		</style>
	</head>
	<body>
		<span>
			<a href="/customer-service-mvc/studentDetails/all">ViewStudentDetails</a>
			<a href="/customer-service-mvc">BacktoHome</a>
		</span>
		<p>
			Please Enter Student Details
		</p>
		<div>
			<form:form method="post" action="studentDetails">
			
			<form:label path="student_name">
									<b>Student Name</b>
			</form:label>
			<form:input path="student_name"/>
			
			
			<form:label path="percentage">	
								      <b>Percentage</b>
			</form:label>
			<form:input path="percentage"/>
			
			<form:label path="branch">
								<b>Select Branch</b>
			</form:label>
			<form:select path="branch" items="${groups}" />
			
			<form:label path="phone">
									<b>Phone</b>
			</form:label>
			<form:input path="phone"/>
			<form:label path="email">
									<b>Email</b>
			</form:label>
			<form:input path="email"/>
			
			
			<form:label path="status">
								<b>Select Status</b>
			</form:label>
			<form:select path="status" items="${group}" />
			
			<input type="submit" class="input1" value="Submit"/>
			
			</form:form>
		</div>
	</body>
</html>