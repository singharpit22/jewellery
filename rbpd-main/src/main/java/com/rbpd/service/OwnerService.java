package com.rbpd.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.rbpd.core.Owner;
import com.rbpd.dao.OwnerDao;

@Component
public class OwnerService implements GenericService<Owner> {

	@Autowired
	@Qualifier("ownerDaoImpl")
	private OwnerDao ownerDao;
	
	public void save(Owner owner) {
		ownerDao.persist(owner);
	}

	public void update(Owner owner) {
		ownerDao.merge(owner);
	}

}
