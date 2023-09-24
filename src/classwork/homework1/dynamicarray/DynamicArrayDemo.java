package classwork.homework1.dynamicarray;

import java.io.File;
import java.sql.Array;

public class DynamicArrayDemo {
    public static void main(String[] args) {
        DynamicArray dy = new DynamicArray();
        dy.add(7);
        dy.add(5);
        dy.add(8);
        dy.add(9);
        dy.add(10);
        dy.print();
        System.out.println();
        new DynamicArray().deleteByIndex(8);
        System.out.println();
        new DynamicArray().setArray(7, 9);
        System.out.println();
        new DynamicArray().exists(13);
        System.out.println();
        new DynamicArray().getIndexByValue(9);
        System.out.println();
    }
}
