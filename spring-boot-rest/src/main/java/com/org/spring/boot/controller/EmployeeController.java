package com.org.spring.boot.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.org.spring.boot.model.Employee;

@RestController
public class EmployeeController {

    //http://localhost:8080/
    @RequestMapping("/")
    public List<Employee> getEmployees() {
        List<Employee> employeesList = new ArrayList<>();
        employeesList.add(new Employee(1, "Himansu", "Nayak", "himansuxnayak@gmail.com"));
        return employeesList;
    }

}
