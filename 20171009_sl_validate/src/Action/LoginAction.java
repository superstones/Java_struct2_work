package Action;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

import java.util.regex.Pattern;

/**
 * Created by Administrator on 2017/10/9.
 */
public class LoginAction extends ActionSupport {
    //属性驱动接收数据
    private String username;
    private String password;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    //validate手动校验方法

    @Override
    public void validate() {
        //数据校验
        System.out.println("进入了validate方法");
        if (username == null || username.trim().length() < 6 || username.trim().length() > 15) {
            this.addFieldError("username", "用户名长度不合法");

        }
        if (password == null || password.trim().length() < 6 || password.trim().length() > 15) {
            this.addFieldError("password", "密码长度不合法");

        }
    }

    //登陆的业务处理逻辑
    public String loginMethod() {
        if (username.equals("shilei123") && password.equals("123456789")) {
            ActionContext.getContext().getSession().put("user", username);
            return "loginOK";
        } else {
            this.addFieldError("error", "用户名或密码错误");
            return "loginFail";

        }
    }

    //手动校验validateXXX()
    public void validateLoginMethod() {
        //使用正则表达式校验
        System.out.println("进入validateXXX方法");
        if (username == null || username.trim().equals("")) {
            this.addFieldError("username", "用户名不能为空");
        } else {
            if (!Pattern.matches("\\w{6,15}", username.trim())) {

                this.addFieldError("username", "用户名格式错误");
            }
        }
        if (password == null || password.trim().equals("")) {
            this.addFieldError("password", "密码不能为空");
        } else {
            if (!Pattern.matches("\\w{6,15}", username.trim())) {

                this.addFieldError("password", "密码格式错误");
            }

        }
    }
}

