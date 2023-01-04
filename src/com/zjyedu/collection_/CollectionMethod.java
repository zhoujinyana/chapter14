package com.zjyedu.collection_;

import java.util.ArrayList;

public class CollectionMethod {
    public static void main(String[] args) {
        ArrayList arrayList = new ArrayList();
        //add添加单个元素
        arrayList.add("jack");
        arrayList.add(10);
        arrayList.add(true);
        System.out.println(arrayList);
        //remove删除指定元素
        //arrayList.remove(0);
        System.out.println(arrayList);
        arrayList.remove(true);
        System.out.println(arrayList);
        //contains查找元素是否存在
        System.out.println(arrayList.contains("jack"));
        //size获取元素个数
        System.out.println(arrayList.size());
        //isEmpty判断是否为空
        System.out.println(arrayList.isEmpty());
        //clear清空
        arrayList.clear();
        System.out.println(arrayList);
        //addAll添加多个元素
        ArrayList arrayList1 = new ArrayList();
        arrayList1.add("红红楼梦");
        arrayList1.add("三国演义");
        arrayList.addAll(arrayList1);
        System.out.println(arrayList);
        //containsAll查找多个元素是否存在
        System.out.println(arrayList.containsAll(arrayList1));
        //removeAll删除多个元素
        arrayList.add("水浒传");
        arrayList.removeAll(arrayList1);
        System.out.println(arrayList);



    }
}
