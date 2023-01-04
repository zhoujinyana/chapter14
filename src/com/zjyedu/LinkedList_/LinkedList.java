package com.zjyedu.LinkedList_;

public class LinkedList {
    public static void main(String[] args) {
        Node jack = new Node("jack");
        Node tom = new Node("tom");
        Node zjy = new Node("zjy");
        //连接三个结点，形成双向链表
        jack.next = tom;
        tom.next = zjy;
        zjy.pre = tom;
        tom.pre = jack;

        Node first = jack;
        Node last = zjy;

        //从头到尾遍历

        while(true){
            if(first == null){
                break;
            }
            System.out.println(first);
            first = first.next;
        }

        //从尾到头遍历
        while(true){
            if(last == null){
                break;
            }
            System.out.println(last);
            last = last.pre;
        }

        //双向链表添加数据
        Node lily = new Node("lily");
        lily.next = zjy;
        lily.pre = tom;
        zjy.pre = lily;
        tom.next = lily;

        first = jack;
        while(true){
            if(first == null){
                break;
            }
            System.out.println(first);
            first = first.next;
        }

        last = zjy;
        while(true){
            if(last == null){
                break;
            }
            System.out.println(last);
            last = last.pre;
        }

    }
}
//双向链表的一个结点
class Node{
    public Object item;//存放数据的地方
    public Node next;
    public Node pre;

    public Node(Object item) {
        this.item = item;
    }

    @Override
    public String toString() {
        return "Node name=" + item;
    }
}