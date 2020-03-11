package com.techelevator.npgeek.weather;

public class Weather {
	
	private String parkCode;
	private int fiveDay;
	private int lowTemp;
	private int highTemp;
	private String forecast;
	public String getParkCode() {
		return parkCode;
	}
	public void setParkCode(String parkCode) {
		this.parkCode = parkCode;
	}
	public int getFiveDay() {
		return fiveDay;
	}
	public void setFiveDay(int fiveDay) {
		this.fiveDay = fiveDay;
	}
	public int getLowTemp() {
		return lowTemp;
	}
	public void setLowTemp(int lowTemp) {
		this.lowTemp = lowTemp;
	}
	public int getHighTemp() {
		return highTemp;
	}
	public void setHighTemp(int highTemp) {
		this.highTemp = highTemp;
	}
	public String getForecast() {
		return forecast;
	}
	public void setForecast(String forecast) {
		this.forecast = forecast;
	}
	

}
