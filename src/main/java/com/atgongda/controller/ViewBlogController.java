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
@SessionAttributes(value = {"myArticle","allArticle"})
public class ViewBlogController {

    @Autowired
    private ViewBlogService viewBlogService;

    /**
     * 后台管理->我的博客管理->点击查看
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


    /**
     * 分类->展示全部博客
     * @return
     */
    @RequestMapping("/showAllBlog")
    public String showAllBlog(Model model){
        List<Article> list = viewBlogService.queryAllBlog();
        model.addAttribute("allArticle",list);
        return "sort/allList";
    }
    /**
     * 展示全部博客->点击查看
     * @return
     */
    @RequestMapping("viewAllBlog/{articleId}")
    public String viewAllBlog(@PathVariable("articleId") Long articleId){
        System.out.println(articleId);
        return "common/viewBlog";
    }




}
