package com.springmvc.mvc.Model.DAO.Registration;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.stereotype.Repository;

import com.springmvc.mvc.DTO.Registration.RGDTO;
@Repository
public class RGDAO 
{
	private SessionFactory sf;
	public RGDAO()
	{
		System.out.println(this.getClass().getSimpleName()+"RG DAO Object Created");
	}
	
	 public void userRGDAO(RGDTO rdto)
	    {
	   	 System.out.println("user RG DAO Sarted");
	   	 
	   	 Session s=sf.openSession();
	   	 Transaction tx=s.beginTransaction();
	   	 
	   	 s.save(rdto);
	   	 
	   	 tx.commit();
	   	 
	   	 System.out.println("user RG DAO Ended");
	    }
}
