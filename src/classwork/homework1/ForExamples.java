package classwork.homework1;

import com.sun.source.tree.ClassTree;

import java.sql.SQLOutput;

public class ForExamples {
    public static void main(String[] args) {
        //Homework 1
        for (int i = 1; i <= 1000; i++) {
            System.out.print("-");
            System.out.print(i);

        }
        System.out.println();
        System.out.println();
        //Homework 2
        for (int i = 1; i <= 100; i++) {
            if (i % 2 == 0)
                System.out.print(i + " ");

        }
        System.out.println();
        System.out.println();
        //Homework 3
        int[] numbers = {2, 5, 8, 4, 9, 3, 7};
        {
            int max = numbers[0];
            for (int i = 0; i < numbers.length; i++)
                if (numbers[i] > max) {
                    max = numbers[i];
                }

            System.out.println("Max:" + max);
        }
    }
}