/**
 * Created by Administrator on 2020/5/14.
 */

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;

/**
 * @author keyan
 * @Descrition TODO
 * @Date 2020/5/14 17:06
 * @Version 1.0.0
 */
public class MakeRandomFpqqlsh {
    public String getRandomFpqqlsh(){
        SimpleDateFormat format = new SimpleDateFormat("HHmmss");
        String str0 = format.format(new Date());

        Random rand = new Random();
        String str = null;
        int num = rand.nextInt(1000000);
        if (num >= 0 && num <= 9) {
            str = "00000" + String.valueOf(num);
        } else if (num >= 10 && num <= 99) {
            str = "0000" + String.valueOf(num);
        } else if (num >= 100 && num <= 999) {
            str = "000" + String.valueOf(num);
        } else if (num >= 1000 && num <= 9999) {
            str = "00" + String.valueOf(num);
        } else if (num >= 10000 && num <= 99999) {
            str = "0" + String.valueOf(num);
        } else if (num >= 100000 && num <= 999999) {
            str = String.valueOf(num);
        } else {
            str = "000000";
        }
        return str + str0;
    }
    public static void main(String[] args){
        MakeRandomFpqqlsh s =  new MakeRandomFpqqlsh();
        System.out.println("fpqqlsh:"+s.getRandomFpqqlsh());
    }
}
