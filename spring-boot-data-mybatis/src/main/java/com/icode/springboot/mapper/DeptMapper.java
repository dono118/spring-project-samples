package com.icode.springboot.mapper;

import com.icode.springboot.bean.Dept;
import org.apache.ibatis.annotations.*;

/**
 * @author Unicorn
 */
//@Mapper
public interface DeptMapper {

    @Select("select * from dept where id=#{id}")
    public Dept getDeptById(Integer id);

    @Options(useGeneratedKeys = true, keyProperty = "id")
    @Insert("insert into dept(dept_name) values(#{deptName})")
    public int inserDept(Dept dept);

    @Update("update dept set dept_name=#{deptName} where id=#{id}")
    public int updateDept(Dept dept);

    @Delete("delete from dept where id=#{id}")
    public int deleteDeptById(Integer id);
}
