package com.felix.web.demo.dao.impl;

import com.felix.web.demo.dao.UserDAO;
import com.felix.web.demo.dbutils.DBHelp;
import com.felix.web.demo.entity.User;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * Author: Felix
 * Date: 2017/3/10
 * Time: 11:06
 */
public class UserDAOImpl implements UserDAO {

    /**根据userid查询用户*/
    @Override
    public User getUserById(String userid) {

        String sql = "select * from kub_user where userid=" + userid;
        User user = null;
        ResultSet rs = DBHelp.executeSql(sql);
        try {
            while (rs.next()) {
                user = new User();
                user.setUserid(rs.getString("userid"));
                user.setBrchno(rs.getString("brchno"));
                user.setUserna(rs.getString("userna"));
                user.setUserst(rs.getString("userst"));
                user.setUsertp(rs.getString("usertp"));
                user.setLastlg(rs.getString("lastlg"));
                user.setUssatg(rs.getString("ussatg"));
                user.setLstrdt(rs.getString("lstrdt"));
                user.setMenugp(rs.getString("menugp"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            DBHelp.close();
        }
        return user;
    }

    @Override
    public List<User> getUserByBrchno(String brchno) {
        return null;
    }

    @Override
    public void addUser(User user) {

    }

    @Override
    public void updateUserById(String userid) {

    }

    @Override
    public void deleteUserById(String userid) {

    }
}
