package DynamticProxy;

/**
 * Created by Administrator on 2017/11/1.
 */
public class MyInterceptor {
    public void method1() {
        System.out.println("模拟Struts2框架中访问Action之前拦截器执行的代码");
    }
    public void method2(){

        System.out.println("模拟Struts2框架中访问Action之后拦截器执行的代码");
    }

}
