package com.zjyedu.set_;

import java.util.HashSet;
import java.util.Set;

public class HashSet_ {
    public static void main(String[] args) {
        Set hashSet = new HashSet();
        hashSet.add(null);
        //只能存放一个空值，不重复
        hashSet.add(null);
        System.out.println(hashSet);



    }
}
