package classwork.chapter4;

public class Ternary {
    public static void main(String[] args) {
        int h, l;
        h = 12;
        l = h < 0 ? -h : h;
        System.out.print("Absolute value of");
        System.out.println(h + "is" + l);
        h = -12;
        l = h < 0 ? -h : h;
        System.out.print("Absolute value of");
        System.out.println(h + "is" + l);
    }
}
