package com.assignment.controller;

import com.assignment.model.EmployeeModel;
import com.assignment.service.EmployeeServiceImpl;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/Employee")
public class EmployeeControllerImpl implements IEmployeeController {

    @Autowired
    private static final Logger log = LogManager.getLogger(EmployeeControllerImpl.class);

    @Autowired
    private EmployeeServiceImpl employeeService;

    @Override
    public EmployeeModel addEmployee(EmployeeModel employeeModel) {
        log.info("Adding Employee");
        return employeeService.addEmployee(employeeModel);
    }

    @Override
    public List<EmployeeModel> viewEmployee() {
        log.info("Viewing Employee");
        return employeeService.viewEmployee();
    }

    @Override
    public EmployeeModel updateEmployee(long id, EmployeeModel employeeModel) {
        log.info("Updating Employee");
        return employeeService.updateEmployee(id, employeeModel);
    }

    @Override
    public void deleteEmployee(long id) {
        log.info("Deleting Employee");
        employeeService.deleteEmployee(id);
    }
}
