package service;

import com.atgongda.service.ViewBlogService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @author sushuai
 * @date 2019/03/16/10:15
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath:spring/spring-dao.xml", "classpath:spring/spring-service.xml"})
public class ViewBlogServiceTest {

    @Autowired
    private ViewBlogService viewBlogService;

    /**
     * 在我的博客里，点击查看我的文章
     */
    @Test
    public void m1(){
        System.out.println(viewBlogService.queryMyBlog((long) 26));
    }

    /**
     * 查看全部的博客
     */
    @Test
    public void m2(){
        System.out.println(viewBlogService.queryAllBlog());
    }
}
