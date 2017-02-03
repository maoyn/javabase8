import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * Author:Administrator
 * Date:  2016/8/17
 * Time: 10:37
 */
public class test {
    enum Week{Sun,Mon, Tue, Wed,Thu,Fri,Sat}
    public static void main(String[]  args) {

        String fileName  = "abc.xls";
        String suffix = fileName.substring(fileName.lastIndexOf(".") + 1);

System.out.println(suffix);

        int[] data =  {1,2,3,4,5};

        List list = Arrays.asList(data);
      
        System.out.println("列表中的元素数量是：" + list.size());


        Integer[] data1 =  {1,8,3,4,5};

        List list1 = Arrays.asList(data1);

        System.out.println("列表中的元素数量是：" + list1.size());


        List<String> names = Arrays.asList("peter", "anna", "mike", "xenia");
        List<Integer> list12 = Arrays.asList(1,2,3,6,8,9);
        Collections.sort(list1);
        list12.sort((a, c) -> a.compareTo(c));
        System.out.println(list12);
        Arrays.asList( "a", "b", "d" ).sort( ( e1, e2 ) -> e1.compareTo( e2 ) );
        names.sort((a, c) -> c.compareTo(a));
        System.out.println(names);
    }
}
