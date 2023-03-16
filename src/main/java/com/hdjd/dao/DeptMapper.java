package com.hdjd.dao;

import com.hdjd.pojo.Dept;

import java.util.List;

public interface DeptMapper {
    List<Dept> selectById(int id);
    //根据id查部门
    Dept selectById2(int id);
}
