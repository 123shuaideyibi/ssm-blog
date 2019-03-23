package com.atgongda.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;

/**
 * @author sushuai
 * @date 2019/03/23/18:51
 */
@Controller
@RequestMapping("/search")
@SessionAttributes(value = "search")
public class SearchController {

    @RequestMapping("/mySearch")
    public String mySearch(){

        return "search/searchResult";
    }
}
