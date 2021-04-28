package com.te.springhibernate;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Query;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

import com.te.springhibernate.bean.EntityManagerDemo;
import com.te.springhibernate.config.EntityManagerConfig;

public class Delete {

	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(EntityManagerConfig.class);
        EntityManagerDemo demo= context.getBean(EntityManagerDemo.class);
        EntityManager entityManager=demo.getEntityManager();
        EntityTransaction entityTransaction=entityManager.getTransaction();
		entityTransaction.begin();
		String query = "delete from Movies where id=:id";
		Query queryIssued=entityManager.createQuery(query);
		queryIssued.setParameter("id",4);
		int rowsAffected=queryIssued.executeUpdate();
		entityTransaction.commit();
		System.out.println("successfully delete "+rowsAffected+" row");

	}

}
