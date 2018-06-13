package com.lys.service;

import com.lys.dao.UserMapper;
import com.lys.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author: AsiQue
 * @date :2018.06.11 14:46
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;//用户Dao

    @Override
    public int deleteByPrimaryKey(Long id) throws Exception {
        return 0;
    }

    @Override
    public int insert(User record) throws Exception {
        return 0;
    }

    @Override
    public int insertSelective(User record) throws Exception {
        return 0;
    }

    @Override
    public User selectByPrimaryKey(Long id) throws Exception {
        try {
            return userMapper.selectByPrimaryKey(id);
        } catch (Exception e) {
            throw e;
        }
    }

    @Override
    public int updateByPrimaryKeySelective(User record) throws Exception {
        return 0;
    }

    @Override
    public int updateByPrimaryKey(User record) throws Exception {
        try {
            throw new RuntimeException("update goes wrong!");
        } catch (Exception e) {
            throw e;
        }
    }
}
