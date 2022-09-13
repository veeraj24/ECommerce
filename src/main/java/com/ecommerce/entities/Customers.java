package com.ecommerce.entities;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;



@JsonIgnoreProperties({"hibernateLazyInitializer"})
@Entity
@Table(name="customer")
public class Customers {

	private int customerid;
	private String customername;
	private String emailID;
	private String password;
	
	
	public Customers(int customerid, String customername, String emailID, String password) {
		super();
		this.customerid = customerid;
		this.customername = customername;
		this.emailID=emailID;
		this.password = password;
		
	}
	@Id
	//@GeneratedValue(strategy=GenerationType.IDENTITY)
	public int getCustomerid() {
		return customerid;
	}
	public void setCustomerid(int customerid) {
		this.customerid = customerid;
	}
	public String getCustomername() {
		return customername;
	}
	public void setCustomername(String customername) {
		this.customername = customername;
	}
	
	public String getEmailID() {
		return emailID;
	}
	public void setEmailID(String emailID) {
		this.emailID = emailID;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	public Customers() {
		super();
	}
	@Override
	public String toString() {
		return "Customers [customerid=" + customerid + ", customername=" + customername + ", emailID=" + emailID
				+ ", password=" + password + "]";
	}
	
}
