package com.creasypita.spring.tx.dao;

import com.creasypita.spring.tx.model.Employee;

import java.util.List;

/**
 * Created by lujq on 10/9/2021.
 */
public interface EmployeeService {
    List<Employee> findAll();

    Employee findById(long id);

    int deleteById(long id);

    int insert(Employee employee);

    int update(Employee employee);
}
