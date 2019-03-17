package dao;

import com.atgongda.dao.CommentMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @author sushuai
 * @date 2019/03/17/21:39
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:spring/spring-dao.xml")
public class CommentDaoTest {

    @Autowired
    private CommentMapper commentMapper;

    /**
     * 评论dao测试
     */
    @Test
    public void m1(){
        boolean flag = commentMapper.insertComment((long) 33, "王五","李四","评论dao测试");
        System.out.println(flag);
    }
}
