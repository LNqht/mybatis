package com.hdjd.util;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;

public class MybatisUtil {
    private static SqlSessionFactory sqlSessionFactory;
    //使用静态代码块读取配置文件，初始化sqlSessionFactory
    static {
        String resource = "mybatis-config.xml";
        InputStream inputStream = null;
        try {
            //从文件中获取一个输入框
            inputStream = Resources.getResourceAsStream(resource);
            sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    //通过sqlSessionFactory得到sqlSession对象去操作数据库
    public static SqlSession getSqlSession() {
        return sqlSessionFactory.openSession();
    }
}
