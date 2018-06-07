package com.pp.shopping.module.sys.service.impl;

import com.pp.shopping.module.sys.dao.UserMapper;
import com.pp.shopping.module.sys.model.User;
import com.pp.shopping.module.sys.service.inter.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Description:用户接口实现类
 * @Author: panpeng
 * @Date: 2018/5/28
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserMapper userMapper;

    /**
     * 查询list
     * @param user
     * @return
     */
    @Override
    public List<User> findByCondition(User user) {
        return userMapper.selectByCondition(user);
    }

    /**
     * 根据主键查询
     * @param userId
     * @return
     */
    @Override
    public User findByPrimary(Integer userId){
        return userMapper.selectByPrimaryKey(userId);
    }

    /**
     * 修改
     * @param user
     */
    @Override
    public void edit(User user) {
        userMapper.updateByPrimaryKeySelective(user);
    }
}
