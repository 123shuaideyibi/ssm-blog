package service;

import com.atgongda.service.AllBlogService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @author sushuai
 * @date 2019/03/16/17:38
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath:spring/spring-dao.xml", "classpath:spring/spring-service.xml"})
public class AllBlogServiceTest {
    @Autowired
    private AllBlogService allBlogService;

    /**
     * 查询全部的博客的列表
     */
    @Test
    public void m1(){
        System.out.println(allBlogService.queryAllBlogList());
    }

    /**
     * 查看全部的博客
     */
    @Test
    public void m2(){
        System.out.println(allBlogService.queryAllBlog((long) 33));
    }
}
