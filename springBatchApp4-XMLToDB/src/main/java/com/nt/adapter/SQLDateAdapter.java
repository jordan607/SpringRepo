package com.nt.adapter;

import java.sql.Date;

import javax.xml.bind.annotation.adapters.XmlAdapter;

public class SQLDateAdapter extends XmlAdapter<String, Date>{

	public Date unmarshal(String d) throws Exception {
		return java.sql.Date.valueOf(d);
	}

	public String marshal(Date d) throws Exception {
		return d.toString();
	}

}