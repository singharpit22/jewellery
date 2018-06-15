package com.rbpd.dao;

import org.springframework.stereotype.Component;

import com.rbpd.core.Owner;

@Component
public class OwnerDaoImpl extends BaseDao<Owner, Long> implements OwnerDao {

	public OwnerDaoImpl() {
	}
	
	public OwnerDaoImpl(Class<Owner> persistanceClass) {
		super(Owner.class);
	}


}
