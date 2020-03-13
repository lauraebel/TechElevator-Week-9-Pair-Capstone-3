package com.techelevator.npgeek.weather;

import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.support.rowset.SqlRowSet;
import org.springframework.stereotype.Component;

@Component

public class JDBCWeatherDao implements WeatherDao{

	private JdbcTemplate jdbcTemplate;
	
	@Autowired
	public JDBCWeatherDao(DataSource dataSource) {
		this.jdbcTemplate = new JdbcTemplate(dataSource);
	}
	
	@Override
	public List<Weather> getAllWeather() {
		List<Weather> allWeather = new ArrayList<>();
		String sqlSelectAllWeather = "SELECT * FROM weather";
		SqlRowSet results = jdbcTemplate.queryForRowSet(sqlSelectAllWeather);
		while (results.next()) {
			allWeather.add(mapRowToWeather(results));
		}
		return allWeather;
	}

	@Override
	public List<Weather> getWeatherByParkCode(String parkCode) {
		List<Weather> weatherByCode = new ArrayList<>();
		String sqlSelectWeatherByParkCode = "SELECT * FROM weather WHERE parkcode = ?";
		SqlRowSet results = jdbcTemplate.queryForRowSet(sqlSelectWeatherByParkCode, parkCode);
		while (results.next()) {
			weatherByCode.add(mapRowToWeather(results));
		}
		return weatherByCode;
	}

	private Weather mapRowToWeather(SqlRowSet row) {
		Weather weather = new Weather();
		weather.setParkCode(row.getString("parkcode"));
		weather.setFiveDay(row.getInt("fivedayforecastvalue"));
		weather.setLowTemp(row.getInt("low"));
		weather.setHighTemp(row.getInt("high"));
		weather.setForecast(row.getString("forecast"));
		
		return weather;
	}
}
