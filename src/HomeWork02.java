import java.util.ArrayList;
import java.util.Iterator;

public class HomeWork02 {
    public static void main(String[] args) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new Car("宝马",40000));
        arrayList.add(new Car("宾利",500000));
        //arrayList.remove("宝马");
        //需要用两个对象来查找，而不是直接这样用名字找不到
        //System.out.println(arrayList.contains("宾利"));
        System.out.println(arrayList.size());
        System.out.println(arrayList.isEmpty());
        //arrayList.clear();
        arrayList.addAll(arrayList);
        for (Object o : arrayList) {
            System.out.println(o);

        }
        Iterator iterator = arrayList.iterator();
        while (iterator.hasNext()) {
            Object next =  iterator.next();
            System.out.println(next);

        }

    }
}
class Car{
    private String name;

    public Car(String name, double price) {
        this.name = name;
        this.price = price;
    }

    private double price;

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

    @Override
    public String toString() {
        return "Car{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}