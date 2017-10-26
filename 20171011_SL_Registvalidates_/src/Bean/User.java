package Bean;


/**
 * Created by Administrator on 2017/10/11.
 */
public class User {
    private String username;
    private String password;
    private String rPassword;
    private String realName;
    private Tel tel;
    private Addresss address;

    public Tel getTel() {
        return tel;
    }

    public void setTel(Tel tel) {
        this.tel = tel;
    }

    public Addresss getAddress() {
        return address;
    }

    public void setAddress(Addresss address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return username;

    }


    private String telephone;
    private String emailAddress;
    private String code;

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
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

    public String getrPassword() {
        return rPassword;
    }

    public void setrPassword(String rPassword) {
        this.rPassword = rPassword;
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

    public String getRealName() {
        return realName;
    }

    public void setRealName(String realName) {
        this.realName = realName;
    }
}
