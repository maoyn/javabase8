package com.winterbe.java8.samples.stream;

/**
 * Author:Administrator
 * Date:  2017/1/11
 * Time: 11:49
 */



public class color {

    String likeColor ;
    String name ;
    String sex ;
    int age ;

    public color(String likeColor, String name, String sex , int age) {
        this.likeColor = likeColor;
        this.name = name;
        this.sex = sex;
        this.age = age;
    }

    public String getLikeColor() {
        return likeColor;
    }

    public void setLikeColor(String likeColor) {
        this.likeColor = likeColor;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
