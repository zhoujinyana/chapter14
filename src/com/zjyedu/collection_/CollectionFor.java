package com.zjyedu.collection_;

import java.util.ArrayList;
import java.util.Collection;

public class CollectionFor {
    public static void main(String[] args) {
        Collection col = new ArrayList();

        col.add(new Book("三国演义","罗贯中",10.1));
        col.add(new Book("小李飞刀","古龙",10.1));
        col.add(new Book("红红楼梦","曹雪芹",10.1));

        //使用增强for循环,简化版的迭代器
        //快捷键 I
        //从col取数据给到book，一个一个给
        for(Object book : col){
            System.out.println(book);
        }
        //增强for也可以直接在数组使用

        int[] nums = {1,3,5,8};
        for(int i : nums){
            System.out.println(i);
        }
    }
}
