/**
 * Created by Administrator on 2020/3/23.
 */

/**
 * @author keyan
 * @Descrition TODO
 * @Date 2020/3/23 19:10
 * @Version 1.0.0
 */
public class ClassA {
    public ClassA (){
        System.out.println("A 构造");
    }
    private static ClassA a = new ClassA();

    static {
        System.out.println("static");
    }

    {
        System.out.println("A1");
    }

    public class ClassB extends ClassA {
        public ClassB (){
            System.out.println("B");
        }
    }
    public void main(final String[] args){
        System.out.println("0000");
        ClassB b = new ClassA.ClassB();
    }
}
