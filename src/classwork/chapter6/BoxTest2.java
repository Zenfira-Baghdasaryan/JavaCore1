package classwork.chapter6;

public class BoxTest2 {
    public static void main(String[] args) {
        Box b1=new Box();
        Box b2=b1;
        Box b3 =new Box();
        b1.width=10;
        System.out.println(b2.width);
        b1.width=20;
        System.out.println(b1.width);
        b3.width=23;
        System.out.println(b3.width);
    }
}
