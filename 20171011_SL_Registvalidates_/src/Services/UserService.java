package Services;
import Bean.User;
import Dao.UserDao;

import java.util.List;

/**
 * Created by Administrator on 2017/9/27.
 */
public class UserService {
    private UserDao uDao=new UserDao();
    public void addUser(User u){
        uDao.addUser(u);
    }


    }


