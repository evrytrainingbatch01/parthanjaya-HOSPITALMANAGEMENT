<%@page import="com.app.domain.Patient"%>

<%@page import="java.util.Iterator"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page import="java.util.ArrayList"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>JSP Page</title>


</head>
<body>
	<h2 style="font-family: sans-serif;" align="center">All Patients
		Details</h2>
	<br>
	<%
		Object ob = request.getAttribute("patientList");
		if (ob instanceof ArrayList) {
			if (ob != null) {
				ArrayList al = (ArrayList) ob;
				Iterator itr = al.iterator();

				while (itr.hasNext()) {
					Object object = itr.next();
					if (object instanceof Patient) {
						Patient patient = (Patient) object;

						out.println("<div class='center'>");
						out.println("<table border='1' align='center'>");
						out.println("<tr>");
						out.println("<td>" + patient.getPatientName() + "</td>");
						out.println("<td>" + patient.getPatientAge() + "</td>");
						out.println("<td>" + patient.getBloodGroup() + "</td>");
						out.println("<td>" + patient.getCheckUp() + "</td>");
						out.println("<td>" + patient.getDoctorName() + "</td>");
						out.println("<td>" + patient.getTestRecommended() + "</td>");
						out.println("</tr>");
						out.println("</table>");
						out.println("</div>");
					}
				}
			}
		}
	%>


	<%-- <style>
<%@
include
 
file
="/WEB-INF/css/styleForUserList
.css
"%
>
</style> --%>

</body>