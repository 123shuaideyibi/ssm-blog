package dao;

import com.atgongda.dao.SearchMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @author sushuai
 * @date 2019/03/25/13:30
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:spring/spring-dao.xml")
public class SearchDaoTest {
    @Autowired
    private SearchMapper searchMapper;


    /**
     * 根据用户名搜索
     */
    @Test
    public void m1(){
        System.out.println(searchMapper.selectUser("张三"));
    }


    /**
     * 根据文章名搜索
     */
    @Test
    public void m2(){
        System.out.println(searchMapper.selectArticle("dao测试标题"));
    }
}
