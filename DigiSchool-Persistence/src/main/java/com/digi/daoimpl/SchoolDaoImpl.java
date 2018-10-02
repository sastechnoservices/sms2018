package com.digi.daoimpl;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.springframework.transaction.annotation.Transactional;

import com.digi.dao.SchoolDao;
import com.digi.data.School;
import com.digi.util.HibernateUtil;

public class SchoolDaoImpl implements SchoolDao {
	
	private static Session session;
	private static Transaction trans;
	
	@Transactional("transactionManager")
	public void save(School obj) {
		session = HibernateUtil.getCurrentSession();
		if(session.isOpen()) {
			session.close();
		}
		trans = session.beginTransaction();
		/*if(session.getTransaction() == null){
			
		}else {
			trans = session.getTransaction();
		}*/
		session.save(obj);
		trans.commit();
		session.close();
	}
}
