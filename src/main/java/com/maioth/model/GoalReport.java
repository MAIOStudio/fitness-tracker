package com.maioth.model;

public class GoalReport {

	private Integer goalMinutes;
	private Integer exerciseMinutes;
	private String exerciseActivity;
	
	public GoalReport(Integer goalMinutes, Integer exerciseMinutes, String exerciseActivity) {
		super();
		this.goalMinutes = goalMinutes;
		this.exerciseMinutes = exerciseMinutes;
		this.exerciseActivity = exerciseActivity;
	}

	public String getExerciseActivity() {
		return exerciseActivity;
	}
	public Integer getExerciseMinutes() {
		return exerciseMinutes;
	}
	public Integer getGoalMinutes() {
		return goalMinutes;
	}
	public void setExerciseActivity(String exerciseActivity) {
		this.exerciseActivity = exerciseActivity;
	}
	public void setExerciseMinutes(Integer exerciseMinutes) {
		this.exerciseMinutes = exerciseMinutes;
	}
	public void setGoalMinutes(Integer goalMinutes) {
		this.goalMinutes = goalMinutes;
	}
	
	
}
