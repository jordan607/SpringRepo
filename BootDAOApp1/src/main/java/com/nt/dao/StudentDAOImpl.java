package com.nt.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository("stDAO")
public class StudentDAOImpl implements StudentDAO {
	private static final String  GET_STUDENTS_COUNT="SELECT COUNT(*) FROM STUDENT";
	@Autowired
	private JdbcTemplate jt;

	@Override
	public int getStudentsCount() {
		System.out.println(jt.getDataSource().getClass());
       int  count=0;
       count=jt.queryForObject(GET_STUDENTS_COUNT,Integer.class);
		return count;
	}

}
