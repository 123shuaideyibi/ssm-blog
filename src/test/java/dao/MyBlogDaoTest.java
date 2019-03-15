package dao;

import com.atgongda.dao.MyBlogMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @author sushuai
 * @date 2019/03/15/16:19
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:spring/spring-dao.xml")
public class MyBlogDaoTest {

    @Autowired
    private MyBlogMapper myBlogMapper;

    /**
     * 查询当前登录用户的所有博客
     */
    @Test
    public void m1(){
        System.out.println(myBlogMapper.queryMyBlog((long) 31));
    }
}
