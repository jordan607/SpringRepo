package com.nt.dao;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate4.HibernateTemplate;
import org.springframework.stereotype.Repository;

import com.nt.domain.StudentHLO;

 @Repository
public class StudentInsertDAOImpl implements StudentInsertDAO {
	 @Autowired
    private HibernateTemplate ht;
	 
	@Override
	public int insert(StudentHLO hlo) {
		int sno=0;
		ht.setCheckWriteOperations(false);
		sno=(int) ht.save(hlo);
		ht.flush();
		
		return sno;
	}

}
