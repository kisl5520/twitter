/**
 * Created by Administrator on 2020/3/23.
 */

import com.alibaba.druid.sql.visitor.functions.Char;
import org.springframework.util.StringUtils;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/**
 * @author keyan
 * @Descrition TODO
 * @Date 2020/3/23 19:10
 * @Version 1.0.0
 */
public class KislTest {

    public static void main(String[] args){

//        System.out.println("计算结果：" + KislTest.bigNumber(1000));
        String a = "abbaca";
        char[] str = a.toCharArray();
        System.out.println(str);
        int i=0;
        while(str.length != 0){

        }
    }

    //会越界 int 最大 2^32-1
   public static long cal(int n){
        if(n == 0){
        return 0;
        }
        long result = 1;
        for(int i=1;i<n+1;i++){
            result = result*i;
        }
     return result;
   }

        //写一个方法求解整数n的阶乘，并打印出结果，
       public static synchronized BigInteger bigNumber(int num){//利用BigInteger类计算阶乘
            ArrayList list = new ArrayList();//创建集合数组
            list.add(BigInteger.valueOf(1));//往数组里添加一个数值
            for (int i = list.size(); i <= num; i++) {
                BigInteger lastfact = (BigInteger) list.get(i - 1);//获得第一个元素
                BigInteger nextfact = lastfact.multiply(BigInteger.valueOf(i));//获得下一个数组
                list.add(nextfact);
            }
            return (BigInteger) list.get(num);//返回数组中的下标为num的值
    }

  /*  数据库四个特征：原子性、一致性、隔离性、持久性

    原子性： 事务是数据库的逻辑工作单位,事务中的操作要么全做，要么不做。
    一致性： 事务执行的结果必须是使数据库从一个一致性变到另一个一致性。
    隔离性： 一个事务的执行不能干扰其他事物。即一个事务内部的操作及使用的数据对其他并发事务是隔离的，并发执行的各个事务之间不能相互干扰。
    持久性： 一个事务一旦提交，他对数据库中的数据的改变应该是永久性的。接下来的其它操作或者故障不应该对其执行结果有任何影响。*/


}
