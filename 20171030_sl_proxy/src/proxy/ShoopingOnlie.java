package proxy;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * Created by Administrator on 2017/10/30.
 */
public class ShoopingOnlie implements BookAbstrate {
    private Publisher publisher = new Publisher();

    public void preSaleBook() {
        System.out.println("代理角色网上买书前宣传");

    }

    public void PostSaleBook() {
        System.out.println("买书后做售后");
    }

    public void saleBook() {
        this.preSaleBook();
        publisher.saleBook();
        this.PostSaleBook();
    }

    //获取真实主题角色的所有方法
    public void invoke() throws InvocationTargetException, IllegalAccessException {
        Method[] methods = publisher.getClass().getMethods();
        for (int i=0;i<methods.length;i++) {

            if (methods[i].getName().equals("saleBook")) {
              this.preSaleBook();
              //publisher.saleBook();
                methods[i].invoke(publisher);
                this.PostSaleBook();

            } else{

                methods[i].invoke(publisher);
            }


        }
    }
}
