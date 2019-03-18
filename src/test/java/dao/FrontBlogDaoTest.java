package dao;

import com.atgongda.dao.FrontBlogMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.TestExecutionListeners;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @author sushuai
 * @date 2019/03/18/21:07
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:spring/spring-dao.xml")
public class FrontBlogDaoTest {

    @Autowired
    private FrontBlogMapper frontBlogMapper;

    /**
     * 查看前端的博客列表
     */
    @Test
    public void m1(){
        System.out.println(frontBlogMapper.queryFrontBlogList());
    }
}
