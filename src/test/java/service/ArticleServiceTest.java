package service;


import com.atgongda.service.ArticleService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @author sushuai
 * @date 2019/03/10/12:41
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath:spring/spring-dao.xml", "classpath:spring/spring-service.xml"})
public class ArticleServiceTest {
    @Autowired
    private ArticleService articleService;

    /**
     * 1、写博客
     */
    @Test
    public void m1(){
        boolean flag = articleService.upLoad((long) 1, "eee", "e", "2", "e");
        System.out.println("articleService测试的flag："+flag);
    }
}
