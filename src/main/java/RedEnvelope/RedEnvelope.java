package RedEnvelope;

import org.junit.Test;

import java.util.*;

/**
 * Author:Administrator
 * Date:  2016/8/16
 * Time: 14:19
 * 红包随机方法
 */
public class RedEnvelope {
    public List<Integer> getList(){
        int total = 10000;
        int person = 10;
        int min = 600;
        int left = 0;
        List<Integer> result = new ArrayList<>();
        int max = 1200;
        while (result.size() < person) {
            int rand = randomWithRange(max, min);
            if (result.size()==9){
                result.add(left);
                break;
            }
            result.add(rand);
             left = total - getListValues(result);
            if (left >= min * (person - result.size()) && left <= max * (person - result.size())) {
                min = 600;
                max = 1200;
                //System.out.println("current:"+rand+" -> total:"+getListValues(result));

            } else if (left < min * (person - result.size())) {
                result.remove(result.size() - 1);
                max--;
            } else if (left > max * (person - result.size())) {
                result.remove(result.size() - 1);
                min++;
            }
        }

        Collections.sort(result);

        System.out.println(result);
        return result;

    }


    static int getListValues(List<Integer> list) {
        int result = 0;
        for (Integer each : list) {
            result += each;
        }
        return result;
    }

    static int randomWithRange(int min, int max) {
        int range = (max - min) + 1;
        return (int) (Math.random() * range) + min;
    }

    @Test
    public void testRedEnvelope(){
        for(int i=0;i<2;i++){
            RedEnvelope red = new RedEnvelope();
            List<Integer> result = red.getList();
            //for(Integer number : result){
            //    Assert.assertEquals(10000, getListValues(result));
            //    Assert.assertThat(number, Matchers.anyOf(Matchers.greaterThanOrEqualTo(600), Matchers.lessThanOrEqualTo(1200)));
            //}
        }
    }
}
