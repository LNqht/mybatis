import com.hdjd.dao.EmployeeMapper;
import com.hdjd.dao.UserMapper;
import com.hdjd.pojo.Employee;
import com.hdjd.pojo.User;
import com.hdjd.util.MybatisUtil;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class UserTest {
    @Test
    public void userTest1() {
        //获取SqlSession对象
        SqlSession sqlSession = MybatisUtil.getSqlSession();
        //执行sql语句
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        List<User> list = mapper.getAllUser();
        for(User user : list) {
            System.out.println(user);
        }
        //关闭sqlSession
        sqlSession.close();
    }
    @Test
    public void userTest2() {
        //获取SqlSession对象
        SqlSession sqlSession = MybatisUtil.getSqlSession();
        //执行sql语句
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        User user = mapper.getUserById(2);
        System.out.println(user);
        //关闭sqlSession
        sqlSession.close();
    }
    @Test
    public void userTest3() {
        //获取SqlSession对象
        SqlSession sqlSession = MybatisUtil.getSqlSession();
        //执行sql语句
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        User user = new User(111,"hongtao","123456");
        int i = mapper.addUser(user);
        System.out.println(user);
        //如果是增删改则需要提交事务
        if(i > 0) {
            sqlSession.commit();
        }
        //关闭sqlSession
        sqlSession.close();
    }
    @Test
    public void userTest4() {
        //获取SqlSession对象
        SqlSession sqlSession = MybatisUtil.getSqlSession();
        //执行sql语句
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        List<User> list = mapper.getUserNameLike("%a%");
        for (User user : list) {
            System.out.println(user);
        }
        //关闭sqlSession
        sqlSession.close();
    }
    @Test
    public void userTest5() {
        //获取SqlSession对象
        SqlSession sqlSession = MybatisUtil.getSqlSession();
        //执行sql语句
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        //初始化一个map
        Map<String, Object> map = new HashMap<String, Object>();
        //map的key值就是mapper.xml文件中的参数名
        map.put("username","xiaoqiang");
        map.put("password","666666");
        int i = mapper.addUser2(map);
        //如果是增删改则需要提交事务
        if(i > 0) {
            sqlSession.commit();
        }
        //关闭sqlSession
        sqlSession.close();
    }
    @Test
    public void userTest6() {
        //获取SqlSession对象
        SqlSession sqlSession = MybatisUtil.getSqlSession();
        //执行sql语句
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        User user = mapper.getUserByName("QHT");
        System.out.println(user);
        //关闭sqlSession
        sqlSession.close();
    }
    @Test
    public void userTest7() {
        //获取SqlSession对象
        SqlSession sqlSession = MybatisUtil.getSqlSession();
        //执行sql语句
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        List<User> list = mapper.findUserByUser(new User("QHT"));
        for (User user : list) {
            System.out.println(user);
        }
        //关闭sqlSession
        sqlSession.close();
    }
    @Test
    public void userTest8() {
        //获取SqlSession对象
        SqlSession sqlSession = MybatisUtil.getSqlSession();
        //执行sql语句
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        mapper.select(new User("Q"));
        //关闭sqlSession
        sqlSession.close();
    }
    @Test
    public void userTest9() {
        //获取SqlSession对象
        SqlSession sqlSession = MybatisUtil.getSqlSession();
        //执行sql语句
        //会执行两个sql语句
        EmployeeMapper employeeMapper = sqlSession.getMapper(EmployeeMapper.class);
        List<Employee> list = employeeMapper.findAllEmp();
        for (Employee employee : list) {
            System.out.println(employee);
        }
        //关闭sqlSession
        sqlSession.close();
    }
    @Test
    public void userTest10() {
        //获取SqlSession对象
        SqlSession sqlSession = MybatisUtil.getSqlSession();
        //执行sql语句
        //会执行两个sql语句
        //按结果嵌套，只执行一个sql语句
        EmployeeMapper employeeMapper = sqlSession.getMapper(EmployeeMapper.class);
        List<Employee> list = employeeMapper.findAllEmp2();
        for (Employee employee : list) {
            System.out.println(employee);
        }
        //关闭sqlSession
        sqlSession.close();
    }














//    @Test
//    public void userTest4() {
//        //获取SqlSession对象
//        SqlSession sqlSession = MybatisUtil.getSqlSession();
//        //执行sql语句
//        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
//        User user = new User(1,"QHT","123456");
//        int i = mapper.updateUserById(user);
//        //如果是增删改则需要提交事务
//        if(i > 0) {
//            sqlSession.commit();
//        }
//        //关闭sqlSession
//        sqlSession.close();
//    }
//    @Test
//    public void userTest5() {
//        //获取SqlSession对象
//        SqlSession sqlSession = MybatisUtil.getSqlSession();
//        //执行sql语句
//        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
//        int i = mapper.deleteUserById(8);
//        if(i > 0) {
//            sqlSession.commit();
//        }
//        //如果是增删改则需要提交事务
//        //关闭sqlSession
//        sqlSession.close();
//    }
}
