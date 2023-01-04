package com.zjyedu.list;

import java.util.ArrayList;
import java.util.List;

public class ListExercise02 {
    public static void main(String[] args) {
        List list = new ArrayList();
        list.add(new Book("三国演义",34.5,"罗贯中"));
        list.add(new Book("红楼梦",45.6,"曹雪芹"));
        list.add(new Book("西游记",32,"吴承恩"));

        sort(list);
        for (Object o :list) {
            System.out.println(o);

        }

    }
    public static void sort(List list){
        for (int i = 0; i < list.size() - 1; i++) {
            for (int j = 0; j < list.size() - i - 1; j++) {
                //向下转型
                Book book1 = (Book) list.get(j);
                Book book2 = (Book) list.get(j + 1);
                if(book1.getPrice() > book2.getPrice()){
                    list.set(j,book2);
                    list.set(j + 1,book1);
                }


            }

        }
    }
}
class Book{
    private String name;
    private double price;
    private String author;

    public Book(String name, double price, String author) {
        this.name = name;
        this.price = price;
        this.author = author;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    @Override
    public String toString() {
        return "名称:" +
                  name + '\t' +
                "价格:" + price + '\t' +
                "作者:" + author + '\t' ;
    }
}