package classwork.chapter10;

public class MyExceptionExample {
    public static void main(String[] args) {
        int a = 10;
        int c = a * 5;
        int[] numbers = {1, 2, 3, 4, 5};
        try {
            System.out.println(numbers[4]);
            System.out.println("end of try block");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("catch block works!");
        }
    }
}
