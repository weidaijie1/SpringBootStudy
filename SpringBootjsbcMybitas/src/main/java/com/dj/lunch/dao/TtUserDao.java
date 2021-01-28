package com.dj.lunch.dao;

import com.dj.lunch.model.TtUser;
import com.dj.lunch.model.TtUserExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface TtUserDao {
    long countByExample(TtUserExample example);

    int deleteByExample(TtUserExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(TtUser record);

    int insertSelective(TtUser record);

    List<TtUser> selectByExample(TtUserExample example);

    TtUser selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") TtUser record, @Param("example") TtUserExample example);

    int updateByExample(@Param("record") TtUser record, @Param("example") TtUserExample example);

    int updateByPrimaryKeySelective(TtUser record);

    int updateByPrimaryKey(TtUser record);
}