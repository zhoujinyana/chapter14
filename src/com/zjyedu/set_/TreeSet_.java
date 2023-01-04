package com.zjyedu.set_;

import java.util.Comparator;
import java.util.TreeSet;

public class TreeSet_ {
    public static void main(String[] args) {
        TreeSet treeSet = new TreeSet(new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
                //调用String的CompareTo方法
                //return ((String) o1).compareTo((String) o2);
                return ((String) o1).length()-((String) o2).length();


            }
        });
        //添加数据
        treeSet.add("jack");
        treeSet.add("tom");
        treeSet.add("sp");
        treeSet.add("a");

        System.out.println(treeSet);
    }
}
