package com.maioth.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.maioth.model.Exercise;

@Repository("exerciseRepository")
public interface ExerciseRepository extends JpaRepository<Exercise, Long>{

//	Exercise save(Exercise exercise);
}
