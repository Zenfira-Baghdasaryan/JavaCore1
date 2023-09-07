package classwork.chapter5;

public class SwitchExample {
    public static void main(String[] args) {
        String weekdays = "sunday";
        switch (weekdays) {
            case "monday":
                System.out.println("working");
                break;
            case"tuesday":
                System.out.println("working");
                break;
            case"wednesday":
                System.out.println("working");
                break;
            case "thursday":
                System.out.println("working");
                break;
            case"saturday":
                System.out.println("non-working");
                break;
            case"sunday":
                System.out.println("non-working");
                break;
        }

    }
}
