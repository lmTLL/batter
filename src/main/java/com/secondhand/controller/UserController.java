package com.secondhand.controller;

import com.qfedu.vo.ResultVo;
import com.secondhand.entity.User;
import com.secondhand.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpSession;

@RestController  //表示是一个控制器  映射方法的所有的返回值都转换为json 类似：@Cntroller+@ResponseBody
@CrossOrigin  //跨域
public class UserController {

    @Autowired
   private UserService userService;
    /**
     * 登录
     *
     * @param name
     * @param password
     * @return
     */
    @PostMapping("login.do")
    public ResultVo login(String name, String password, HttpSession session) {
        User queryByName = userService.queryByName(name);
        session.setAttribute("user", queryByName);
        ResultVo vo = userService.login(name, password);

        return vo;
    }

    /**
     * 注册新成员
     * @param user
     * @return
     */
    @PostMapping("usersave.do")
    public ResultVo save(User user){
        return userService.add(user);
    }




}
