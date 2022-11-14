package com.assignment.service;

import com.assignment.model.EmployeeModel;

import java.util.List;

public interface IEmployeeService {
    public EmployeeModel addEmployee(EmployeeModel employeeModel);
    public List<EmployeeModel> viewEmployee();
    public EmployeeModel updateEmployee(long id, EmployeeModel employeeModel);
    public void deleteEmployee(long id);
}
