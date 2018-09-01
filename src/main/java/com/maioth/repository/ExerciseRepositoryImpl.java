//package com.maioth.repository;
//
//import javax.persistence.EntityManager;
//import javax.persistence.PersistenceContext;
//
//import org.springframework.stereotype.Repository;
//
//import com.maioth.model.Exercise;
//
//@Repository("exerciseRepository")
//public class ExerciseRepositoryImpl implements ExerciseRepository {
//
//	
//	@PersistenceContext
//	private EntityManager em;
//	
//	public Exercise save(Exercise exercise) {
//
//		em.persist(exercise);
//		
//		return exercise;
//	}
//
//}
