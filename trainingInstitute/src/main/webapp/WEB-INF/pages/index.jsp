<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
	<head>
	<meta charset="ISO-8859-1">
	<title>Home</title>
		<style type="text/css">
			button
				{
					border-radius: 18px;
					font-size:26px;
					margin: 4px;
				}
			div
				{
					display: flex;
					justify-content: center;
					font-size: 26px;
					padding: 4px
				}
			h1	
				{
					color:green;
					display: flex;
					justify-content: center;
					animation: move 1s infinite ease-in-out;
				}
			A 	{
					text-decoration: none;
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
		<h1>
			<c:out value="${heading}"/>
		</h1>
		<div>
			<button>
				<a href="studentDetails/all" >View All Student List</a>
			</button>
			<button>
				<a href="studentDetails">Add Student Details</a>
			</button>
			<button>
				<a href="studentDetails/SearchBranch" >Based On Branch</a>
			</button>
			<button>
				<a href="studentDetails/SearchPercentage" >Based On Percent</a>
			</button>
			
			<button>
				<a href="studentDetails/buySold" >Based On Status</a>
			</button>
		</div>
	</body>
</html>