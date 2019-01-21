package com.secondhand.dao;

import com.secondhand.entity.Goodstatus;

public interface GoodstatusMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Goodstatus record);

    int insertSelective(Goodstatus record);

    Goodstatus selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Goodstatus record);

    int updateByPrimaryKey(Goodstatus record);
}