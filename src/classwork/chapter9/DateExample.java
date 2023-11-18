package classwork.chapter9;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class DateExample {
    // public static void main(String[] args) {
//        Date date = new Date();
//        SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy hh:mm");
//        System.out.println(sdf.format(date));}

    static Scanner scanner = new Scanner(System.in);
    static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

    public static void main(String[] args) throws ParseException {
        System.out.println("please input birthday(dd/MM/yyyy)");
        String birthdayStr=scanner.nextLine();
        Date date=sdf.parse(birthdayStr);
        System.out.println(date);
    }
}
