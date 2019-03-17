package service;

import com.atgongda.service.MyBlogService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @author sushuai
 * @date 2019/03/15/16:23
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath:spring/spring-dao.xml", "classpath:spring/spring-service.xml"})
public class MyBlogServiceTest {

    @Autowired
    private MyBlogService myBlogService;


    /**
     * 查询userId=1的博客列表
     */
    @Test
    public void m1(){
        System.out.println(myBlogService.queryMyBlogList((long) 1));//博主id
    }

    /**
     * 查看articleId=31的博客
     */
    @Test
    public void m2(){
        System.out.println(myBlogService.queryMyBlog((long) 30));//博客id
    }
}
