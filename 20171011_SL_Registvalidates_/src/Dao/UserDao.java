package Dao;

import Bean.User;
import DB.UserDB;

import java.util.ArrayList;
import java.util.List;


/**
 * Created by Administrator on 2017/9/27.
 */
public class UserDao {
    public void addUser(User u) {
        UserDB.users.add(u);
    }

    public User compareUser(User u) {

        for (User user : UserDB.users) {

            if (u.getUsername().equals(user.getUsername()) && u.getPassword().equals(user.getPassword())) {
                return user;
            }

        }
        return null;
    }


}