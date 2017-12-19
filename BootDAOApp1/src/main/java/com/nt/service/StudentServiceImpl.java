package com.nt.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nt.dao.StudentDAO;

@Service("stService")
public class StudentServiceImpl implements StudentService {
	@Autowired
   private StudentDAO dao;
	@Override
	public int findStudentsCount() {
		//use DAO
			return dao.getStudentsCount();
	}
}
