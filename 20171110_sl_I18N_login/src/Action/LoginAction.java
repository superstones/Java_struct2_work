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


    public void validateLoginMethod() {
        //使用正则表达式校验

        System.out.println("进入validateXXX方法");
        if (username == null || username.trim().equals("")) {
            this.addFieldError("username", this.getText("user.required"));
        } else {
            if (!Pattern.matches("\\w{6,15}", username.trim())) {

                this.addFieldError("username", this.getText("user.form"));
            }
        }
        if (password == null || password.trim().equals("")) {
            this.addFieldError("password", this.getText("pass.required"));
        } else {
            if (!Pattern.matches("\\w{6,15}", username.trim())) {

                this.addFieldError("password", this.getText("pass.form"));
            }

        }
    }

    public String loginMethod() {
        ActionContext ctx = ActionContext.getContext();
        if (username.equals("shilei") && password.equals("123456789")) {
            ctx.getSession().put("user", username);
            ctx.put("tip", getText("welcome.msg", new String[]{username}));
            return "loginOK";
        } else {
            this.addFieldError("err", this.getText("errorInfo"));
            return "loginFail";
        }
    }

}


