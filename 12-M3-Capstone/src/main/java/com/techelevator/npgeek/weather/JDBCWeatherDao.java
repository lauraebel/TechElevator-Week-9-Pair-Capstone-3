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
		String sqlSelectAllWeather = "select * from weather";
		SqlRowSet results = jdbcTemplate.queryForRowSet(sqlSelectAllWeather);
		while (results.next()) {
			allWeather.add(mapRowToWeather(results));
		}
		return allWeather;
	}

	@Override
	public Weather getWeatherByParkCode(String parkCode) {
		Weather weather = null;
		String sqlSelectWeatherByParkCode = "select * from weather where parkcode = ?";
		SqlRowSet results = jdbcTemplate.queryForRowSet(sqlSelectWeatherByParkCode, parkCode);
		if (results.next()) {
			weather = mapRowToWeather(results);
			
		}
		return weather;
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
