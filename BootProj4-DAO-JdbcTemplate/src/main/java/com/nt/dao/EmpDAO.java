package com.nt.dao;

import java.util.List;

import com.nt.bo.EmployeeBO;

public interface EmpDAO {
  public int getEmpCount();
  public List<EmployeeBO>  getEmployeeDetailsByDesg(String desg);
}
