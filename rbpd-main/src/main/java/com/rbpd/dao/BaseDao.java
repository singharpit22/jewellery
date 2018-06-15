package com.rbpd.dao;

import java.io.Serializable;
import java.util.List;
import java.util.Map;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.transaction.annotation.Transactional;

@Transactional
public abstract class BaseDao<T, Id extends Serializable> implements GenericDao<T, Id> {
	
	@PersistenceContext
	private EntityManager entityManager;
	
	private Class<T> persistanceClass;
	
	public BaseDao() {
	
	}
	
	public BaseDao(Class<T> persistanceClass) {
		super();
		this.persistanceClass = persistanceClass;
	}
	
	protected EntityManager getEntityManager() {
		return entityManager;
	}
	
	public Class<T> getPersistanceClass() {
		return persistanceClass;
	}
	
	@SuppressWarnings("unchecked")
	public List<T> findAll() {
		Query query = this.getEntityManager().createQuery("select x from " + this.persistanceClass.getSimpleName() + " x");
		return query.getResultList();
	}
	
	public T get(Class<T> clazz, Serializable id) {
		return entityManager.find(clazz, id);
	}
	
	
	@SuppressWarnings("unchecked")
	public List<T> get(String query, Map<String, ?> parameters) {
		
		Query jpaQuery = entityManager.createQuery(query);
		
		if(parameters != null) {
			for (Map.Entry<String, ?> entry : parameters.entrySet()) {
				jpaQuery.setParameter(entry.getKey(), entry.getValue());
			}
		}
		
		return (List<T>)jpaQuery.getResultList();
	}

	public void persist(T entity) {
		entityManager.persist(entity);
	}

	public T merge(T entity) {
		return entityManager.merge(entity);
	}

	public void remove(T entity) {
		entityManager.remove(entity);
	}

	public T findById(Id id) {
		T entity = entityManager.find(this.persistanceClass, id);
		return entity;
	}


}
