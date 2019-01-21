package com.secondhand.dao;

import com.secondhand.entity.Goodstypes;

public interface GoodstypesMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Goodstypes record);

    int insertSelective(Goodstypes record);

    Goodstypes selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Goodstypes record);

    int updateByPrimaryKey(Goodstypes record);
}