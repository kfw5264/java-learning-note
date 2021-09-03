package com.masq.basic.generosity;

import java.util.ArrayList;

/**
 * @title App
 * @Author masq
 * @Date: 2021/9/2 上午11:26
 * @Version 1.0
 */
public class App {

    public static void main(String[] args) {
//        test1();
//        ArrayList<String> stringList = new ArrayList<>();
//        stringList.add("a");
//
//        String s = stringList.get(0);

//        testTenSizeArray();

//        DifferentTypeGenerosity<String, String> generosity = new DifferentTypeGenerosity<>();

    }

    private static void test1() {
        ArrayList<String> strList = new ArrayList<>();
        ArrayList<Integer> intList = new ArrayList<>();
        System.out.println(strList.getClass() == intList.getClass());
    }

    private static void testTenSizeArray() {
        TenSizeArray<String> tenSizeArray = new TenSizeArray<>();
        tenSizeArray.add("aaa");
        tenSizeArray.add("bbb");
        System.out.println(tenSizeArray.get(0));
        System.out.println(tenSizeArray.get(1));
        System.out.println(tenSizeArray.get(4));
        System.out.println(tenSizeArray.get(10));
    }

}
