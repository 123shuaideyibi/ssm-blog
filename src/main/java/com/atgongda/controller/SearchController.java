package com.atgongda.controller;


import com.atgongda.entity.SearchContent;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;

/**
 * 搜索控制
 * 1、根据文章搜索
 * 2、根据作者搜索
 * @author sushuai
 * @date 2019/03/23/18:51
 */
@Controller
@RequestMapping("/search")
@SessionAttributes(value = "search")
public class SearchController {

    @RequestMapping("/mySearch")
    public String mySearch(SearchContent searchContent, Model model){
        System.out.println(searchContent);
        model.addAttribute("searchContent",searchContent);
        return "search/searchResult";
    }
}
