package classwork.chapter3;

public class LongExample {
    public static void main(String[] args) {
        int lightspeed = 1;
        long days;
        long seconds;
        long distance;
        days = 100;
        seconds = days * 24 * 60 * 60;
        distance = lightspeed * seconds;
        System.out.println("in" + days);
        System.out.println(distance + "miles");
        System.out.println(seconds + days);
    }
}
