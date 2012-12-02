package com.store.business.test;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.store.business.CustomerInheritance;

public class BusinessTest {
	
	EntityManager entityManager;
	
	@Before
	public void init(){
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		EntityManagerFactory entityManagerFactory = (EntityManagerFactory)context.getBean("entityManagerFactory");
		entityManager = entityManagerFactory.createEntityManager();
	}

	@Test
	public void test() {
		CustomerInheritance customerInDatabase = new CustomerInheritance("pierre", "durant","test");
		
		EntityTransaction tx = entityManager.getTransaction();
		tx.begin();
		
		entityManager.persist(customerInDatabase);
		
		tx.commit();
	}

}
