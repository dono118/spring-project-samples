package com.icode.springboot.controller;

import com.icode.springboot.bean.Emp;
import com.icode.springboot.mapper.EmpMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Unicorn
 */
@RestController
public class EmpController {

    @Autowired
    EmpMapper empMapper;

    @GetMapping("/emp/{id}")
    public Emp getEmp(@PathVariable Integer id) {
        return empMapper.getEmpById(id);
    }

    @GetMapping("/emp")
    public Emp insertEmp(Emp emp) {
        empMapper.insertEmp(emp);
        return emp;
    }
}
