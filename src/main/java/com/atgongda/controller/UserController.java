package com.atgongda.controller;

import com.atgongda.entity.User;
import com.atgongda.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

/**
 * @author sushuai
 * @date 2019/03/04/6:09
 */
@Controller
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    /**
     * 登录
     * session:作用于当前网页页面，登陆成功后session当中存入userName，对该用户的所有操作都可以通过判断userName是否存在来判断能否执行
     * model:存放需要返回给jsp的数据，Model addAttribute(String var1, @Nullable Object var2);var1存放返回的名字，var2存放真正的数据，jsp获取只需要${var1}
     * @param userName  用户名
     * @param userPassword  用户密码
     * @param request
     * @param model
     * @return
     */
    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public String login(@RequestParam("userName") String userName, @RequestParam("userPassword") String userPassword, HttpServletRequest request, Model model) {
        User user = userService.selectUserByUserName(userName);
        if (user != null) {
            if (user.getUserPassword().equals(userPassword)) {
                System.out.println("用户名和密码都正确，即将登陆！！！");

                //将登陆成功后的userName放入session当中
                HttpSession session = request.getSession();
                session.setAttribute("userName", user.getUserName());

                //Model addAttribute(String var1, @Nullable Object var2);
                // 将需要返回给jsp的数据返回放入model当中，jsp当中只需要通过 ${val1} 即可获取，且数组，实体类的对象，string等都可以获取
                model.addAttribute("status", "success");
                model.addAttribute("user",user);
                return "loginSuccess";

            } else {

                System.out.println("用户名正确，密码不正确！！！");
                model.addAttribute("failure", "用户名或密码错误！");
                return "loginError";

            }
        } else {

            System.out.println("用名不正确！！！");
            model.addAttribute("state", "failure");
            model.addAttribute("message", "该用户不存在");
            return "loginError";

        }
    }

    /**
     * 注册
     * @param userName
     * @param userPassword
     * @param request
     * @param model
     * @return
     */
    @RequestMapping(value = "/register", method = RequestMethod.POST)
    public String register(@RequestParam("userName") String userName, @RequestParam("userPassword") String userPassword,HttpServletRequest request, Model model) {
        System.out.println("输入的信息"+userName+userPassword);
        User user = new User();
        user.setUserName(userName);
        user.setUserPassword(userPassword);

        boolean flag = userService.insertUser(user);
        if (flag == true){
            return "registerSuccess";
        }else {
            return "registerError";
        }
    }

}
