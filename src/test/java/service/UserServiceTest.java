package service;

import com.atgongda.dao.UserMapper;
import com.atgongda.entity.User;
import com.atgongda.service.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @author sushuai
 * @RunWith就是一个运行器 SpringJUnit4ClassRunner.class 就是指用SpringJUnit4ClassRunner来运行，让测试运行于spring测试环境
 * @ContextConfiguration Spring整合JUnit4测试时，使用注解引入多个配置文件
 * @date 2019/03/03/22:36
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath:spring/spring-dao.xml", "classpath:spring/spring-service.xml"})
public class UserServiceTest {

    @Autowired
    private UserService userService;


    /**
     * 1、验证用户名和密码是否都正确
     */
    @Test
    public void checkLogin() {
        System.out.println(userService.checkLogin("张三", "123"));
    }

    /**
     * 3、更新用户的信息
     */
    @Test
    public void checkModify() {
        Long userId = Long.valueOf(2);
        String userName = "王五";
        String userPassword = "123";
        String userPhone = "service测试";
        String userEmail = "service测试";
        boolean flag = userService.checkModify(userId, userName, userPassword, userPhone, userEmail);

        System.out.println(flag);
    }

}
