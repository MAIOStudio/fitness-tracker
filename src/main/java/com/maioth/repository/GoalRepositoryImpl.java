//package com.maioth.repository;
//
//import java.util.List;
//
//import javax.persistence.EntityManager;
//import javax.persistence.PersistenceContext;
//import javax.persistence.Query;
//import javax.persistence.TypedQuery;
//
//import org.springframework.stereotype.Repository;
//
//import com.maioth.model.Goal;
//import com.maioth.model.GoalReport;
//
//@Repository("goalRepository")
//public class GoalRepositoryImpl implements GoalRepository {
//
//	@PersistenceContext
//	private EntityManager em;
//
//	public Goal save(Goal goal) {
//		
//		if(goal.getId() == null) {
//			em.persist(goal);
//			
//			em.flush();
//		} else {
//			goal = em.merge(goal);
//		}
//		
//		return goal;
//	}
//
//	public List<Goal> loadAll() {
////		Query query = em.createQuery("Select g from Goal g");
//		
//		TypedQuery<Goal> query = em.createNamedQuery(Goal.FIND_ALL_GOALS, Goal.class);
//		
//		return query.getResultList();
//	}
//
//	public List<GoalReport> findAllGoalReports() {
////		Query query = em.createQuery("Select new com.maioth.model.GoalReport(g.minutes, e.minutes, e.activity)" + 
////						"from Goal g, Exercise e where g.id = e.goal.id");
//		
//		TypedQuery<GoalReport> query = em.createNamedQuery(Goal.FIND_GOALS_REPORTS, GoalReport.class);
//		
//		return query.getResultList();
//	}
//
//}
