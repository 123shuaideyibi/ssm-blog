package service;

import com.atgongda.service.OtherBlogService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @author sushuai
 * @date 2019/03/20/11:27
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath:spring/spring-dao.xml", "classpath:spring/spring-service.xml"})
public class OtherBlogServiceTest {
    @Autowired
    private OtherBlogService otherBlogService;

    /**
     * 查询其它的博客列表
     */
    @Test
    public void m1(){
        System.out.println(otherBlogService.queryOtherBlogList());
    }

    /**
     * 查看其它的博客
     */
    @Test
    public void m2(){
        System.out.println(otherBlogService.queryOtherBlog((long) 34));
    }
}
