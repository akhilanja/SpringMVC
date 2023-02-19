package com.springmvc.mvc.DTO.Registration;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;
@Entity
@Table(name = "springm_mvc")
public class RGDTO implements Serializable
{
	@Id
	@GenericGenerator(name = "ref", strategy = "increment")
	@GeneratedValue(generator = "ref")
   private int emid;
   @Column(name = "emp_name")
   private String emname;
   @Column(name = "emp_job")
   private String emjob;
   @Column(name = "emp_jobtype")
   private String emjobtype;
   @Column(name = "emp_place")
   private String emplace;
   @Column(name = "emp_age")
   private int emage;
   @Column(name = "emp_email")
   private String ememail;
   @Column(name = "emp_password")
   private String empwd;
   
   
    public RGDTO() 
    {
	System.out.println(this.getClass().getSimpleName()+"RG DTO Object Created");
    }
    


	public int getEmid() {
		return emid;
	}



	public void setEmid(int emid) {
		this.emid = emid;
	}



	public String getEmname() {
		return emname;
	}


	public void setEmname(String emname) {
		this.emname = emname;
	}


	public String getEmjob() {
		return emjob;
	}


	public void setEmjob(String emjob) {
		this.emjob = emjob;
	}


	public String getEmjobtype() {
		return emjobtype;
	}


	public void setEmjobtype(String emjobtype) {
		this.emjobtype = emjobtype;
	}


	public String getEmplace() {
		return emplace;
	}


	public void setEmplace(String emplace) {
		this.emplace = emplace;
	}


	public int getEmage() {
		return emage;
	}


	public void setEmage(int emage) {
		this.emage = emage;
	}


	public String getEmemail() {
		return ememail;
	}


	public void setEmemail(String ememail) {
		this.ememail = ememail;
	}


	public String getEmpwd() {
		return empwd;
	}


	public void setEmpwd(String empwd) {
		this.empwd = empwd;
	}


	@Override
	public String toString() {
		return "RGDTO [emid=" + emid + ", emname=" + emname + ", emjob=" + emjob + ", emjobtype=" + emjobtype
				+ ", emplace=" + emplace + ", emage=" + emage + ", ememail=" + ememail + ", empwd=" + empwd + "]";
	}
    
    
   
}
