package Dao;

import Bean.User;
import DB.UserDB;

import java.util.List;


/**
 * Created by Administrator on 2017/9/27.
 */
public class UserDao {
    public void addUser(User u){
        UserDB.users.add(u);
    }

}

