package com.springmvc.mvc.Controller.Registration;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.springmvc.mvc.DTO.Registration.RGDTO;
import com.springmvc.mvc.Model.Service.Registration.RGservice;
@Controller
public class RGcontroller 
{
	
     public RGcontroller()
      {
		System.out.println(this.getClass().getSimpleName()+"RG Controller Object Created");
	  }
     @Autowired
     private RGservice rgs;
     
     @RequestMapping(name = "/register.do",method = RequestMethod.POST)
     public ModelAndView userRGController(RGDTO rdto)
     {
    	 System.out.println("user RG Controller Sarted");
    	 rgs.userRGSevice(rdto);
    	 System.out.println("user RG Controller Ended");
    	 return new ModelAndView("/Display.jsp");
     }
}
