package com.zjyedu.list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListExercise {
    public static void main(String[] args) {
        List list = new ArrayList();
        list.add("hello");
        list.add("hi");
        list.add("zjy");
        list.add("lining");
        list.add("happy");
        list.add("like");
        list.add("be");
        list.add("love");
        list.add("duck");
        list.add("puma");
        list.add(2,"zjyedu");
        list.get(5);
        list.remove(6);
        list.set(7,"lisa");
        Iterator iterator = list.iterator();
        while (iterator.hasNext()) {
            Object next =  iterator.next();
            System.out.println(next);

        }


    }
}
