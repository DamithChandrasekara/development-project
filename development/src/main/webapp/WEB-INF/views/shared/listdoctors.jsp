<div class="container">

	<div class="row">
		<!-- Would to be display slidebar -->
		<div class="col-md-3">
			<%@include file="./sidebar.jsp"%>
		</div>
		<!-- Would to be display Actual Doctors List -->
		<div col-md-9>
			<!-- Add Breadcrumb Components-->
			<div class="row">
				<div col-lg-12>

					<c:if test="${userClickedAllDoctors == true}">
						<ol class="breadcrumb">
							<li class="breadcrumb-item"><a href="${contextRoot}/home">Home</a></li>
							<li class="breadcrumb-item active">All Doctors</li>
						</ol>
					</c:if>

					<c:if test="${userClickedCategoryDoctors == true}">
						<ol class="breadcrumb">
							<li class="breadcrumb-item"><a href="${contextRoot}/home">Home</a></li>
							<li class="breadcrumb-item active">All Doctors</li>
							<li class="breadcrumb-item active">${dcategory.name}</li>
						</ol>
					</c:if>

				</div>
			</div>
		</div>
	</div>





</div>