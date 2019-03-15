package com.atgongda.controller;

import com.atgongda.entity.User;
import com.atgongda.service.UserListService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;

import java.util.List;

/**
 * @author sushuai
 * @date 2019/03/14/21:59
 */
@Controller
@RequestMapping("/users")
@SessionAttributes(value = "users")
public class UserListController {

    @Autowired
    private UserListService userListService;

    /**
     * 查询所有用户的信息
     *
     * @param model
     * @return
     */
    @RequestMapping(value = "/showAllUser")
    public String userList(Model model) {
        System.out.println("main");
        List<User> list = userListService.queryAllUser();
        model.addAttribute("users", list);
        return "back/userList";

    }
}
