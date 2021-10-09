package com.creasypita.spring.tx.dao;

import com.creasypita.spring.tx.model.Employee;
import com.creasypita.spring.tx.repository.EmployeeMyBatisRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by lujq on 10/9/2021.
 */
@Service
public class EmployeeServiceImpl implements EmployeeService {

    @Autowired
    private EmployeeMyBatisRepository employeeMyBatisRepository;

    public List<Employee> findAll(){
        return employeeMyBatisRepository.findAll();
    }


    public Employee findById(long id){
        return  employeeMyBatisRepository.findById(id);
    }


    public int deleteById(long id){
        return  employeeMyBatisRepository.deleteById(id);
    }


    public int insert(Employee employee){
        return employeeMyBatisRepository.insert(employee);
    }


    public int update(Employee employee){
        return employeeMyBatisRepository.update(employee);
    }
}
