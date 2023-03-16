package com.hdjd.dao;

import com.hdjd.pojo.Dept;

import java.util.List;

public interface DeptMapper {
    List<Dept> selectById(int id);
}
