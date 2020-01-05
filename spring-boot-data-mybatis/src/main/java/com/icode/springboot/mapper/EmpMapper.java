package com.icode.springboot.mapper;

import com.icode.springboot.bean.Emp;

/**
 * @author Unicorn
 */
//@Mapper或者@MapperScan将接口扫描装配到容器中
public interface EmpMapper {

    public Emp getEmpById(Integer id);

    public void insertEmp(Emp emp);
}
