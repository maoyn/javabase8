package stream;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

/**
 * Author:Administrator
 * Date:  2016/8/22
 * Time: 17:41
 */

public class streamTest {
    @Test
    public void test(){
        String a ="PK,%%WIFI%121.14.53.175:8500";
        String keyGroup[] = a.split("%");
        String areaId = keyGroup[0];
        String ispId = keyGroup[1];
        String method = keyGroup[2];
        String hostName = keyGroup[3];
        System.out.println(ispId);
        if (ispId==null||ispId.length()<= 0){
            System.out.println("空值");
        }

        Arrays.asList("a1", "a2", "a3")
                .stream()
                .findFirst()
                .ifPresent(System.out::println);  // a1
        List<String> myList =
                Arrays.asList("a1", "a2", "b1", "c2", "c1");

        myList
                .stream()
                .filter(s -> s.startsWith("c"))
                .map(String::toUpperCase)
                .sorted()
                .forEach(System.out::println);
    }
}

