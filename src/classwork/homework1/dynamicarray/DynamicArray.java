package classwork.homework1.dynamicarray;

public class DynamicArray {
    int[] array = new int[10];
    int size = 0;

    void add(int value) {
        if (size == array.length) {
            extend();
        }
        array[size++] = value;
    }

    void extend() {
        int[] tmp = new int[array.length + 10];
        for (int i = 0; i < size; i++) {
            tmp[i] = array[i];
        }
        array = tmp;
    }

    void print() {
        for (int i = 0; i < size; i++) {
            System.out.print(array[i] + " ");
        }
    }

    public void deleteByIndex(int index) {
        if (index < 0 || index > array[array.length - 1]) {
            System.out.println("There is no element");
            return;
        }
        for (int i = index; i < size; i++) {
            array[i - 1] = array[i];
        }
    }

    public void setArray(int value, int index) {
        index = value;
        for (int i = index; i < size; i++) {
            array[i - 1] = array[i];}
            System.out.println("No element");

    }

    public boolean exists(int value) {
        if (value != size) {
            System.out.println("false");
        } else {
            System.out.println("true");
        }
        return false;
    }

    public int getIndexByValue(int value) {
        for (int i = value; i < array.length; i++)
            if (value != size) ;
        return 0;

    }
}


