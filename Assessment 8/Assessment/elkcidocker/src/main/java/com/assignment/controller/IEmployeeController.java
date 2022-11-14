package com.assignment.controller;

import com.assignment.model.EmployeeModel;
import org.springframework.web.bind.annotation.*;

import java.util.List;

public interface IEmployeeController {

    @PostMapping("/addEmployee")
    public EmployeeModel addEmployee(@RequestBody EmployeeModel employeeModel);

    @GetMapping("/viewEmployee")
    public List<EmployeeModel> viewEmployee();

    @PutMapping("/updateEmployee/{id}")
    public EmployeeModel updateEmployee(@PathVariable("id") long id, @RequestBody EmployeeModel employeeModel);

    @DeleteMapping("/deleteEmployee/{id}")
    public void deleteEmployee(@PathVariable("id") long id);
}
