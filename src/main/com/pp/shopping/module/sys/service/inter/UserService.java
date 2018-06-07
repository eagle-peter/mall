package com.pp.shopping.module.sys.service.inter;

import com.pp.shopping.module.sys.model.User;

import java.util.List;

/**
 * @Description:用户接口
 * @Author: panpeng
 * @Date: 2018/5/28
 */
public interface UserService {

    /**
     * 查询用户List
     * @param user
     * @return
     */
    public List<User> findByCondition(User user);

    /**
     * 根据主键查询
     * @param userId
     * @return
     */
    public User findByPrimary(Integer userId);

    /**
     * 修改
     */
    public void edit(User user);
}
