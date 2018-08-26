package com.maioth.service;

import java.util.List;

import com.maioth.model.Goal;

public interface GoalService {

	Goal save(Goal goal);

	List<Goal> findAllGoals();
	
}
