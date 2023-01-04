package com.zjyedu.set_;





import java.util.HashSet;

public class HashSet01 {
    public static void main(String[] args) {
        HashSet set = new HashSet();
        System.out.println(set.add( "john"));
        System.out.println(set.add( "lucy "));
        System.out.println(set.add("john" ));
        System.out.println(set.add( "jack"));
        System.out.println(set.add( "Rose"));
        set.remove( "john ");
        System.out.println( "set=" + set);

        set = new HashSet();
        set.add( "lucy");
        set.add("lucy");
        //创建两个，名字重复可以成功加入
        set.add(new Dog( "tom"));//ok
        set.add(new Dog( "tom"));//ok
        System.out.println("set=" + set);

        //重要面试题，第二个不能成功加入
        set.add(new String("zjy"));//ok
        set.add(new String("zjy"));//添加不了
        System.out.println(set);


    }
}
class Dog{
    private String name;

    public Dog(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                '}';
    }
}