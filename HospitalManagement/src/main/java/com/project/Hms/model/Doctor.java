package com.project.Hms.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Doctor {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long drid;
	private String drName;
	private String specialist;
	private String intime;
	private String outtime;
	
	
	
	public Doctor() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
	public Doctor(long drid, String drName, String specialist, String intime, String outtime) {
		super();
		this.drid = drid;
		this.drName = drName;
		this.specialist = specialist;
		this.intime = intime;
		this.outtime = outtime;
	}


	public long getDrid() {
		return drid;
	}
    public void setDrid(long drid) {
		this.drid = drid;
	}
    public String getDrName() {
		return drName;
	}
	public void setDrName(String drName) {
		this.drName = drName;
	}
	public String getSpecialist() {
		return specialist;
	}
	public void setSpecialist(String specialist) {
		this.specialist = specialist;
	}
	public String getIntime() {
		return intime;
	}
	public void setIntime(String intime) {
		this.intime = intime;
	}
	public String getOuttime() {
		return outtime;
	}
	public void setOuttime(String outtime) {
		this.outtime = outtime;
	}



	@Override
	public String toString() {
		return "Doctor [drid=" + drid + ", drName=" + drName + ", specialist=" + specialist + ", intime=" + intime
				+ ", outtime=" + outtime + "]";
	}
	
	
	
	
	
}
