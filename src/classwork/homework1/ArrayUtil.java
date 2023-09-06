package classwork.homework1;

import com.sun.security.jgss.GSSUtil;

import java.security.spec.RSAOtherPrimeInfo;

public class ArrayUtil {
    public static void main(String[] args) {
        int[] numbers = {1, 6, 3, 9, 15, 52, -3, 5, 8};
        //1
        for (int i = 0; i < numbers.length; i++) {
            int sum = 0;
            sum = sum + numbers[i];
            System.out.print(sum + " ");

        }
        //2
        System.out.println();
        System.out.println();
        System.out.println(numbers[0]);
        //3
        System.out.println();
        System.out.println(numbers[8]);
        //4
        System.out.println();
        System.out.println(numbers.length);
        System.out.println();
        //5
        int min = numbers[0];
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] < min) {
                min = numbers[i];
            }
        }
        System.out.print("Min:" + min);
        //6

        System.out.println();
        System.out.println();
        int sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            sum = sum + numbers[i];
        }
        System.out.println(numbers[4]);
        System.out.println(sum - 62);
        //7
        System.out.println();
        int count = 0;
        for (int num : numbers) {
            if (num % 2 == 0) {
                count++;
            }
        }

        System.out.println("zuyg:" + count);
        //8
        System.out.println();
        int odd = 0;
        for (int num : numbers) {
            if (num % 2 != 0) {
                odd++;
            }
        }
        System.out.println("kent:" + odd);
        //9
        System.out.println();
        System.out.println(sum);
        //10
        System.out.println();
        System.out.println(sum / 9);
    }


}


