package com.maoxingxing.exercise;

/**
 * Created by zhaoqi on 2016/4/27.
 */

public class HelloWorld {  // 作用域修饰类

    private static String sayHi = "hello world"; // 修饰字段

    public static void main(String[] args) { // 修饰方法
        // 执行这个类
        // 找到main方法
        // 在控制台打印一段话
        // 打印sayHi这个字段
        // sayHi的定义为 sayHi = "hello world";
        // 打印出hello world
        System.out.println(sayHi);
    }
}
