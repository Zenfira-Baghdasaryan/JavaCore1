package classwork.Example.overload;
public class Overload {
    public static void main(String[] args) {
        OverloadDemo ob = new OverloadDemo();
        double result;
        ob.test();
        ob.test(5);
        ob.test(5, 7);
        ob.test(12.344);

    }
}
