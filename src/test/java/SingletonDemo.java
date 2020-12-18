/**
 * Created by Administrator on 2020/4/5.
 */

import java.util.HashSet;

/**
 * @author keyan
 * @Descrition TODO
 * @Date 2020/4/5 17:29
 * @Version 1.0.0
 */
public class SingletonDemo {
    private volatile static SingletonDemo instance;
    private SingletonDemo() {
        System.out.println("SingletonDemo has created");
    }
    public static SingletonDemo getInstance(){
        if (instance == null) {
            synchronized (SingletonDemo.class){
                if (instance == null) {
                    instance = new SingletonDemo();
                }
            }
        }
        return instance;
    }

    public static void main(String[] args){
        SingletonDemo s = SingletonDemo.getInstance();
        SingletonDemo s1 = SingletonDemo.getInstance();
    }
}
