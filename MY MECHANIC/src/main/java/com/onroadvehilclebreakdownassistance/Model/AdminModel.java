package com.onroadvehilclebreakdownassistance.Model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="Admin")
public class AdminModel {
	
	@Column(name="Admin_id")
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int Admin_id;
	@Column(name="Admin_name")
	private String Admin_name;
	@Column(name="Customer_id")
	private int Customer_id;
	@Column(name="Mechanic_id")
	private int Mechanic_id;
	@Column(name="Customer_feedback")
	private String Customer_feedback;
	
	public int getAdmin_id() {
		return Admin_id;
	}
	public void setAdmin_id(int admin_id) {
		Admin_id = admin_id;
	}
	public String getAdmin_name() {
		return Admin_name;
	}
	public void setAdmin_name(String admin_name) {
		Admin_name = admin_name;
	}
	public int getCustomer_id() {
		return Customer_id;
	}
	public void setCustomer_id(int customer_id) {
		Customer_id = customer_id;
	}
	public int getMechanic_id() {
		return Mechanic_id;
	}
	public void setMechanic_id(int mechanic_id) {
		Mechanic_id = mechanic_id;
	}
	public String getCustomer_feedback() {
		return Customer_feedback;
	}
	public void setCustomer_feedback(String customer_feedback) {
		Customer_feedback = customer_feedback;
	}
	public String getMechanic_feedback() {
		return Mechanic_feedback;
	}
	public void setMechanic_feedback(String mechanic_feedback) {
		Mechanic_feedback = mechanic_feedback;
	}
	@Column(name="Mechanic_feedback")
	private String Mechanic_feedback;

	@Override
	public String toString() {
		return "AdminModel [Admin_id=" + Admin_id + ", " + (Admin_name != null ? "Admin_name=" + Admin_name + ", " : "")
				+ "Customer_id=" + Customer_id + ", Mechanic_id=" + Mechanic_id + ", "
				+ (Customer_feedback != null ? "Customer_feedback=" + Customer_feedback + ", " : "")
				+ (Mechanic_feedback != null ? "Mechanic_feedback=" + Mechanic_feedback : "") + "]";
	}
	
	
}

