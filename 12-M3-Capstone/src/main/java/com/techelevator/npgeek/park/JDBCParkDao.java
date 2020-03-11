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
			String sqlSelectAllParks = "select * from park";
			SqlRowSet results = jdbcTemplate.queryForRowSet(sqlSelectAllParks);
			while ( results.next()) {
				allParks.add(mapRowToPark(results));
			}
				
		
		return allParks;
	}

	@Override
	public Park getParkByCode(String parkCode) {
		Park park = null;
		String sqlSelectParkByCode = "select * from park where parkcode = ?";
		SqlRowSet results = jdbcTemplate.queryForRowSet(sqlSelectParkByCode, parkCode);
		if ( results.next()) {
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
		
		return park;
	}

}
