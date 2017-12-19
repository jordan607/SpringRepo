package com.nt.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;

import org.springframework.jdbc.core.RowMapper;

import com.nt.model.ExamResult;



public class ExamResultRowMapper implements RowMapper<ExamResult>{

	public ExamResult mapRow(ResultSet rs, int rowNum) throws SQLException {
		ExamResult result =null;
		result=new ExamResult();
		result.setId(rs.getInt("id"));
		result.setSem(rs.getInt("Semester"));
		result.setDob(rs.getDate("dob"));
		result.setPercentage(rs.getDouble("percentage"));	
		return result;
	} 

}
