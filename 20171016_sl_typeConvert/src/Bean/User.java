package Bean;


/**
 * Created by Administrator on 2017/10/16.
 */
public class User {
    private String username;
    private Tel tel;
    private Addresss address;
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

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
}
