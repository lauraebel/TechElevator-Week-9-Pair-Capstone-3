package com.techelevator.npgeek.park;

import java.util.Date;

public class Park {

	private String parkCode;
	private String parkName;
	private String parkState;
	private int acreage;
	private int elevation;
	private double milesOfTrail;
	private int campsites;
	private String climate;
	private int yearFounded;
	private int annualVisitors;
	private String quote;
	private String quoteSource;
	private String parkDescription;
	public String getQuoteSource() {
		return quoteSource;
	}

	public void setQuoteSource(String quoteSource) {
		this.quoteSource = quoteSource;
	}

	public String getParkDescription() {
		return parkDescription;
	}

	public void setParkDescription(String parkDescription) {
		this.parkDescription = parkDescription;
	}
	private int entryFee;
	private int animalSpecies;
	
	public String getParkCode() {
		return parkCode;
	}
	
	public void setParkCode(String parkCode) {
		this.parkCode = parkCode;
	}
	
	public String getParkName() {
		return parkName;
	}
	
	public void setParkName(String parkName) {
		this.parkName = parkName;
	}
	
	public String getParkState() {
		return parkState;
	}
	
	public void setParkState(String parkState) {
		this.parkState = parkState;
	}
	
	public int getAcreage() {
		return acreage;
	}
	public void setAcreage(int acreage) {
		this.acreage = acreage;
	}
	public int getElevation() {
		return elevation;
	}
	
	public void setElevation(int elevation) {
		this.elevation = elevation;
	}
	
	public double getMilesOfTrail() {
		return milesOfTrail;
	}
	public void setMilesOfTrail(double milesOfTrail) {
		this.milesOfTrail = milesOfTrail;
	}
	public int getCampsites() {
		return campsites;
	}
	public void setCampsites(int campsites) {
		this.campsites = campsites;
	}
	public String getClimate() {
		return climate;
	}
	public void setClimate(String climate) {
		this.climate = climate;
	}
	public int getYearFounded() {
		return yearFounded;
	}
	public void setYearFounded(int yearFounded) {
		this.yearFounded = yearFounded;
	}
	public int getAnnualVisitors() {
		return annualVisitors;
	}
	public void setAnnualVisitors(int annualVisitors) {
		this.annualVisitors = annualVisitors;
	}
	public String getQuote() {
		return quote;
	}
	public void setQuote(String quote) {
		this.quote = quote;
	}
	public int getEntryFee() {
		return entryFee;
	}
	public void setEntryFee(int entryFee) {
		this.entryFee = entryFee;
	}
	public int getAnimalSpecies() {
		return animalSpecies;
	}
	public void setAnimalSpecies(int animalSpecies) {
		this.animalSpecies = animalSpecies;
	}
	
	
}
