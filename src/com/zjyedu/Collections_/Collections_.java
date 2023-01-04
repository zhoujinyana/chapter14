package com.zjyedu.Collections_;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
@SuppressWarnings({"all"})
public class Collections_ {
    public static void main(String[] args) {
        List list = new ArrayList();

        list.add("tom");
        list.add("king");
        list.add("lilya");
        Collections.reverse(list);
        System.out.println(list);
//随机排序输出
        Collections.shuffle(list);
        System.out.println(list);
        //自然排序按照元素升序排序输出
        Collections.sort(list);
        System.out.println(list);
        //按照长度大小排序
        Collections.sort(list, new Comparator() {
            public int compare(Object o1,Object o2){
                return ((String) o2).length()-((String) o1).length();
            }

        });
        System.out.println(list);
//交换位置
        Collections.swap(list,0,1);
        System.out.println(list);
//根据元素的自然顺序,返回给定集合中的最大元素
        Collections.max(list);
        Object max = Collections.max(list, new Comparator() {
            public int compare(Object o1,Object o2){
                return ((String) o2).length()-((String) o1).length();
            }
        });
        System.out.println(max);

        System.out.println("tom出现的次数" + Collections.frequency(list,"tom"));

        ArrayList dest = new ArrayList();
        //拷贝,需要先给dest赋值，大小和list.size()一样
        for (int i = 0; i < list.size(); i++) {
            dest.add("");
        }
        Collections.copy(dest,list);
        System.out.println(dest);
//替换
        Collections.replaceAll(list,"tom","xixi");
        System.out.println(list);




    }
}
