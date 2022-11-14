package com.assignment.service;

import com.assignment.model.EmployeeModel;
import com.assignment.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeServiceImpl implements IEmployeeService{

    @Autowired
    private EmployeeRepository employeeRepository;

    @Override
    public EmployeeModel addEmployee(EmployeeModel employeeModel) {
        return employeeRepository.save(employeeModel);
    }

    @Override
    public List<EmployeeModel> viewEmployee() {
        return employeeRepository.findAll();
    }

    @Override
    public EmployeeModel updateEmployee(long id, EmployeeModel employeeModel) {
        return employeeRepository.save(employeeModel);
    }

    @Override
    public void deleteEmployee(long id) {
        employeeRepository.deleteById(id);
    }
}
