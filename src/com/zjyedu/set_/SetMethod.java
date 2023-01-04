package com.zjyedu.set_;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetMethod {
    public static void main(String[] args) {
        Set set = new HashSet();
        set.add("jack");
        set.add("tom");
        set.add("lucy");
        set.add(null);
        set.add("jack");
        //取出的顺序是固定的，但与存放顺序不一致
        System.out.println(set);
//        for (int i = 0; i < 10; i++) {
//            System.out.println(set);
//        }
        Iterator iterator = set.iterator();
        while (iterator.hasNext()) {
            Object next =  iterator.next();
            System.out.println(next);
        }
        for (Object o :set) {
            System.out.println(o);

        }



    }
}
