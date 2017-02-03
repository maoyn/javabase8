package listObjectTest;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Author:Administrator
 * Date:  2016/8/16
 * Time: 10:39
 * json格式实验
 */

public class listObjectTest {
    @Test
    public void objectTest() {
        //pojo object = new pojo("1", "2");
        //pojo object1 = new pojo("1", "2", "3");
        //List addObject = new ArrayList<>();
        //List addJSON = new ArrayList<>();
        //Map<String, String> mapSet = new HashMap<>();
        //mapSet.put("abc", "1231");
        //mapSet.put("ca", "1231");
        //mapSet.put("dd", "1231");
        //String jsonMap = JSON.toJSONString(mapSet);
        //System.out.println("jsonMap-------" + jsonMap);
        //
        //
        //addObject.add(object);
        //addObject.add(object1);
        //addObject.add(mapSet);
        //System.out.println("addObject-----" + addObject);
        //
        //
        //JSONObject json = new JSONObject();
        //JSONObject json1 = new JSONObject();
        //json1.put("abc", json);
        //json1.put("2213", "231");
        //json.put("abc", "1231");
        //addJSON.add(json);
        //addJSON.add(json1);
        //System.out.println("json1-------" + json1);
        //System.out.println("addJSON-------" + addJSON);
        //
        //
        //String[] arr_String = {"a", "b", "c"};
        //
        //String json_arr_String = JSON.toJSONString(arr_String, true);
        //JSONArray jsonArray = JSON.parseArray(json_arr_String);
        //json.put("saf", jsonArray);
        //System.out.println("json_arr_String--------:" + json);


        List<JSONObject> jsonObject = new ArrayList<>();
        List<String> abc = new ArrayList<>();
        JSONArray jsonList = new JSONArray();
        JSONObject jsonList1 = new JSONObject();
        //jsonList.put("a", "1231");

        //jsonList.put("c", "1231");
        abc.add("dsad");
        abc.add("ac");
        abc.add("dad");
        abc.remove("d");
        System.out.println("abc------------"+abc);
        //jsonObject.add(jsonList);
        jsonList.add("asda");
        jsonList.add("d");
        jsonList.add("c");

        //jsonList1.put("name",jsonList);
        //jsonObject.add(jsonList1);
        //jsonObject.add(jsonList1);
        //jsonObject.add(jsonList);jsonList
        //
        //jsonObject.add(jsonList);
        //JSONObject jsonTest = new JSONObject();
        //jsonTest.put("jsonObjec", jsonObject);
        //System.out.println("jsonListTest--------:" + jsonObject);
        System.out.println("jsonListTest--------:" + jsonList);
        System.out.println("jsonListTest--------:" + jsonList1);
        System.out.println("jsonListTest--------:" + jsonObject);


        String a ="以上皆错";
        System.out.println(a.contains("以上皆"));


        long c = 1477963841223L;
        int b = 80*40*1000;

         long d =1;
        d+=d;
        System.out.println(d);
        Date e = new Date() ;
          System.out.println("------------:"+e);




    }

}
