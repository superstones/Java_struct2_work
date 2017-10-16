package Action;

import Bean.User;
import Dao.UserDao;
import Services.UserService;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 2017/10/11.
 */
public class registAction extends ActionSupport implements ModelDriven<User> {

      User u = new User();
      UserDao userDao=new UserDao();
       UserService uService =new UserService();

    String Code2 = (String) ActionContext.getContext().getSession().get("checkCode");
    @Override
    public User getModel() {
        return u;

    }
    @Override
    public void validate() {
        System.out.println("进入注册Validate");
        if (u.getUsername() == null || u.getUsername().trim().equals("")) {
            this.addFieldError("usernameError", "用户名不能为空");
        }
        if (u.getPassword() == null || u.getPassword().trim().equals("")) {
            this.addFieldError("passwordError", "密码不能为空");

        }
    }
    public String registMethod(){

     userDao.addUser(u);

        return "registOK";


    }
}


