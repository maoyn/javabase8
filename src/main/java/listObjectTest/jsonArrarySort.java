package listObjectTest;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONException;
import com.alibaba.fastjson.JSONObject;
import org.junit.Test;

import java.util.*;

/**
 * Author:Administrator
 * Date:  2016/12/15
 * Time: 19:16
 * json数组根据某个元素进行排序
 */
public class jsonArrarySort {
     @Test
    public  void sort(){
        String jsonArrStr = "[ { \"ID\": \"135\", \"Name\": \"Fargo Chan\" },{ \"ID\": \"432\", \"Name\": \"Aaron Luke\" },{ \"ID\": \"252\", \"Name\": \"Dilip Singh\" }]";

        JSONArray jsonArr = JSON.parseArray(jsonArrStr);
        JSONArray sortedJsonArray = new JSONArray();
System.out.println(jsonArr);
        List<JSONObject> jsonValues = new ArrayList<JSONObject>();
        for (int i = 0; i < jsonArr.size(); i++) {
            jsonValues.add(jsonArr.getJSONObject(i));
        }
        Collections.sort( jsonValues, new Comparator<JSONObject>() {
            //You can change "Name" with "ID" if you want to sort by ID
            private static final String KEY_NAME = "ID";

            @Override
            public int compare(JSONObject a, JSONObject b) {
                String valA = new String();
                String valB = new String();

                try {
                    valA = (String) a.get(KEY_NAME);
                    valB = (String) b.get(KEY_NAME);
                }
                catch (JSONException e) {
                    //do something
                }

                //return valA.compareTo(valB);
                //if you want to change the sort order, simply use the following:
                return -valA.compareTo(valB);
            }
        });

        for (int i = 0; i < jsonArr.size(); i++) {
            sortedJsonArray.add(jsonValues.get(i));
        }
         System.out.println(sortedJsonArray);
    }


@Test
    public void test(){
        JSONObject a = new JSONObject();
        JSONObject b = new JSONObject();

    List<JSONObject> test1 = new ArrayList<>();
    List<JSONObject> test2 = new ArrayList<>();
        a.put("a","b");
        a.put("home","two");
        a.put("nice","good");

        b.put("a","b");
        b.put("home","two");
        b.put("nice","good");
        b.put("avc","vasd");

    test1.add(a);
    test2.add(a);
    test2.add(b);
        if (a.equals(b)){
            System.out.println("It's the same");
        }
    System.out.println(test1);
    System.out.println(test2);


    }


}
