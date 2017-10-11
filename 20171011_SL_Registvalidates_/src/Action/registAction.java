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
      UserDao userDao =new UserDao();
      UserService userService =new UserService();
    String Code2 = (String) ActionContext.getContext().getSession().get("checkCode");
    @Override
    public User getModel() {
        return u;

    }


    public String registMethod(){


        ActionContext.getContext().getSession().put("user",u);
        ActionContext.getContext().getSession().put("username",u.getUsername());
        ActionContext.getContext().getSession().put("password",u.getPassword());

        return "registOK";


    }
}


