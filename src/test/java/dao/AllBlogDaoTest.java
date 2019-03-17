package dao;

import com.atgongda.dao.AllBlogMapper;
import com.atgongda.entity.AllArticle;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

/**
 * @author sushuai
 * @date 2019/03/16/17:36
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:spring/spring-dao.xml")
public class AllBlogDaoTest {

    @Autowired
    private AllBlogMapper allBlogMapper;

    /**
     * 查看首页的博客的列表
     */
    @Test
    public void m1(){
        System.out.println(allBlogMapper.queryAllBlogList());
    }


    /**
     * 查看首页的博客
     */
    @Test
    public void m2(){
        System.out.println(allBlogMapper.queryAllBlog((long) 33));
    }
}
