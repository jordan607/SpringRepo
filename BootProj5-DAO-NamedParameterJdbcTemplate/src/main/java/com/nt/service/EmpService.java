package com.nt.service;

import java.util.List;

import com.nt.dto.EmployeeDTO;

public interface EmpService {
  public  int findEmpCount();
  public List<EmployeeDTO> findEmployeesByDesg(String desg);
}
