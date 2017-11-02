package DynamticProxy;

/**
 * Created by Administrator on 2017/11/1.
 */
public class DogImpl implements Dog{
    public void info() {
        System.out.println("一只猎狗");
    }

    public void run(){

        System.out.println("猎狗奔跑");

    }
    public void cry(){
        System.out.println("猎狗嗥叫");

    }
}
