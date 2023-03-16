package com.hdjd.dao;

import com.hdjd.pojo.User;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

public interface UserMapper {
    //获取所有用户的方法
    List<User> getAllUser();
    //根据ID查找用户的方法
    User getUserById(int id);
    //新增用户
    int addUser(User user);
    //模糊查询的方法
    List<User> getUserNameLike(@Param("va") String value);
    //使用mapper传参

    int addUser2(Map<String,Object> map);
    User getUserByName(String name);
    //通过User对象查找用户的方法
    List<User> findUserByUser(User user);
    //动态sql中trim的用法
    List<User> select(User user);
    //修改用户
    int updateUserById(User user);
    //删除用户
    int deleteUserById(int id);


}
