package com.zjyedu.list;

import java.util.ArrayList;
import java.util.List;

public class List_ {
    public static void main(String[] args) {
        List list = new ArrayList();
   //取出顺序和添加顺序一致
        list.add("jack");
        list.add("tom");
        list.add("mary");
        System.out.println(list);
//支持索引
        System.out.println(list.get(0));


    }
}
