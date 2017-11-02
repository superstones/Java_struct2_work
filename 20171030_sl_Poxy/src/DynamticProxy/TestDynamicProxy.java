package DynamticProxy;

import proxy.BookAbstrate;
import proxy.Publisher;

/**
 * Created by Administrator on 2017/11/1.
 */
public class TestDynamicProxy {
    public static void main(String[] args){
        //案例1 狗代理
        //1.产生真实主题角色
        Dog dog =new DogImpl();
        //2.产生代理主题角色
        Dog dogProxy = (Dog) MyProxyFactory.getProxy(dog,"info");
        //3.通过代理主题角色访问真实主题角色的某
        dogProxy.info();
        dogProxy.run();
        dogProxy.cry();
        //案例2
        //123同上
        BookAbstrate publisher = new Publisher();
        BookAbstrate publisherProxy = (BookAbstrate) MyProxyFactory.getProxy(publisher,"saleBook");
         publisherProxy.saleBook();

    }
}
