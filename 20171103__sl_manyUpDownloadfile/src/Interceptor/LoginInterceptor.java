package Interceptor;


import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.interceptor.AbstractInterceptor;

/**
 * Created by Admistrator on 2017/11/7.
 */
public class LoginInterceptor extends AbstractInterceptor {
    @Override
    public String intercept(ActionInvocation actionInvocation) throws Exception {

        ActionContext ac=actionInvocation.getInvocationContext();
        String username= (String) ac.getSession().get("user");
        if (username!=null&&username.equals("shilei")){
            return actionInvocation.invoke();
        }else {
            ((ActionSupport)actionInvocation.getAction()).addActionError("请先登录");
            return Action.LOGIN;
        }

    }
}
