package com.maioth.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.maioth.model.Goal;
import com.maioth.repository.GoalRepositoryImpl;

@Service("goalService")
public class GoalServiceImpl implements GoalService {

	@Autowired
	private GoalRepositoryImpl goalRepository;
	
	@Transactional
	public Goal save(Goal goal) {

		return goalRepository.save(goal);
	}

	public List<Goal> findAllGoals() {
		return goalRepository.loadAll();
	}

}
