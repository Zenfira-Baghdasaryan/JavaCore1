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
        int[] j = new int[10];
        for (int k = 0; k != index; k++)
            if (j != array) ;
        System.out.print("There is no element");

    }

    public void setArray(int value, int index) {
        int[] a = new int[index + 10];
        for (int i = index; i < array.length; i++) {

        }
        value = index;
        System.out.println("There is no element");
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
        if (value != size) ;
        return 0;
    }
}


