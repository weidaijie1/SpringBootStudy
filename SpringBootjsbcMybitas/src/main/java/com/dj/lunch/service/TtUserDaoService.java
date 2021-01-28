package com.dj.lunch.service;

import com.dj.lunch.dao.TtUserDao;
import com.dj.lunch.model.TtUser;
import com.dj.lunch.model.TtUserExample;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TtUserDaoService implements TtUserResService {

    @Autowired
    TtUserDao ttUserDao;

//    @Override
//    public long countByExample(TtUserExample example) {
//        return 0;
//    }
//
//    @Override
//    public int deleteByExample(TtUserExample example) {
//        return 0;
//    }
//
//    @Override
//    public int deleteByPrimaryKey(Integer id) {
//        return 0;
//    }
//
//    @Override
//    public int insert(TtUser record) {
//
//        return 0;
//    }
//
//    @Override
//    public int insertSelective(TtUser record) {
//        return 0;
//    }
//
//    @Override
//    public List<TtUser> selectByExample(TtUserExample example) {
//        return null;
//    }

    @Override
    public TtUser selectById(Integer id) {
        TtUser u = ttUserDao.selectByPrimaryKey(id);
        return u;
    }

//    @Override
//    public int updateByExampleSelective(TtUser record, TtUserExample example) {
//        return 0;
//    }
//
//    @Override
//    public int updateByExample(TtUser record, TtUserExample example) {
//        return 0;
//    }
//
//    @Override
//    public int updateByPrimaryKeySelective(TtUser record) {
//        return 0;
//    }
//
//    @Override
//    public int updateByPrimaryKey(TtUser record) {
//        return 0;
//    }
}
