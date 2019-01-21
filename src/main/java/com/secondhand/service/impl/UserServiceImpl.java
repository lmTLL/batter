package com.secondhand.service.impl;

import com.qfedu.vo.ResultVo;
import com.secondhand.dao.UserMapper;
import com.secondhand.entity.User;
import com.secondhand.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userDao;

    @Override
    public ResultVo login(String name, String password) {
        User user = userDao.selectByName(name);
        if(user!=null) {
            if(user.getPassword().equals(password)) {
                return ResultVo.setOK(user);
            }
        }
        return ResultVo.setERROR();
    }

    @Override
    public User queryByName(String name) {

        return userDao.selectByName(name);
    }

    @Override
    public ResultVo add(User user) {
        int ret = userDao.insertSelective(user);
        if (ret>0){
            return ResultVo.setOK("注册成功");
        }else {
            return ResultVo.setERROR();
        }
    }


}
