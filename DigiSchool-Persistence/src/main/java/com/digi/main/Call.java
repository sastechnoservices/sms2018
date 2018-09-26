package com.digi.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.digi.dao.StudentDao;
import com.digi.data.Student;

public class Call {
	public static void main(String[] args) {
		System.out.println("beginssss");
		ApplicationContext con = new ClassPathXmlApplicationContext("spring-beans.xml","arts-spring-hibernate.xml");
		Student st = new Student();
		st.setName("School");
		st.setName1("sas");
		StudentDao std = (StudentDao) con.getBean("studentDaoImpl");
		std.save(st);
	}

}
