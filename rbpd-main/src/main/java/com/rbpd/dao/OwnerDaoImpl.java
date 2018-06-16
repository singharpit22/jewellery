package com.rbpd.dao;

import java.util.List;
import java.util.Map;

import javax.persistence.Query;

import org.springframework.stereotype.Component;

import com.rbpd.core.Owner;

@Component
public class OwnerDaoImpl extends BaseDao<Owner, Long> implements OwnerDao {

	public OwnerDaoImpl() {
		super(Owner.class);
	}

	public Owner validateCredentials(Map<String, Object> paramaters) {

		String q = "select o from " + this.getPersistanceClass().getSimpleName() + " o where o.userName = :userName and o.password = :password";
		final Query query = this.getEntityManager().createQuery(q);
		paramaters.entrySet().forEach(e -> query.setParameter(e.getKey(), e.getValue()));
		@SuppressWarnings("unchecked")
		List<Owner> owners = query.getResultList();
		return owners.get(0);	}

}
