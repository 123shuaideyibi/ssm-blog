package dao;

import com.atgongda.dao.UserMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * 记住@Test前往不要忘写
 * @RunWith就是一个运行器
 * SpringJUnit4ClassRunner.class 就是指用SpringJUnit4ClassRunner来运行，让测试运行于spring测试环境
 *@ContextConfiguration Spring整合JUnit4测试时，使用注解引入多个配置文件
 *
 * @author sushuai
 * @date 2019/03/03/22:36
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:spring/spring-dao.xml")
public class DaoTest {

    @Autowired
    private UserMapper userMapper;


    /**
     * 1、登录时通过用户名查询用户
     */
    @Test
    public void findByUserName() {
        System.out.println(userMapper.findByUserName("张三"));
    }

    /**
     * 2、注册时往user表里面插入数据
     */
    @Test
    public void insertUser(){
        System.out.println(userMapper.insertUser("a","a"));
    }

}
