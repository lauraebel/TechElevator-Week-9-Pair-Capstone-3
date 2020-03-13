<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<c:import url="/WEB-INF/jsp/common/header.jsp" />

<section id="survey-main-content">

<form action="<c:url value="/survey" /> " method="POST" >  

<h2>Which Is Your Favorite National Park?</h2>

<div id="park">
	<select id="park">
		<option value="Cuyahoga Valley National Park">Cuyahoga Valley National Park</option>
		<option value="Everglades National Park">Everglades National Park</option>
		<option value="Grand Canyon National Park">Grand Canyon National Park</option>
		<option value="Glacier National Park">Glacier National Park</option>
		<option value="Great Smoky Mountains National Park">Great Smoky Mountains National Park</option>
		<option value="Grand Teton National Park">Grand Teton National Park</option>
		<option value="Mount Rainier National Park">Mount Rainier National Park</option>
		<option value="Rocky Mountain National Park">Rocky Mountain National Park</option>
		<option value="Yellowstone National Park">Yellowstone National Park</option>
		<option value="Yosemite National Park">Yosemite National Park</option>
	</select>
</div>

<h2>What Is Your Email Address?</h2>

<div id="email-address">
<input type="text" name="email"/>
</div>

<h2>What State Are You From?</h2>

<div id="residence">
	<select id="residence">
		<option value="Alabama">Alabama</option>
		<option value="Alaska">Alaska</option>
		<option value="Arizona">Arizona</option>
		<option value="Arkansas">Arkansas</option>
		<option value="California">California</option>
		<option value="Colorado">Colorado</option>
		<option value="Connecticut">Connecticut</option>
		<option value="Delaware">Delaware</option>
		<option value="Florida">Florida</option>
		<option value="Georgia">Georgia</option>
		<option value="Hawaii">Hawaii</option>
		<option value="Idaho">Idaho</option>
		<option value="Indiana">Indiana</option>
		<option value="Iowa">Iowa</option>
		<option value="Kansas">Kansas</option>
		<option value="Kentucky">Kentucky</option>
		<option value="Louisiana">Louisiana</option>
		<option value="Maine">Maine</option>
		<option value="Maryland">Maryland</option>
		<option value="Massachusetts">Massachusetts</option>
		<option value="Michigan">Michigan</option>
		<option value="Minnesota">Minnesota</option>
		<option value="Mississippi">Mississippi</option>
		<option value="Missouri">Missouri</option>
		<option value="Nebraska">Nebraska</option>
		<option value="Nevada">Nevada</option>
		<option value="New Hampshire">New Hampshire</option>
		<option value="New Jersey">New Jersey</option>
		<option value="New Mexico">New Mexico</option>
		<option value="New York">New York</option>
		<option value="North Carolina">North Carolina</option>
		<option value="North Dakota">North Dakota</option>
		<option value="Ohio">Ohio</option>
		<option value="Oklahoma">Oklahoma</option>
		<option value="Oregon">Oregon</option>
		<option value="Pennsylvania">Pennsylvania</option>
		<option value="Rhode Island">Rhode Island</option>
		<option value="South Carolina">South Carolina</option>
		<option value="South Dakota">South Dakota</option>
		<option value="Tennessee">Tennessee</option>
		<option value="Texas">Texas</option>
		<option value="Utah">Utah</option>
		<option value="Vermont">Vermont</option>
		<option value="Virginia">Virginia</option>
		<option value="Washington">Washington</option>
		<option value="West Virginia"> West Virginia</option>
		<option value="Wisconsin">Wisonsin</option>
		<option value="Wyoming">Wyoming</option>
		<option value="Outside the USA">Outside the USA</option>
	</select>
</div>

<h2>How Active Are You?</h2>

<input type="radio" id="activity" value="Inactive">
<label for="Inactive">Inactive</label>
<input type="radio" id="activity" value="Sedentary">
<label for="Sedentary">Sedentary</label>
<input type="radio" id="activity" value="Active">
<label for="Active">Active</label>
<input type="radio" id="activity" value="Extremely Active">
<label for="Extremely Active"> Extremely Active</label>

<h2>We Appreciate Your Input!</h2>

<input type="submit" value="Submit">

</form>

</section>


<c:import url="/WEB-INF/jsp/common/footer.jsp" />