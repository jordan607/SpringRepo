package com.nt.model;



import java.sql.Date;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

@XmlRootElement(name = "ExamResult")
public class ExamResult {

	private int id;
	private int sem;
	private Date dob;
	private double percentage;
	
	@XmlElement(name = "id")
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	@XmlElement(name = "sem")
	public int getSem() {
		return sem;
	}

	public void setSem(int sem) {
		this.sem = sem;
	}


	@XmlElement(name = "dob")
	@XmlJavaTypeAdapter(type =Date.class, value = com.nt.adapter.SQLDateAdapter.class)
	public Date getDob() {
		return dob;
	}

	public void setDob(Date dob) {
		this.dob = dob;
	}

	@XmlElement(name = "percentage")
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
