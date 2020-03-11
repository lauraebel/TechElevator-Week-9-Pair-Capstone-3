package com.techelevator.npgeek.survey;

import java.util.List;

public interface SurveyDao {
	
	public List<Survey> getAllSurveys();
	
	public void save(Survey survey);

}
