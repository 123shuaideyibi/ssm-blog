package com.atgongda.controller;

import com.atgongda.entity.Article;
import com.atgongda.service.ViewBlogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;

import java.util.List;

/**
 * 查看文章控制器
 *
 * @author sushuai
 * @date 2019/03/15/20:15
 */
@Controller
@RequestMapping("viewBlog")
@SessionAttributes(value = "myArticle")
public class ViewBlogController {

    @Autowired
    private ViewBlogService viewBlogService;

    /**
     * 在我的博客当中点击查看博客，将文章的articleId传递到ViewBlogController，然后通过该articleId来查看整篇文章的数据，
     * 将得到的文章信息在专门的放置阅读博客的jsp下供阅读
     *
     * @param articleId
     * @return
     */
    @RequestMapping("/showMyBlog/{articleId}")
    public String showMyBlog(@PathVariable("articleId") Long articleId, Model model) {
        System.out.println(articleId);
        //查看我的博客

        List<Article> list = viewBlogService.queryMyBlog(articleId);
        //将获得的article全部信息放入session
        model.addAttribute("myArticle", list);

        return "common/viewMyBlog";
    }
}
