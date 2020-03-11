package com.techelevator.npgeek.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import com.techelevator.npgeek.park.Park;
import com.techelevator.npgeek.park.ParkDao;
import com.techelevator.npgeek.weather.Weather;
import com.techelevator.npgeek.weather.WeatherDao;


@Controller
public class HomeController {
	
	@Autowired
	private ParkDao parkDao;
	
	@Autowired
	private WeatherDao weatherDao;

	@RequestMapping("/homePage")
	public String showParks(ModelMap map) {
		List<Park> parkList = parkDao.getAllParks();
		map.addAttribute("parks", parkList);
		return "homePage";
	}
	
	@RequestMapping("/parkDetails")
	public String showParkDetails(HttpServletRequest request, ModelMap map) {
		String parkCode = request.getParameter("parkcode");
		Park park = parkDao.getParkByCode(parkCode);
		map.put("park", park);
		return "parkDetails";
	}
	
	@RequestMapping("/parkDetailsWeather")
	public String showWeatherDetails(HttpServletRequest request, ModelMap map) {
		String parkCode = request.getParameter("parkcode");
		Weather weather = weatherDao.getWeatherByParkCode(parkCode);
		map.put("weather", weather);
		return "parkDetails";

	}
}
