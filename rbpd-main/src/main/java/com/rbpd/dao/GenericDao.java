package com.rbpd.dao;

import java.io.Serializable;
import java.util.List;

public interface GenericDao<T, Id extends Serializable> {
	
    public void persist(T entity);
	
	public T merge(T entity);
	
	public void remove(T entity);
	
	public T findById(Id id);
	
	public List<T> findAll(); 

}
