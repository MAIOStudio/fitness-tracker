package com.maioth.service;

import java.util.List;

import com.maioth.model.Goal;
import com.maioth.model.GoalReport;

public interface GoalService {

	Goal save(Goal goal);

	List<Goal> findAllGoals();

	List<GoalReport> findAllGoalReports();
	
}
