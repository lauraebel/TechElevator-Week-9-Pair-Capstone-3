package com.techelevator.npgeek.weather;

public class Weather {
	
	private String parkCode;
	private int fiveDay;
	private int lowTemp;
	private int highTemp;
	private String forecast;
	private String snowAdvisory = "Bring Snowshoes!";
	private String rainAdvisory = "Bring rain gear and waterproof shoes!";
	private String thunderstormAdvisory = "Please seek shelter and avoid hiking on exposed ridges";
	private String sunnyAdvisory = "Please use sunblock!";
	
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
	public String getSnowAdvisory() {
		return snowAdvisory;
	}
	public void setSnowAdvisory(String snowAdvisory) {
		this.snowAdvisory = snowAdvisory;
	}
	public String getRainAdvisory() {
		return rainAdvisory;
	}
	public void setRainAdvisory(String rainAdvisory) {
		this.rainAdvisory = rainAdvisory;
	}
	public String getThunderstormAdvisory() {
		return thunderstormAdvisory;
	}
	public void setThunderstormAdvisory(String thunderstormAdvisory) {
		this.thunderstormAdvisory = thunderstormAdvisory;
	}
	public String getSunnyAdvisory() {
		return sunnyAdvisory;
	}
	public void setSunnyAdvisory(String sunnyAdvisory) {
		this.sunnyAdvisory = sunnyAdvisory;
	}
	



}
	

