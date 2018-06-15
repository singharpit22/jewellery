package com.rbpd.service;

import java.util.LinkedHashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.rbpd.constant.ApplicationConstant;
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

	/**
	 * This function would make a DB call and check if the Onwer is valid or not
	 * 
	 * @param userName
	 * @param password
	 * @return
	 */
	public String validateOwner(String userName, String password) {
		String result = ApplicationConstant.FAILURE;

		Map<String, Object> paramaters = new LinkedHashMap<String, Object>();
		paramaters.put("userName", userName);
		paramaters.put("password", password);

		Owner owner = ownerDao.validateCredentials(paramaters);

		if (owner != null) {
			result = ApplicationConstant.SUCCESS;
		}

		return result;

	}

}
