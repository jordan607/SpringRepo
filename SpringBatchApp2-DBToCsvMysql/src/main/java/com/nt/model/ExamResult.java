package com.nt.model;

import java.sql.Date;

public class ExamResult {
	private int id;
	private int sem;
	private Date dob;
	private double percentage;
	


	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getSem() {
		return sem;
	}

	public void setSem(int sem) {
		this.sem = sem;
	}

	public Date getDob() {
		return dob;
	}
	
	public void setDob(Date dob) {
		this.dob = dob;
	}
	
	public double getPercentage() {
		return percentage;
	}
	
	public void setPercentage(double percentage) {
		this.percentage = percentage;
	}

	@Override
	public String toString() {
		return "ExamResult [id=" + id + ", sem=" + sem + ", dob=" + dob + ", percentage=" + percentage + "]";
	}

	
	
	
}
