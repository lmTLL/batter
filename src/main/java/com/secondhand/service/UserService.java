package com.secondhand.service;

import com.qfedu.vo.ResultVo;
import com.secondhand.entity.User;

public interface UserService {
    //登录
    ResultVo login(String name, String password);

    //根据名字查询出该成员信息
    User queryByName(String name);

    //注册新用户
    ResultVo add(User user);
}
