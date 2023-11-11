package classwork.chapter12;

import java.security.AllPermission;

public class EnumDemo2 {
    public static void main(String[] args) {
        EnumExample.Apple ap;
        System.out.println("Here are all Apple constants:");
        EnumExample.Apple allapples[]= EnumExample.Apple.values();
        for (EnumExample.Apple a : allapples)
            System.out.println(a);
        ap= EnumExample.Apple.valueOf("Winesap");
        System.out.println("ap contains "+ap);

    }
}
