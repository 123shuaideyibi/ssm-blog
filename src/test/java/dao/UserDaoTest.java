package dao;

import com.atgongda.dao.UserMapper;
import com.atgongda.entity.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

/**
 * 记住@Test前往不要忘写
 *
 * @author sushuai
 * @RunWith就是一个运行器 SpringJUnit4ClassRunner.class 就是指用SpringJUnit4ClassRunner来运行，让测试运行于spring测试环境
 * @ContextConfiguration Spring整合JUnit4测试时，使用注解引入多个配置文件
 * @date 2019/03/03/22:36
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:spring/spring-dao.xml")
public class UserDaoTest {

    @Autowired
    private UserMapper userMapper;


    /**
     * 1、通过用户名查询用户（登录、注册、修改）
     */
    @Test
    public void m1() {
        System.out.println(userMapper.findByUserName("张三"));
    }

    /**
     * 2、注册时往user表里面插入数据
     */
    @Test
    public void m2() {
        System.out.println(userMapper.insertUser("a", "a"));
    }

    /**
     * 3、修改用户基本信息
     */
    @Test
    public void m3() {
        Long userId = Long.valueOf(2);
        String userName = "王五";
        String userPassword = "123";
        String userPhone = "dao测试";
        String userEmail = "dao测试";
        boolean flag = userMapper.updateUserInfo(userId, userName, userPassword, userPhone, userEmail);

        System.out.println(flag);

    }


}
