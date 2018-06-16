package com.rbpd.service;

import java.util.List;

public interface GenericService<T> {
	
	public void save(T t);
	
	public void update(T t);
	
	public List<T> getAll();
	
	

}
