package com.nt.service;



import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.nt.dao.StudentInsertDAO;
import com.nt.domain.StudentHLO;
import com.nt.dto.StudentDTO;


@Service
public class StudentInsertServiceImpl implements StudentInsertService {
	@Autowired
   private StudentInsertDAO dao;
	
	@Override
	//@Transactional(propagation=Propagation.REQUIRED,transactionManager="hbTxMgmr",readOnly=false)
	public String registerStudent(StudentDTO dto) {
		 StudentHLO hlo=null;
		 int sno=0;
		//convert DTO to HLO
		 hlo=new StudentHLO();
		BeanUtils.copyProperties(dto, hlo);
		//use DAO
		
		sno=dao.insert(hlo);
		return "Student is registred with id ::"+sno;
	}

}
