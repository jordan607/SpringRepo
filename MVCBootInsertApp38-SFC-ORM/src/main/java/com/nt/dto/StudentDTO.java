package com.nt.dto;

import java.io.Serializable;

public class StudentDTO implements Serializable {
	private String sname;
	private String sadd;

	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public String getSadd() {
		return sadd;
	}
	public void setSadd(String sadd) {
		this.sadd = sadd;
	}

}
