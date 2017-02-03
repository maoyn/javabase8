package com.winterbe.java8.samples.stream;

import java.util.*;
import java.util.stream.Collectors;

/**
 * Author:Administrator
 * Date:  2017/1/11
 * Time: 14:31
 * 流对集合操作支持很方便。
 */
public class MyStreamTest {

    public static void main(String[] args) {
        List<String> names = Arrays.asList("1", "3", "2", "4");
        names.forEach(o -> {
            System.out.println(o);
        }); //forEach函数实现内部迭代




        Map<String, String> name = new HashMap<>();
        name.put("China","张三");






        color ab = new color("blue", "john", "男",15);
        color bc = new color("red", "alis", "男",19);
        color cd = new color("yellow", "john", "女",22);
        List<color> colorList = new ArrayList<>();
        colorList.add(ab);
        colorList.add(bc);
        colorList.add(cd);
        //Lambda新特性函数实现内部迭代List列表方法
        colorList.forEach(result -> {
            System.out.println("distinctPrimary result is:" + result.getName());
        });


        //java8新特性流方法获取对象列表中获取以某个属性作为条件的所有属性
        //此代码功能将列表中名字为john的对象取出，获取likeColor属性的值
        colorList.stream().filter(s -> s.getName() == "john").forEach(s -> {
            System.out.println(s.getLikeColor());
        });



        //java8新特性 删选出name属性等于john的color值提取到新的list对象里
        List<color> blue = colorList.stream()
                .filter(s -> s.getName() == "john")
                .collect(Collectors.toList());
        System.out.println("abc++" + blue.size());


        //将john喜欢的颜色提取到新的set集合中
        Set<String> likeColorList = colorList.stream()
                .filter(s -> s.getName() == "john")
                .map(s -> s.getLikeColor())
                .collect(Collectors.toSet());
        likeColorList.forEach(l-> {System.out.println("john喜欢的颜色有"+l);});

        Optional<color> firstBlue = colorList.stream()
                .filter(s -> s.getName() == "john")
                .findFirst();

        System.out.println("第一个元素："+firstBlue);

        int sum = colorList.stream()
                .filter(s -> s.getName() == "john")
                .mapToInt(s -> s.getAge())
                .sum();
        System.out.println("符合john条件的数据age相加"+sum);




    }
}
