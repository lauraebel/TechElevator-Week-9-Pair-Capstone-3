package com.techelevator.npgeek.survey;

import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.support.rowset.SqlRowSet;
import org.springframework.stereotype.Component;

@Component
public class JDBCSurveyDao implements SurveyDao {

	private JdbcTemplate jdbcTemplate;

	@Autowired
	public JDBCSurveyDao(DataSource dataSource) {
		this.jdbcTemplate = new JdbcTemplate(dataSource);
	}

	@Override
	public List<Survey> getAllSurveys() {
		List<Survey> allSurveys = new ArrayList<>();
		String sqlSelectAllSurveys = "select * from survey_result";
		SqlRowSet results = jdbcTemplate.queryForRowSet(sqlSelectAllSurveys);
		while (results.next()) {
			Survey survey = new Survey();
			survey.setId(results.getLong("surveyid"));
			survey.setParkCode(results.getString("parkcode"));
			survey.setEmailAddress(results.getString("emailaddress"));
			survey.setStateOfResidence(results.getString("state"));
			survey.setActivityLevel(results.getString("activitylevel"));
			allSurveys.add(survey);
		}
		return allSurveys;
	}

	@Override
	public void save(Survey survey) {
	Long id = getNextId();
	String sqlInsertSurvey = "insert into survey_result (surveyid, parkcode, emailaddress, state, activitylevel) values (?,?,?,?,?)";
	jdbcTemplate.update(sqlInsertSurvey, id, survey.getParkCode(), survey.getEmailAddress(), survey.getStateOfResidence(), survey.getActivityLevel());
	survey.setId(id);
	
	}

	private Long getNextId() {
		String sqlSelectNextId = "select nextval('seq_surveyid')";
		SqlRowSet results = jdbcTemplate.queryForRowSet(sqlSelectNextId);
		Long id = null;
		if (results.next()) {
			id = results.getLong(1);

		} else {
			throw new RuntimeException("Unable to select next survey id");
		}
		return id;

	}
}
