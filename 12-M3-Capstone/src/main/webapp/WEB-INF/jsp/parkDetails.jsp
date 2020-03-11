<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>

<c:import url="/WEB-INF/jsp/common/header.jsp" />


<div id="main-park-details">

<c:url value="/parkDetails" var="parkDetailsUrl" >
<c:param name="parkcode" value="${park.parkCode}" />
</c:url>

<img src ="<c:url value="/img/parks/${fn:toLowerCase(park.parkCode)}.jpg" />"/>
	

<h2>${park.parkName}</h2>




</div>








<c:import url="/WEB-INF/jsp/common/footer.jsp" />