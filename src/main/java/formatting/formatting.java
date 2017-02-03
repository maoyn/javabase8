package formatting;

import org.junit.Test;

import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * Author:Administrator
 * Date:  2016/8/17
 * Time: 17:31
 * 格式化
 */

public class formatting {
    @Test
    public void formattingTest() {
        double c = 32.1231;

        //小数点格式化
        DecimalFormat formatPrice = new DecimalFormat("0.00");//
        String b = formatPrice.format(c); //
        System.out.println(b);

        //时间格式化
        SimpleDateFormat formatDate =  new SimpleDateFormat("yyyyMMddHHmm");
        String d = formatDate.format(new Date().getTime()-84*60*60*1000L);//对时间格式化
        System.out.println("格式化成yyyymmddhhmm:"+d);

        //
        //System.out.println(d);
        //Long a = System.currentTimeMillis(); //获取当前时间毫秒
        //System.out.println(a);
        //Date x = new Date(a); //毫秒转换日期格式
        //System.out.println(x);


        SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMddHHmm");
        Date date1 = new Date(new Date().getTime() - 18 * 60 * 60 * 1000L);
        //String转换成Date类型方法
        //for(int i=0;i<=10000000000L;i++) {
        //
        //    String dateAgo = "201611110926";
        //    String dateNext = "201611110926";
        //
        //    try {
        //        if (sdf.parse(dateAgo).getTime()-sdf.parse(dateNext).getTime()<0){
        //            System.out.println(i);
        //        }
        //    } catch (ParseException e) {
        //        e.printStackTrace();
        //    }
        //
        //
        //}




        //try
        //{
        //    SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMddHHmm");
        //    Date date = sdf.parse(dateString);
        //    System.out.println(date1+"时间转换成时间戳:"+date1.getTime());
        //    System.out.println(dateString+"时间转换成时间戳:"+date.getTime());
        //}
        //catch (ParseException e)
        //{
        //    System.out.println(e.getMessage());
        //}

        Map<String,Double> test = new HashMap<>();
        test.put("a", 0.11);
        test.put("a",0.23);
        for(Map.Entry<String,Double> test1 : test.entrySet()){
            System.out.println(test1.getValue().doubleValue());
            System.out.println(test1.getValue().longValue());
        }

    }



}
