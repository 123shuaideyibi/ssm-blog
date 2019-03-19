package service;


import com.atgongda.service.AfterBlogService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @author sushuai
 * @date 2019/03/18/21:14
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath:spring/spring-dao.xml", "classpath:spring/spring-service.xml"})
public class AfterBlogServiceTest {
    @Autowired
    private AfterBlogService afterBlogService;

    /**
     * 查询前端的博客列表
     */
    @Test
    public void m1(){
        System.out.println(afterBlogService.queryAfterBlogList());
    }

    /**
     * 查看后端的博客
     */
    @Test
    public void m3(){
        System.out.println(afterBlogService.queryAfterBlog((long) 35));
    }
}
