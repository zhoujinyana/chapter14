package com.zjyedu.Map_;

import java.util.*;

@SuppressWarnings({"all"})
public class MapFor {
    public static void main(String[] args) {
        Map map = new HashMap();
        map. put("邓超",new Book(" ",100));
        map. put("邓超","孙俪");
        map.put("王宝强","马蓉");
        map.put("宋喆","马蓉");
        map.put("刘令博", null);
        map. put(null,"刘亦菲");
        map.put("鹿啥","关晓彤");

        Set keySet = map.keySet();
        for (Object key :keySet) {
            System.out.println(map.get(key));
        }
        Iterator iterator = keySet.iterator();

        while (iterator.hasNext()) {
            Object next =  iterator.next();
            System.out.println(map.get(next));

        }
        Collection values = map.values();
        for (Object o :values) {
            System.out.println(o);
        }
        Iterator iterator1 = values.iterator();
        while (iterator1.hasNext()) {
            Object next =  iterator1.next();
            System.out.println(next);

        }

        Set entrySet = map.entrySet();//EntrySet<Map.Entry<K,v>>
        for (Object entry :entrySet) {
            Map.Entry m = (Map.Entry) entry;
            System.out.println(m.getValue());
        }
        Iterator iterator2 = entrySet.iterator();
        while (iterator2.hasNext()) {
            Object entry =  iterator2.next();
            System.out.println(entry.getClass());
            Map.Entry m = (Map.Entry) entry;
            System.out.println(m.getValue());

        }


    }
}
