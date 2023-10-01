package classwork.homework1.dynamicarray;

import java.io.File;
import java.sql.Array;
import java.sql.SQLOutput;

public class DynamicArrayDemo {
    public static void main(String[] args) {
        DynamicArray dy = new DynamicArray();
        dy.add(7);
        dy.add(5);
        dy.add(8);
        dy.add(9);
        dy.add(10);
        dy.print();
        dy.deleteByIndex(2);
        dy.print();
        dy.set(2, 44);
        dy.print();
        dy.add(3, 99);
        dy.print();
        System.out.println(dy.exists(7));
        System.out.println(dy.exists(77));
        System.out.println(dy.getIndexByValue(5));
        System.out.println(dy.getIndexByValue(90));

    }
}
