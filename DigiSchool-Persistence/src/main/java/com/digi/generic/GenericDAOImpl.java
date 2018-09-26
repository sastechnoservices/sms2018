package com.digi.generic;

import java.io.Serializable;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;

public class GenericDAOImpl<T extends Serializable,M extends Serializable> implements IGenericDAO<Serializable, Serializable>{
	
	@Autowired
	private SessionFactory sessionFactory;

	public void save(Serializable obj) {
		sessionFactory.getCurrentSession().save(obj);
		
	}

}
