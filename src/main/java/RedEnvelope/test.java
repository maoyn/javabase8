package RedEnvelope;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Author:Administrator
 * Date:  2016/8/16
 * Time: 15:30
 */
public class test {
   static List<Integer> result = new ArrayList<>();
    private static int max=1200;
    private static int min=600;

    private static double c=32.1231;
    @Deprecated
    public static void test(){
        result.add(1);
        result.add(4);
        result.add(2);
        result.add(7);
        result.add(4);
        System.out.println(result);
        result.remove(result.size()-1);
        System.out.println(result);

        int range = (max - min) + 1;
        int a= (int) (Math.random() * range) + min;
        System.out.println(a);
        System.out.println((int)Math.random());

        Arrays.asList("a", "b", "d").forEach( e -> System.out.println(e));

        String separator = "%";
        Arrays.asList( "a", "b", "d" ).forEach(
        ( String e ) -> System.out.println( e + separator ) );
    }




    public static void main(String[] args){
        test();


        DecimalFormat formatPrice = new DecimalFormat("0.00");//
        String b = formatPrice.format(c);
        System.out.println(b);
    }
}
