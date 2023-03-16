package com.hdjd.dao;

import com.hdjd.pojo.Employee;

import java.util.List;

public interface EmployeeMapper {
    //按查询嵌套
    List<Employee> findAllEmp();
    //按结果嵌套
    List<Employee> findAllEmp2();
}
