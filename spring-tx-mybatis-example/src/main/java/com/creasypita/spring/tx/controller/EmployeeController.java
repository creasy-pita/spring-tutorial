package com.creasypita.spring.tx.controller;

import com.creasypita.spring.tx.dao.EmployeeService;
import com.creasypita.spring.tx.model.Employee;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by lujq on 10/9/2021.
 */
@RestController
public class EmployeeController {

    private static final Logger logger = LoggerFactory.getLogger(EmployeeController.class);
    @Autowired
    private EmployeeService employeeService;

    @GetMapping(value = "/getEmployee")
    public void getEmployee(){
//        Employee employee = employeeService.findById(10011);
        List<Employee> all = employeeService.findAll();
        logger.info("find employee {}",all);
    }
}
