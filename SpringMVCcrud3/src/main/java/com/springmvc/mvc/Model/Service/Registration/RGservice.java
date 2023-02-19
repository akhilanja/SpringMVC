package com.springmvc.mvc.Model.Service.Registration;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springmvc.mvc.DTO.Registration.RGDTO;
import com.springmvc.mvc.Model.DAO.Registration.RGDAO;
@Service
public class RGservice
{
    public RGservice()
     {
    	System.out.println(this.getClass().getSimpleName()+"RG Service Object Created");
	 }
    @Autowired
    private RGDAO rgdao;
    
    public void userRGSevice(RGDTO rdto)
    {
   	 System.out.println("user RG Sevice Sarted");
   	 rgdao.userRGDAO(rdto);
   	 System.out.println("user RG Sevice Ended");
    }
}
