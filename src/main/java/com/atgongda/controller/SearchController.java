package com.atgongda.controller;


import com.atgongda.entity.Article;
import com.atgongda.entity.SearchContent;
import com.atgongda.entity.User;
import com.atgongda.service.SearchService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;

import javax.naming.directory.SearchResult;

/**
 * 搜索控制
 * 1、根据作者名搜索
 * 2、根据文章名搜索
 *
 * @author sushuai
 * @date 2019/03/23/18:51
 */
@Controller
@RequestMapping("/search")
@SessionAttributes(value = "search")
public class SearchController {

    @Autowired
    private SearchService searchService;

    @RequestMapping("/mySearch")
    public String mySearch(String searchContent, Model model) {
        //1、根据用户名搜索
        System.out.println(searchContent);
        User searchResult = searchService.checkUser(searchContent);
        model.addAttribute("searchResult", searchResult);

        //2、根据文章名搜索
        Article searchResult2 = searchService.checkArticle(searchContent);
        model.addAttribute("searchResult2", searchResult2);

        return "search/searchResult";
    }
}
