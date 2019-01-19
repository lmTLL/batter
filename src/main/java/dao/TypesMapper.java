package dao;

import com.secondhand.entity.Types;

public interface TypesMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Types record);

    int insertSelective(Types record);

    Types selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Types record);

    int updateByPrimaryKey(Types record);
}