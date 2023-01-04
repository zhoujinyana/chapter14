package com.zjyedu.Map_;

import java.util.HashMap;
import java.util.Map;

@SuppressWarnings({"all"})
public class Map_ {
    public static void main(String[] args) {
        Map map = new HashMap();
        map.put("no1","zjy");//k-v
        map.put("no2","lily");
        map.put("no1","lucy");//当有相同的k时候，相当于替换
        map.put("no3","lucky");
        map.put(null,null);
        map.put(null,"zbc");
        map.put("no4",null);
        System.out.println(map);
        System.out.println(map.get("no1"));


    }
}
