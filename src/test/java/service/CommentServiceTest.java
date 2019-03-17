package service;

import com.atgongda.service.CommentService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @author sushuai
 * @date 2019/03/17/21:47
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath:spring/spring-dao.xml", "classpath:spring/spring-service.xml"})
public class CommentServiceTest {
    @Autowired
    private CommentService commentService;

    /**
     * 评论service测试
     */
    @Test
    public void m1(){
        boolean flag = commentService.checkComment((long) 34,"张三","李四","好文章，写得好");
        System.out.println(flag);
    }
}
