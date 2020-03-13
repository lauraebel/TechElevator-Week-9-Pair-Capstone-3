package com.techelevator.npgeek.park;

import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.support.rowset.SqlRowSet;
import org.springframework.stereotype.Component;

@Component
public class JDBCParkDao implements ParkDao {

	private JdbcTemplate jdbcTemplate;
	
	@Autowired
	public JDBCParkDao(DataSource dataSource) {
		this.jdbcTemplate = new JdbcTemplate(dataSource);
	}
	
	@Override
	public List<Park> getAllParks() {
		List<Park> allParks = new ArrayList<>();
			String sqlSelectAllParks = "SELECT * FROM park";
			SqlRowSet results = jdbcTemplate.queryForRowSet(sqlSelectAllParks);
			while (results.next()) {
				Park park = new Park(); 
				park.setParkCode(results.getString("parkcode"));
				park.setParkName(results.getString("parkname"));
				park.setParkState(results.getString("state"));
				park.setAcreage(results.getInt("acreage"));
				park.setElevation(results.getInt("elevationinfeet"));
				park.setMilesOfTrail(results.getDouble("milesoftrail"));
				park.setCampsites(results.getInt("numberofcampsites"));
				park.setClimate(results.getString("climate"));
				park.setYearFounded(results.getInt("yearfounded"));
				park.setAnnualVisitors(results.getInt("annualvisitorcount"));
				park.setQuote(results.getString("inspirationalquote"));
				park.setQuoteSource(results.getString("inspirationalquotesource"));
				park.setParkDescription(results.getString("parkdescription"));
				park.setEntryFee(results.getInt("entryfee"));
				park.setAnimalSpecies(results.getInt("numberofanimalspecies"));
				allParks.add(park);
			}
			return allParks;
	}
	
	@Override
	public Park getParkByCode(String parkCode) {
		Park park = null;
		String sqlSelectParkByCode = "SELECT * FROM park JOIN weather ON park.parkcode = weather.parkcode WHERE park.parkcode = ?";
		SqlRowSet results = jdbcTemplate.queryForRowSet(sqlSelectParkByCode, parkCode);
		if (results.next()) {
			park = mapRowToPark(results);
		}
		return park;
	}
	
	private Park mapRowToPark(SqlRowSet row) {
		Park park = new Park();
		park.setParkCode(row.getString("parkcode"));
		park.setParkName(row.getString("parkname"));
		park.setParkState(row.getString("state"));
		park.setAcreage(row.getInt("acreage"));
		park.setElevation(row.getInt("elevationinfeet"));
		park.setMilesOfTrail(row.getDouble("milesoftrail"));
		park.setCampsites(row.getInt("numberofcampsites"));
		park.setClimate(row.getString("climate"));
		park.setYearFounded(row.getInt("yearfounded"));
		park.setAnnualVisitors(row.getInt("annualvisitorcount"));
		park.setQuote(row.getString("inspirationalquote"));
		park.setQuoteSource(row.getString("inspirationalquotesource"));
		park.setParkDescription(row.getString("parkdescription"));
		park.setEntryFee(row.getInt("entryfee"));
		park.setAnimalSpecies(row.getInt("numberofanimalspecies"));
		park.setFiveDay(row.getInt("fivedayforecastvalue"));
		park.setLowTemp(row.getInt("low"));
		park.setHighTemp(row.getInt("high"));
		park.setForecast(row.getString("forecast"));
		return park;
	}

}
