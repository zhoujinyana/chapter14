package com.zjyedu.list;

import java.util.ArrayList;
import java.util.List;

public class ListMethod {
    public static void main(String[] args) {
//        1)void add(int index,Object ele):在index位置插入ele元素
            List list = new ArrayList();
            list.add("jack");
            list.add("lily");
            list.add(1,"zjy");
            System.out.println(list);

//        2) boolean addAll(int index,Collection eles):从index位苦开始将eles中的所有元素添加进来

        List list1 = new ArrayList();
        list1.add("tom");
        list1.add("xixi");
        list.addAll(1,list1);
        System.out.println(list);
//        3) Object get(int index):获取指定index位置的元素
//        4)int indexOf(Object obj):返回obj在集合中首次出现的位置

        System.out.println(list.indexOf("xixi"));
//        5) int lastindexOf(Object obj):返回obj在当前集合中未次出现的位置
        list.add("zjy");
        System.out.println(list.lastIndexOf("zjy"));
//        6)Object remove(int index):移除指定index位置的元素，井返回此元素
        list.remove(0);
        System.out.println(list);
//        7)Object set(int index,Object ele):设置指定index位置的元素为ele ,相当于是替换.
        list.set(1,"dd");
        System.out.println(list);

//        8)List subList(int fromIndex, int tolndex):返回从fromIndex到tolndex位置的子集合
        System.out.println(list.subList(0,2));

    }
}
