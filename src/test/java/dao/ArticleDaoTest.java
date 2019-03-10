package dao;

import com.atgongda.dao.ArticleMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @author sushuai
 * @date 2019/03/10/12:16
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:spring/spring-dao.xml")
public class ArticleDaoTest {
    @Autowired
    private ArticleMapper articleMapper;

    /**
     * 写博客dao测试
     */
    @Test
    public void insertArticle(){
        boolean flag = articleMapper.insertArticle((long) 2,"dd","ddd","ddd","ddd");
        System.out.println(flag);
    }

}
