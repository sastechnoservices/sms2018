package com.digi.main;

import java.util.Date;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.digi.dao.SchoolDao;
import com.digi.data.School;

public class Call {
	
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		System.out.println("beginssss");
		ApplicationContext con = new ClassPathXmlApplicationContext("spring-beans.xml","arts-spring-hibernate.xml");
		School school = new School();
		school.setSchoolId("SCHSAI1");
		school.setSchoolName("SAI INTERNATIONAL");
		school.setAddress("PATIA");
		school.setContactDetails("Mob No. 998568875");
		school.setModifiedOn(new Date());
		school.setCreatedOn(new Date());
		school.setModifiedBy("admin");
		school.setStatus("A");
		SchoolDao schoolDao = (SchoolDao)con.getBean("schoolDaoImpl");
		schoolDao.save(school);
		
		/*Student st = new Student();
		st.setName("School");
		st.setName1("sas");
		StudentDao std = (StudentDao) con.getBean("studentDaoImpl");
		std.save(st);*/
	}

}
