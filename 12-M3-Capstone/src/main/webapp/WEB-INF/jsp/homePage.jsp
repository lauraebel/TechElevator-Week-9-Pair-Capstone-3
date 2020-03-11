<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>

<c:import url="/WEB-INF/jsp/common/header.jsp" />



<section id="main-content" class="main">


<c:forEach items="${parks}" var="parks">
<div id="parks ">

<h3>${parks.parkName}</h3>
<p>${parks.parkDescription}</p>

<c:url var="imgUrl" value="/img/parks/${fn:toLowerCase(parks.parkCode)}.jpg" /> 
	<img src="${imgUrl}"/>


<c:url value="/parkDetails" var="parkDetailsUrl" >
<c:param name="parkcode" value="${parks.parkCode}" />
</c:url>



</div>

</c:forEach>
</section>








<c:import url="/WEB-INF/jsp/common/footer.jsp" />