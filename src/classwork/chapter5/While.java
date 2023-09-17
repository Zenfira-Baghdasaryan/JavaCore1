package classwork.chapter5;

public class While {
    public static void main(String[] args) {
        int n = 10;
        while (n > 0) {
            System.out.println("tick" + n);
            n--;
        }
        System.out.println();
        System.out.println();
        int j, i;
        i = 10;
        j = 20;
        while (++i < --j) ;
        System.out.println("Midpoint is" + " " + i);
    }
}