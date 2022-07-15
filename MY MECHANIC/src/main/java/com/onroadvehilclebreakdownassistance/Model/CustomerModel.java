package com.onroadvehilclebreakdownassistance.Model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="Customer")
public class CustomerModel {
	
	@Column(name="Customer_id")
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int Customer_id;
	@Column(name="Customer_name")
	private String Customer_name;
	@Column(name="Customer_pno")
	private int Customer_pno;
	@Column(name="Customer_location")
	private String Customer_location;
	@Column(name="Customer_feedback")
	private String Customer_feedback;
	public int getCustomer_id() {
		return Customer_id;
	}
	public void setCustomer_id(int customer_id) {
		Customer_id = customer_id;
	}
	public String getCustomer_name() {
		return Customer_name;
	}
	public void setCustomer_name(String customer_name) {
		Customer_name = customer_name;
	}
	public int getCustomer_pno() {
		return Customer_pno;
	}
	public void setCustomer_pno(int customer_pno) {
		Customer_pno = customer_pno;
	}
	public String getCustomer_location() {
		return Customer_location;
	}
	public void setCustomer_location(String customer_location) {
		Customer_location = customer_location;
	}
	public String getCustomer_feedback() {
		return Customer_feedback;
	}
	public void setCustomer_feedback(String customer_feedback) {
		Customer_feedback = customer_feedback;
	}
	@Override
	public String toString() {
		return "CustomerModel [Customer_id=" + Customer_id + ", "
				+ (Customer_name != null ? "Customer_name=" + Customer_name + ", " : "") + "Customer_pno="
				+ Customer_pno + ", "
				+ (Customer_location != null ? "Customer_location=" + Customer_location + ", " : "")
				+ (Customer_feedback != null ? "Customer_feedback=" + Customer_feedback : "") + "]";
	}
	
	
}
