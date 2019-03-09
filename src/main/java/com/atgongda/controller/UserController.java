package com.atgongda.controller;

import com.atgongda.entity.User;
import com.atgongda.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

/**
 * @author sushuai
 * @date 2019/03/04/6:09
 */
@Controller
@RequestMapping("/user")

//这里用了@SessionAttributes，可以直接把model中的user(也就key)放入其中
//这样保证了session中存在user这个对象
@SessionAttributes("user")
public class UserController {

    @Autowired
    private UserService userService;
//
//    //正常访问login页面
//    @RequestMapping("/login")
//    public String login(){
//        return "login";
//    }

    //登录表单提交过来的路径
    @RequestMapping(value = "/checkLogin",method = RequestMethod.POST)
    public String checkLogin(User user,Model model){//model用来返回数据
        user = userService.checkLogin(user.getUserName(),user.getUserPassword());
        //若有user则添加到model里并且跳转到成功页面
        if(user != null){
            model.addAttribute("user",user);
            return "loginSuccess";
        }
        return null;
    }

    //注册表单提交过来的路径
    @RequestMapping(value = "/register",method = RequestMethod.POST)
    public String register(User user,Model model){
        System.out.println("aaa");
        //调用service方法
        boolean flag = userService.checkRegister(user.getUserName(),user.getUserPassword());
        if (flag == true){
            return "registerSuccess";
        }else {
            return "registerFail";
        }
    }

    //注销方法
    @RequestMapping(value = "/logout",method = RequestMethod.POST)
    public String outLogin(HttpSession session){
        System.out.println("aaa");
        //通过session.invalidata()方法来注销当前的session
        session.invalidate();
        return "main/login";
    }




}
