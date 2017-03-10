package com.felix.web.demo.dao;

import com.felix.web.demo.entity.User;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * Author: Felix
 * Date: 2017/3/10
 * Time: 11:08
 */
public interface UserDAO {

    public User getUserById(String userid);

    public List<User> getUserByBrchno(String brchno);

    public void addUser(User user);

    public void updateUserById(String userid);

    public void deleteUserById(String userid);

}
