package dao;

import com.atgongda.dao.ViewBlogMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @author sushuai
 * @date 2019/03/15/22:53
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:spring/spring-dao.xml")
public class ViewBlogDaoTest {
    @Autowired
    private ViewBlogMapper viewBlogMapper;

    /**
     * 在我的博客里点击查看文章
     */
    @Test
    public void m1(){
        System.out.println(viewBlogMapper.queryMyBlog((long) 25));
    }
}
