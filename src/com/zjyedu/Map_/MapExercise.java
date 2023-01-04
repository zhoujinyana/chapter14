package com.zjyedu.Map_;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapExercise {
    public static void main(String[] args) {
        Map hashMap = new HashMap();
        hashMap.put(1,new Employee(1,2000,"jack"));
        hashMap.put(2,new Employee(2,28000,"tom"));
        hashMap.put(3,new Employee(3,5000,"lucy"));

        Set keySet = hashMap.keySet();
        for (Object key :keySet) {
            Employee emp = (Employee) hashMap.get(key);
            if(emp.getSalary() > 18000){
                System.out.println(emp);
            }
        }
        Set entrySet = hashMap.entrySet();
        Iterator iterator = entrySet.iterator();
        while (iterator.hasNext()) {
            //Object next =  iterator.next();
            Map.Entry entry = (Map.Entry) iterator.next();
            Employee emp = (Employee) entry.getValue();
            if(emp.getSalary() > 18000){
                System.out.println(emp);
            }

        }


    }
}
class Employee{
    private int id;
    private double salary;
    private String name;

    public Employee(int id, double salary, String name) {
        this.id = id;
        this.salary = salary;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", salary=" + salary +
                ", name='" + name + '\'' +
                '}';
    }
}