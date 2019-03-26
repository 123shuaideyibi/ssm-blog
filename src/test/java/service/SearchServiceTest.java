package service;

import com.atgongda.service.SearchService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @author sushuai
 * @date 2019/03/25/13:52
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath:spring/spring-dao.xml", "classpath:spring/spring-service.xml"})
public class SearchServiceTest {

    @Autowired
    private SearchService searchService;

    /**
     * 根据用户名搜索
     */
    @Test
    public void m1(){
        System.out.println(searchService.checkUser("李四"));
    }

    /**
     * 根据文章名搜索
     */
    @Test
    public void m2(){
        System.out.println(searchService.checkArticle("dao测试标题"));
    }
}
