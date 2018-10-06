package com.digi.daoimpl;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.springframework.transaction.annotation.Transactional;

import com.digi.dao.StudentDao;
import com.digi.data.Student;
import com.digi.util.HibernateUtil;

public class StudentDaoImpl implements StudentDao {
	
	@Transactional("transactionManager")
	public void save(Student obj) {
		Session session = HibernateUtil.getCurrentSession();
		Transaction trans = session.beginTransaction();
		session.save(obj);
		trans.commit();
	}

	@Override
	public Student getById(String id) {
		return (Student) HibernateUtil.getCurrentSession().get(Student.class, id);
	}

}
