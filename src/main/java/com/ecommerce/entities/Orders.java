package com.ecommerce.entities;

import javax.persistence.Entity;
import javax.persistence.Id;

import javax.persistence.Table;

@Entity
@Table(name="orders")
public class Orders {
	@Id
	private int orderid;

	private int invoicenumber;
	private int totalprice;
	private String status;
	private String orderdate;
	public Orders() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Orders(int orderid, int invoicenumber, int totalprice, String status, String orderdate) {
		super();
		this.orderid = orderid;
		this.invoicenumber = invoicenumber;
		this.totalprice = totalprice;
		this.status = status;
		this.orderdate = orderdate;
	}
	public int getOrderid() {
		return orderid;
	}
	public void setOrderid(int orderid) {
		this.orderid = orderid;
	}
	public int getInvoicenumber() {
		return invoicenumber;
	}
	public void setInvoicenumber(int invoicenumber) {
		this.invoicenumber = invoicenumber;
	}
	public int getTotalprice() {
		return totalprice;
	}
	public void setTotalprice(int totalprice) {
		this.totalprice = totalprice;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getOrderdate() {
		return orderdate;
	}
	public void setOrderdate(String orderdate) {
		this.orderdate = orderdate;
	}
	@Override
	public String toString() {
		return "Orders [orderid=" + orderid + ", invoicenumber=" + invoicenumber + ", totalprice=" + totalprice
				+ ", status=" + status + ", orderdate=" + orderdate + "]";
	}
	
	
}


