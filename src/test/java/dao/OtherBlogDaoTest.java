package dao;

import com.atgongda.dao.OtherBlogMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @author sushuai
 * @date 2019/03/20/11:25
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:spring/spring-dao.xml")
public class OtherBlogDaoTest {
    @Autowired
    private OtherBlogMapper otherBlogMapper;

    /**
     * 查看其它的博客列表
     */
    @Test
    public void m1(){
        System.out.println(otherBlogMapper.queryOtherBlogList());
    }

    @Test
    public void m2(){
        System.out.println(otherBlogMapper.queryOtherBlog((long) 34));
    }
}
