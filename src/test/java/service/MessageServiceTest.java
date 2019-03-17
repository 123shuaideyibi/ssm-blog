package service;

import com.atgongda.entity.Comment;
import com.atgongda.service.MessageService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

/**
 * @author sushuai
 * @date 2019/03/17/22:57
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath:spring/spring-dao.xml", "classpath:spring/spring-service.xml"})
public class MessageServiceTest {
    @Autowired
    private MessageService messageService;

    /**
     * 查看我的评论列表
     */
    @Test
    public void m1(){
        List<Comment> list = messageService.queryMyMessageList("李四");
        System.out.println(list);
    }
}
