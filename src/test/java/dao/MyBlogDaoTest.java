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
     * 查询id=1的博主的博客列表
     */
    @Test
    public void m1(){
        System.out.println(myBlogMapper.queryMyBlogList((long) 1));//博客id
    }

    /**
     *查看articleId=29的文章
     */
    @Test
    public void m2(){
        System.out.println(myBlogMapper.queryMyBlog((long) 29));
    }


}
