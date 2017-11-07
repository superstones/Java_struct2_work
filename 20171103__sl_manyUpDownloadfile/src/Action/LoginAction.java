package Action;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

import java.util.regex.Pattern;


public class LoginAction extends ActionSupport {

    private String password;

    private String username;

    public String getPassword() {
        return password;
    }

    public void setPassword(String password1) {
        this.password = password1;
    }


    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    //定义常量

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



    public String loginMethod() {

        if (username.equals("shilei") && password.equals("123456789")) {
            ActionContext.getContext().getSession().put("user", username);
            return "loginOK";
        }else{
            this.addFieldError("err","用户名或密码不正确");
            return "fail";
        }
    }

}


