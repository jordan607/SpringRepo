package com.nt.dao;

import javax.inject.Inject;
import javax.inject.Named;
import javax.sql.DataSource;

import org.springframework.jdbc.core.namedparam.BeanPropertySqlParameterSource;
import org.springframework.jdbc.core.simple.SimpleJdbcInsert;

import com.nt.bo.StudentBO;

@Named("stDAO")
public class StudentDAOImpl implements StudentDAO {
	private SimpleJdbcInsert sji;
	
	@Inject
	public StudentDAOImpl(DataSource ds){
		sji=new SimpleJdbcInsert(ds);
	}
	@Override
	public int insert(StudentBO bo) {
		BeanPropertySqlParameterSource source=null;
		int count=0;
		//set table name
		sji.setTableName("student");
		//prepare col names and values
		source=new BeanPropertySqlParameterSource(bo);
		count=sji.execute(source);
		return count;
	}

}
