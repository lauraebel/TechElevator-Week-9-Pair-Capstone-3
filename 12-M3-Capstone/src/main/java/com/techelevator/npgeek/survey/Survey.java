package com.techelevator.npgeek.survey;

public class Survey {

	private Long id;
	private String parkCode;
	private String emailAddress;
	private String stateOfResidence;
	private String activityLevel;
	
	
	
	public Long getId() {
		return id;
	}
	
	public void setId(Long id) {
		this.id = id;
	}
	
	public String getParkCode() {
		return parkCode;
	}
	
	public void setParkCode(String parkCode) {
		this.parkCode = parkCode;
	}
	public String getEmailAddress() {
		return emailAddress;
	}
	
	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}
	
	public String getStateOfResidence() {
		return stateOfResidence;
	}
	
	public void setStateOfResidence(String stateOfResidence) {
		this.stateOfResidence = stateOfResidence;
	}
	
	public String getActivityLevel() {
		return activityLevel;
	}
	
	public void setActivityLevel(String activityLevel) {
		this.activityLevel = activityLevel;
	}
	
	
}
