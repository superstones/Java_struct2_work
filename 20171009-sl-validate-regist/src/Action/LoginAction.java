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
    private String passwordtwo;
    private String emailAddress;
    private String name;
    private String telephone;
    private String code;


    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

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

    public String getPasswordtwo() {
        return passwordtwo;
    }

    public void setPasswordtwo(String passwordtwo) {
        this.passwordtwo = passwordtwo;
    }

    //validate手动校验方法

    @Override
    public void validate() {
        //数据校验
        String Code2 = (String) ActionContext.getContext().getSession().get("checkCode");

        System.out.println("进入了validate方法");
        if (emailAddress == null||emailAddress.trim().equals("")) {
            this.addFieldError("emailAddress", "邮箱不能为空");
        }
        if (password == null || password.trim().length() < 6 || password.trim().length() > 15) {
            this.addFieldError("password", "密码长度不合法");

        }
        if (!password.equals(passwordtwo)) {

            this.addFieldError("passwordtwo", "两次输入密码不一致");
        }
        if (username == null || username.trim().length() < 6 || username.trim().length() > 15) {
            this.addFieldError("username", "用户名长度不合法");

        }
        if (name == null||name.trim().equals("")) {
            this.addFieldError("name","姓名不能为空");

        }
        if (telephone == null || telephone.trim().length() != 11) {
            this.addFieldError("telephone", "手机号码长度不合法");

        }
        if (!code.equals(Code2)) {
            this.addFieldError("code", "验证码输入错误");
        }

    }
    public String registMethod(){
        return "success";


    }

    //手动校验validateXXX()
    public void validateRegistMethod() {
        //使用正则表达式校验
        System.out.println("进入validateXXX方法");
        if(!Pattern.matches("^((1[3,5,8][0-9])|(14[5,7])|(17[0,6,7,8])|(19[7]))\\d{8}$",telephone.trim())) {
            this.addFieldError("telephone", "手机号格式不正确");
        }
        //使用正则表达式对姓名进行验证
        if(!Pattern.matches("^[\\u4E00-\\u9FA5A-Za-z]+$",name.trim())){
            this.addFieldError("name", "真实姓名格式不正确");
        }
        //使用正则表达式对邮箱进行验证
        if(!Pattern.matches("^\\w+((-\\w+)|(\\.\\w+))*\\@[A-Za-z0-9]+((\\.|-)[A-Za-z0-9]+)*\\.[A-Za-z0-9]+$",emailAddress.trim())){
            this.addFieldError("emailAddress", "邮箱格式不正确");
        }


    }
}




