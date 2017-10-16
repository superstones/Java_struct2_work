package Action;

import Bean.User;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

/**
 * Created by Administrator on 2017/10/16.
 */
public class registAction extends ActionSupport implements ModelDriven<User> {
     User u=new User();

    @Override
    public User getModel() {
        return u;
    }
    //注册逻辑
    public String registMethod(){

        ActionContext.getContext().getSession().put("user",u);

        return "registOK";
    }
}
