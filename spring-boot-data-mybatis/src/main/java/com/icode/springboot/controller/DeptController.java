package com.icode.springboot.controller;

import com.icode.springboot.bean.Dept;
import com.icode.springboot.mapper.DeptMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Unicorn
 */
@RestController
public class DeptController {

    @Autowired
    DeptMapper deptMapper;

    @GetMapping("/dept/{id}")
    public Dept getDept(@PathVariable("id") Integer id) {
        return deptMapper.getDeptById(id);
    }

    @GetMapping("/dept")
    public Dept insertDept(Dept dept) {
        deptMapper.inserDept(dept);
        return dept;
    }
}
