package com.uae.service;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.uae.model.Customer;

@Service
public class BankServiceImpl {

	   
	   @Autowired
	   private EntityManager  entityManager;

	    public List<String> getAllDetails() {
	        List<String> result = new ArrayList<String>();
	        Query query = entityManager.createNamedQuery("Customer.fetchByAllData", Customer.class);
	        query.setParameter("id", 1);
	        Customer user = (Customer) query.getSingleResult();
	    //    Customer value =  bankRepository.findById(1);
	        System.out.println("----->named query" +user);
	        
	        Query query1 = entityManager.createNativeQuery("Select a.name from xremit.dbo.customer a where a.id = :id");
	        query1.setParameter("id", 1);
	        Object user1 =  query1.getSingleResult();//getResultList();//getSingleResult();
	        System.out.println("----->native query" +user1);
	        return result;
	    }
	    
}
