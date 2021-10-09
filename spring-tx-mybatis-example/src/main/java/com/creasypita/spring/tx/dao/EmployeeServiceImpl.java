package com.creasypita.spring.tx.dao;

import com.creasypita.spring.tx.model.Employee;
import com.creasypita.spring.tx.repository.EmployeeMyBatisRepository;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by lujq on 10/9/2021.
 */
@Service
public class EmployeeServiceImpl {

    @Autowired
    private EmployeeMyBatisRepository employeeMyBatisRepository;

    public List<Employee> findAll(){
        return null;
    }


    public Employee findById(long id){
        return  null;
    }


    public int deleteById(long id){
        return  0;
    }


    public int insert(Employee employee){
        return 0;
    }


    public int update(Employee employee){
        return 0;
    }
}
