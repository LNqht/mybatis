package com.hdjd.dao;

import com.hdjd.pojo.Employee;

import java.util.List;

public interface EmployeeMapper {
    //按查询嵌套
    List<Employee> findAllEmp();
    //按结果嵌套
    List<Employee> findAllEmp2();
    //根据部门id查找员工
    List<Employee> findEmpByDid(int did);
}
