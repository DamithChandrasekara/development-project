<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="spring" uri="http://www.springframework.org/tags"%>

<spring:url var="css" value="/resources/css" />
<spring:url var="js" value="/resources/js" />
<spring:url var="images" value="/resources/images" />

<c:set var="contextRoot" value="${pageContext.request.contextPath}" />

<!DOCTYPE html>
<html lang="en">

<head>

<meta charset="utf-8">
<meta name="viewport"
	content="width=device-width, initial-scale=1, shrink-to-fit=no">
<meta name="description" content="">
<meta name="author" content="">

<title>Develpment-Project -${title}</title>

<script>
	window.menu = '${title}';
</script>

<!-- Bootstrap core CSS -->
<link href="${css}/bootstrap.min.css" rel="stylesheet">

<link href="${css}/bootstrap-theme.css" rel="stylesheet">

<!-- Custom styles for this template -->
<link href="${css}/shop-homepage.css" rel="stylesheet">

</head>

<body>
	<div class="wrapper">
		<!-- Navigation -->
		<%@include file="./common/navigation.jsp"%>
		<!-- /Navigation -->

		<!-- Page Content -->
		<div class="content">
			<c:if test="${userClickedHome == true}">
				<%@include file="./common/content.jsp"%>
			</c:if>
			<!-- Load Only User clicked Doctors -->
			<c:if test="${userClickedDoctors == true}">
				<%@include file="./shared/doctor.jsp"%>
			</c:if>
			<!-- Load Only User clicked Doctors -->

			<!-- Load Only User clicked Services -->
			<c:if test="${userClickedServices == true}">
				<%@include file="./shared/service.jsp"%>
			</c:if>
			<!-- Load Only User clicked Services -->

			<!-- Load Only User clicked Ambulance -->
			<c:if test="${userClickedAmbulance == true}">
				<%@include file="./shared/ambulance.jsp"%>
			</c:if>
			<!-- Load Only User clicked Ambulance -->

			<!-- Load Only User clicked Contact -->
			<c:if test="${userClickedContact == true}">
				<%@include file="./shared/contact.jsp"%>
			</c:if>
			<!-- Load Only User clicked Contact -->

			<!-- Load Only User clicked About Us -->
			<c:if test="${userClickedAbout == true}">
				<%@include file="./shared/aboutus.jsp"%>
			</c:if>
			<!-- Load Only User clicked About Us -->
		</div>
		<!-- /.container -->

		<!-- Footer -->
		<%@include file="./common/footer.jsp"%>
		<!-- /Footer -->

		<!-- Bootstrap core JavaScript -->
		<script src="${js}/jquery.min.js"></script>
		<script src="${js}/bootstrap.bundle.min.js"></script>

		<!-- User Styled JS-->
		<script src="${js}/mystyle.js"></script>
	</div>
</body>

</html>
