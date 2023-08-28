package classwork.chapter3;

public class NumbersArrayExample {
    public static void main(String[] args) {
        char[] chars = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h'};
        int[] numbers = {2, 4, 6, 8, 10, 12, 14, 16};
        /** System.out.println(numbers[0]);
         System.out.println(numbers[1]);
         System.out.println(numbers[2]);
         */
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " " + chars[i] + " ");
        }
    }
}
