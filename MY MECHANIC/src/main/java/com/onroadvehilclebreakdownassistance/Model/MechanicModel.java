package com.onroadvehilclebreakdownassistance.Model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="Mechanic")
public class MechanicModel {

	

	@Column(name="Mechanic_id")
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int Mechanic_id;
	@Column(name="Mechanic_name")
	private String Mechanic_name;
	@Column(name="Mechanic_location")
	private String Mechanic_location;
	@Column(name="Mechanic_pno")
	private int Mechanic_pno;
	@Column(name="Mechanic_feedback")
	private String Mechanic_feedback;
	public int getMechanic_id() {
		return Mechanic_id;
	}
	public void setMechanic_id(int mechanic_id) {
		Mechanic_id = mechanic_id;
	}
	public String getMechanic_name() {
		return Mechanic_name;
	}
	public void setMechanic_name(String mechanic_name) {
		Mechanic_name = mechanic_name;
	}
	public String getMechanic_location() {
		return Mechanic_location;
	}
	public void setMechanic_location(String mechanic_location) {
		Mechanic_location = mechanic_location;
	}
	public int getMechanic_pno() {
		return Mechanic_pno;
	}
	public void setMechanic_pno(int mechanic_pno) {
		Mechanic_pno = mechanic_pno;
	}
	public String getMechanic_feedback() {
		return Mechanic_feedback;
	}
	public void setMechanic_feedback(String mechanic_feedback) {
		Mechanic_feedback = mechanic_feedback;
	}
	@Override
	public String toString() {
		return "MechanicModel [Mechanic_id=" + Mechanic_id + ", "
				+ (Mechanic_name != null ? "Mechanic_name=" + Mechanic_name + ", " : "")
				+ (Mechanic_location != null ? "Mechanic_location=" + Mechanic_location + ", " : "") + "Mechanic_pno="
				+ Mechanic_pno + ", " + (Mechanic_feedback != null ? "Mechanic_feedback=" + Mechanic_feedback : "")
				+ "]";
	}
	
	
}
