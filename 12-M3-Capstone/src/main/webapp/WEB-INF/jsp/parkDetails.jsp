<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>

<c:import url="/WEB-INF/jsp/common/header.jsp" />

<div id="main-park-details">

<c:url value="/parkDetails" var="parkDetailsUrl" >
<c:param name="parkcode" value="${park.parkCode}" />
</c:url>

<img src ="<c:url value="/img/parks/${fn:toLowerCase(park.parkCode)}.jpg" />"/>
	
<div id="name">
<h1>${park.parkName}</h1>
</div>

<div id="description">
<p>${park.parkDescription}</p>
</div>

<div class="park-details">
<h3>Additional Park Details</h3>

<p>State: ${park.parkState}</p>

<p>Acreage: ${park.acreage}</p>

<p>Elevation: ${park.elevation} feet</p>

<p>Trails: ${park.milesOfTrail} miles</p>

<p>Campsites: ${park.campsites}</p>

<p>Climate: ${park.climate}</p>

<p>Year Founded: ${park.yearFounded}</p>

<p>Visitors Each Year: ${park.annualVisitors}</p>

<p>Entry Fee: $${park.entryFee}</p>

<p>Animal Species: ${park.animalSpecies}</p>

</div>

<div id="quote">
<p>"${park.quote}"</p>
</div>

<div id="quote-source">
<p> - ${park.quoteSource}</p>
</div>

<section id="five-day-forecast">
<h2>Five Day Forecast:</h2>

<div class="weather">

<c:forEach items="${forecast}" var="forecast" > 

<div class="day">
<h3>Day ${forecast.fiveDay}</h3>
</div>

<div class="high">
<p>High Temperature: ${forecast.highTemp} degrees</p>
</div>

<div class="low">
<p>Low Temperature: ${forecast.lowTemp} degrees</p>
</div>

<div class="forecast">
<h5>${forecast.forecast}</h5>
</div>

</c:forEach>
</div>
</section>

</div>











<c:import url="/WEB-INF/jsp/common/footer.jsp" />