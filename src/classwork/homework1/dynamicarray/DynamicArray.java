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

    void add(int index, int value) {
        if (index < 0 || index >= size) {
            System.out.println("Wrong index");
            return;
        }
        if (size == array.length) {
            extend();
        }
        for (int i = size; i >= index; i--) {
            array[i + 1] = array[i];

        }
        System.out.println();
        array[index] = value;
        size++;
    }

    int getIndexByValue(int value) {
        for (int i = 0; i < size; i++) {
            if (array[i] == value) {
                return i-1;
            }
        }
        return -1;
    }

    private void extend() {
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

    void deleteByIndex(int index) {
        if (index < 0 || index >= size) {
            System.out.println("There is no element");
            return;
        }
        for (int i = index + 1; i < size; i++) {
            array[i - 1] = array[i];
        }
        size--;
        System.out.println();
    }

    void set(int index, int value) {
        if (index < 0 || index >= size) {
            System.out.println("There is no element");
            return;
        }
        System.out.println();
        array[index] = value;
    }

    boolean exists(int value) {
        for (int i = 0; i < size; i++) {
            if (array[i] == value) {
                System.out.println();
                return true;
            }


        }
        return false;
    }

}


