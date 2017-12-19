package com.nt.service;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;
import javax.inject.Named;

import org.springframework.beans.BeanUtils;

import com.nt.bo.EmployeeBO;
import com.nt.dao.EmpDAO;
import com.nt.dto.EmployeeDTO;

@Named("empService")
public class EmpServiceImpl implements EmpService {
	@Resource
   private EmpDAO dao;
	@Override
	public int findEmpCount() {
		int count=0;
		//use dAO
       count=dao.getEmpCount();		
		return count;
	}
	@Override
	public List<EmployeeDTO> findEmployeesByDesg(String desg) {
		List<EmployeeDTO> listDTO=null;
		List<EmployeeBO> listBO=null;
		EmployeeDTO dto=null;
		//use DAO
		listBO=dao.getEmployeeDetailsByDesg(desg);
		//copy ListBO to ListDTO
		listDTO=new ArrayList();
		for(EmployeeBO bo:listBO){
			dto=new EmployeeDTO();
			BeanUtils.copyProperties(bo,dto);
			listDTO.add(dto);
		}
		return listDTO;
	}//method
}//class
