package dao;

import com.atgongda.dao.MessageMapper;
import com.atgongda.entity.Comment;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

/**
 * @author sushuai
 * @date 2019/03/17/22:54
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:spring/spring-dao.xml")
public class MessageDaoTest {

    @Autowired
    private MessageMapper messageMapper;

    /**
     * 查看我的评论列表
     */
    @Test
    public void m1(){
        List<Comment> list = messageMapper.queryMyMessageList("李四");
        System.out.println(list);
    }
}
