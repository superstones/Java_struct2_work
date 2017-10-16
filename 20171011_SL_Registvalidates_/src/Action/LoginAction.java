package Action;

import Bean.User;
import DB.UserDB;
import Dao.UserDao;
import Services.UserService;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import org.apache.struts2.ServletActionContext;

import javax.servlet.http.HttpSession;
import java.util.regex.Pattern;

/**
 * Created by Administrator on 2017/10/9.
 */
public class LoginAction extends ActionSupport implements ModelDriven<User> {
    //属性驱动接收数据

    User u = new User();
    UserDao userDao= new UserDao();
    UserService uService = new UserService();
    //validate手动校验方法

    @Override
    public User getModel() {
        return u;

    }


    @Override
    public void validate() {
        //数据校验
        System.out.println("进入了validate方法");
        if (u.getUsername() == null || u.getUsername().trim().length() < 6 || u.getUsername().trim().length() > 15) {
            this.addFieldError("username", "用户名长度不合法");

        }
        if (u.getPassword() == null || u.getPassword() .trim().length() < 6 || u.getPassword() .trim().length() > 15) {
            this.addFieldError("password", "密码长度不合法");

        }
    }

    //登陆的业务处理逻辑
    public String loginMethod() {

        User user = userDao.compareUser(u);
        if (user == null)
            return "loginFail";
        else {
            ActionContext.getContext().getSession().put("user", user);

            return "loginOK";
        }

    }
    }




//    //手动校验validateXXX()
//    public void validateLoginMethod() {
//        //使用正则表达式校验
//        System.out.println("进入validateXXX方法");
//        if (username == null || username.trim().equals("")) {
//            this.addFieldError("username", "用户名不能为空");
//        } else {
//            if (!Pattern.matches("\\w{6,15}", username.trim())) {
//
//                this.addFieldError("username", "用户名格式错误");
//            }
//        }
//        if (password == null || password.trim().equals("")) {
//            this.addFieldError("password", "密码不能为空");
//        } else {
//            if (!Pattern.matches("\\w{6,15}", username.trim())) {
//
//                this.addFieldError("password", "密码格式错误");
//            }
//
//        }
//    }


