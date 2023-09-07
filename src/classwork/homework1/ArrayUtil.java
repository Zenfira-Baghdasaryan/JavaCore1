package classwork.homework1;

import com.sun.security.jgss.GSSUtil;

import java.security.spec.RSAOtherPrimeInfo;

public class ArrayUtil {
    public static void main(String[] args) {
        int[] numbers = {1, 6, 3, 9, 15, 52, -3, 5, 8};
        //1
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }
        //2
        System.out.println();
        System.out.println("First:" + numbers[0]);
        //3
        System.out.println("Last:" + numbers[numbers.length - 1]);
        //4
        System.out.println("Length is:" + numbers.length);
        //5
        int min = numbers[0];
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] < min) {
                min = numbers[i];
            }
        }
        System.out.print("Min:" + min);
        //6
        if (numbers.length % 2 == 0) {
            System.out.println(numbers[numbers.length / 2 - 1] + " " + numbers[numbers.length]);
        } else {
            System.out.println();
            System.out.println("middle num:" + numbers[numbers.length / 2]);
            //7
            int evenCount = 0;
            for (int i = 0; i < numbers.length; i++) {
                if (numbers[i] % 2 == 0) {
                    evenCount++;
                }
            }
            System.out.println("evenCount :" + evenCount);
            //8
            int oddCount = 0;
            for (int num : numbers) {
                if (num % 2 != 0) {
                    oddCount++;
                }
            }
            System.out.println("oddCount:" + oddCount);
            //9
            int sum = 0;
            for (int i = 0; i < numbers.length; i++) {
                sum += numbers[i];
            }
            System.out.println("Sum:" + sum);
            //10
            System.out.println("Avg:" + sum / numbers.length);
        }
    }
}


