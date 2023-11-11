package classwork.chapter12;

import classwork.chapter8.A;

public class EnumDemo {
    public static void main(String[] args) {
        EnumExample.Apple ap;
        ap = EnumExample.Apple.RedDel;
        System.out.println("Value of ap:" + ap);
        System.out.println();
        ap = EnumExample.Apple.Winesap;
        if (ap == EnumExample.Apple.Winesap)
            System.out.println("ap contains GoldenDel.\n");
        switch (ap) {
            case Jonathan:
                System.out.println("Jonathan is red.");
                break;
            case GoldenDel:
                System.out.println("Golden Delicious is yellow.");
                break;
            case RedDel:
                System.out.println("Red Delicious is red.");
                break;
            case Winesap:
                System.out.println("Winesap is red.");
                break;
            case Cortland:
                System.out.println("Cortland is red.");
                break;

        }
    }
}
