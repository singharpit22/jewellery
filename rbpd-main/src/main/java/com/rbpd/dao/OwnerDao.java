package com.rbpd.dao;

import java.util.Map;

import com.rbpd.core.Owner;

public interface OwnerDao extends GenericDao<Owner, Long> {
	
	public Owner validateCredentials(Map<String, Object> paramaters);
}
