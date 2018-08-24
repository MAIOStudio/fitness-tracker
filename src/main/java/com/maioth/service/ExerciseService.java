package com.maioth.service;

import java.util.List;

import com.maioth.model.Activity;
import com.maioth.model.Exercise;

public interface ExerciseService {

	List<Activity> findAllActivities();

	Exercise save(Exercise exercise);

}