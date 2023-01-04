package com.zjyedu.Map_;


import java.util.HashMap;
import java.util.Map;

public class MapMethod {
    public static void main(String[] args) {
        Map map = new HashMap();
        map. put("邓超",new Book(" ",100));
        map. put("邓超","孙俪");
        map.put("王宝强","马蓉");
        map.put("宋喆","马蓉");
        map.put("刘令博", null);
        map. put(null,"刘亦菲");
        map.put("鹿啥","关晓彤");

        System.out.println(map);

        map.remove(null);
        System.out.println(map);

        Object val = map.get("鹿晗");
        System.out.println(val);

        System.out.println(map.size());

       // map.clear();

        System.out.println(map.containsKey("邓超"));



    }
}
class Book{
    private String name;
    private int num;

    public Book(String name, int num) {
        this.name = name;
        this.num = num;
    }
}