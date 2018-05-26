<h3 class="my-4">Doctors Category</h3>


<div class="list-group">

	<c:forEach items="${dcategories}" var="dcategory">
		<a href="${contextRoot}/show/dcategory/${dcategory.id}/products" class="list-group-item" id="a_${dcategory.name}">${dcategory.name}</a>
	</c:forEach>
</div>