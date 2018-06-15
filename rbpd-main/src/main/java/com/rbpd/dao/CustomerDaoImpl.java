package com.rbpd.dao;

import java.util.List;

import javax.persistence.Query;

import com.rbpd.core.Customer;
import com.rbpd.core.Product;

public class CustomerDaoImpl extends BaseDao<Customer, Long> implements CustomerDao {

	public CustomerDaoImpl(Class<Product> persistanceClass) {
		super(Customer.class);
	}

	@SuppressWarnings("unchecked")
	public List<Customer> findCustomerByName(String firstName) {
		
		String q = "select c from " + this.getPersistanceClass().getSimpleName() + " c "
					+ " where c.customerFirstName like %:firstName";
		Query query = this.getEntityManager().createQuery(q).setParameter(":firstName", firstName);
		return query.getResultList();
	}

}
