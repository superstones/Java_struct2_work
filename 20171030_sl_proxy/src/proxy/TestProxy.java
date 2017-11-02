package proxy;

import java.lang.reflect.InvocationTargetException;

/**
 * Created by Administrator on 2017/10/30.
 */
public class TestProxy implements BookAbstrate {
    public static void main(String[] args) throws InvocationTargetException, IllegalAccessException {


        ShoopingOnlie so =new ShoopingOnlie();
        so.saleBook();
        so.invoke();

    }

    @Override
    public void saleBook() {

    }
}
