package classwork.Example.overload;

class OverloadDemo {
    void test() {
        System.out.println("No Parameters");
    }

    void test(int a) {
        System.out.println("a: " + a);
    }

    void test(int a, int b) {
        System.out.println("a and b: " + a + " " + b);
    }
    void test(double c){
        System.out.println("double c: "+c);
    }
}
