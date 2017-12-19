package com.nt.batchSetter;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import org.springframework.batch.item.database.ItemPreparedStatementSetter;

import com.nt.model.ExamResult;


public class ExamResultItemPreparedStatementSetter implements ItemPreparedStatementSetter<ExamResult> {

	public void setValues(ExamResult result, PreparedStatement ps) throws SQLException {
		ps.setInt(1, result.getId());
		ps.setInt(2,result.getSem());
		ps.setDouble(3, result.getPercentage());
		ps.setDate(4,result.getDob() );
	}

}