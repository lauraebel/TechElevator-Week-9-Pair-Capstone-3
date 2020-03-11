<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>

<c:import url="/WEB-INF/jsp/common/header.jsp" />

<div id="main-park-details">

<c:url value="/parkDetails" var="parkDetailsUrl" >
<c:param name="parkcode" value="${park.parkCode}" />
</c:url>

<img src ="<c:url value="/img/parks/${fn:toLowerCase(park.parkCode)}.jpg" />"/>
	

<h2>${park.parkName}</h2>
<p>${park.parkDescription}</p>
<p>State: ${park.parkState}</p>
<p>Acreage: ${park.acreage}</p>
<p>Elevation: ${park.elevation} feet</p>
<p>Trails: ${park.milesOfTrail} miles</p>
<p>Campsites: ${park.campsites}</p>
<p>Climate: ${park.climate}</p>
<p>Year Founded: ${park.yearFounded}</p>
<p>Visitors Each Year: ${park.annualVisitors}</p>
<p>"${park.quote}"</p>
<p> - ${park.quoteSource}</p>
<p>Entry Fee: $${park.entryFee}</p>
<p>Animal Species: ${park.animalSpecies}</p>

<h3>${park.forecast}</h3>


</div>











<c:import url="/WEB-INF/jsp/common/footer.jsp" />