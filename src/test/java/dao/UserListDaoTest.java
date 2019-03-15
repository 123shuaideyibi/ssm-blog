package dao;

import com.atgongda.dao.UserListMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @author sushuai
 * @date 2019/03/14/22:49
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:spring/spring-dao.xml")
public class UserListDaoTest {
    @Autowired
    private UserListMapper userListMapper;

    @Test
    public void m1(){
        System.out.println(userListMapper.queryAllUser());
    }
}
