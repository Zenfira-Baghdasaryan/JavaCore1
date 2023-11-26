package classwork.chapter10;

import java.util.Locale;

public class MyExceptionExample {
    public static void main(String[] args) {
        try{
            System.out.println("Hello from try");
            throw new RuntimeException("");
        }catch (Exception e){
            System.out.println("Hello from catch");
            System.exit(0);
        }finally {
            System.out.println("Bye");
        }

//        String numberStr = "2345d69";
//        try {
//            int i = Integer.parseInt(numberStr);
//            System.out.println(i * i);
//        } catch (NumberFormatException e) {
//            System.err.println("Error: " + e.getMessage());
//        }


//        String name="Poxos 1 ";
//        String s= null;
//        try {
//            s = StringUtil.checkString(name);
//            System.out.println(s);
//
//        } catch (Exception e) {
//            System.out.println(e.getMessage());
//        }
//        int a = 10;
//        int c = a * 5;
//        int[] numbers = {1, 2, 3, 4, 5};
//        try {
//            System.out.println(numbers[4]);
//            System.out.println("end of try block");
//        } catch (ArrayIndexOutOfBoundsException e) {
//            System.out.println("catch block works!");
//        }
//        int index = 7;
//        if (index > 0 && index < numbers.length - 1) {
//            System.out.println(numbers[index]);
//        }
//    }
//    }

    }
}