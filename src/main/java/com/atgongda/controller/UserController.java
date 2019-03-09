package com.atgongda.controller;


import com.atgongda.entity.User;
import com.atgongda.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.bind.support.SessionStatus;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * @author sushuai
 * @date 2019/03/04/6:09
 */
@Controller
@RequestMapping("/user")

//这里用了@SessionAttributes，可以直接把model中的user(也就key)放入其中
//这样保证了session中存在user这个对象
@SessionAttributes(value = "user")
public class UserController {
    @Autowired
    private UserService userService;

    @Autowired
    private HttpServletRequest request;


    /**
     * 1、登录表单提交过来的路径
     *
     * @param user
     * @param model
     * @return
     */
    @RequestMapping(value = "/checkLogin", method = RequestMethod.POST)
    public String checkLogin(User user, Model model) {//model用来返回数据
        user = userService.checkLogin(user.getUserName(), user.getUserPassword());
        //若有user则添加到model里并且跳转到成功页面
        if (user != null) {
            model.addAttribute("user", user);
            return "loginSuccess";
        }
        return null;
    }

    /**
     * 2、注册表单提交过来的路径
     *
     * @param user
     * @param model
     * @return
     */
    @RequestMapping(value = "/register", method = RequestMethod.POST)
    public String register(User user, Model model) {
        //调用service方法
        boolean flag = userService.checkRegister(user.getUserName(), user.getUserPassword());
        if (flag == true) {
            return "registerSuccess";
        } else {
            return "registerFail";
        }
    }


    /**
     * 3、修改基本信息表单提交过来的路径
     *
     * @param user
     * @param model
     * @return
     */
    @RequestMapping(value = "/modifyInfo", method = RequestMethod.POST)
    public String modifyInfo(User user, Model model) {
        System.out.println("当前登录用户的Id：" + user.getUserId() + user.getUserName() + user.getUserPassword() + user.getUserPhone() + user.getUserEmail());
        Long userId = user.getUserId();//用户id
        String userName = user.getUserName();//用户名
        String userPassword = user.getUserPassword();//密码
        String userPhone = user.getUserPhone();//手机号
        String userEmail = user.getUserEmail();//邮箱
        System.out.println(userId + userPassword + userEmail);
        //执行更新操作
        boolean flag = userService.checkModify(userId, userName, userPassword, userPhone, userEmail);
        System.out.println(flag);
        if (flag == true) {
            return "modifySuccess";
        }
        return null;
    }









//    待用
//    @RequestMapping(value = "/outLogin")
//    public String toLogout(HttpSession session, HttpServletRequest request, HttpServletResponse response, SessionStatus sessionStatus) {
//        //注销当前session
//        session.removeAttribute("user");
//        sessionStatus.setComplete();
//        return "main/headPage";
//    }

}
