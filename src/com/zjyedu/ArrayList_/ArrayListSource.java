package com.zjyedu.ArrayList_;

import java.util.ArrayList;

public class ArrayListSource {
    public static void main(String[] args) {

        //使用无参构造器创建ArrayList对象
        ArrayList list = new ArrayList();
        //ArrayList list = new ArrayList(8);
        //使用for循环给list集合添加数据
        for(int i = 1;i <= 10;i++){
        list.add(i);
    }
        for(int i = 11;i <= 15;i++) {
            list.add(i);
        }
        list.add(100);
        list.add(200);
        list.add(null);
        for (Object object : list){
            System.out.println(object);
        }



    }
}
