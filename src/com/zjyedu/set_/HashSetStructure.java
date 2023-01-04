package com.zjyedu.set_;

public class HashSetStructure {
    public static void main(String[] args) {
        //模拟hashSet底层，同hashmap
        Node[] table = new Node[16];
        System.out.println(table);
        Node john = new Node("john", null);
        table[2] = john;
        Node jack = new Node("jack",null);
        john.next = jack;
        
        System.out.println(table);


    }
}
class Node{
    Object item;
    Node next;

    public Node(Object item, Node next) {
        this.item = item;
        this.next = next;
    }

    @Override
    public String toString() {
        return "Node{" +
                "item=" + item +
                ", next=" + next +
                '}';
    }
}
