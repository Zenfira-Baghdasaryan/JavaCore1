package classwork.chapter6;

public class BoxTest {
    public static void main(String[] args) {
        Box myBox = new Box();
        Box myBox2 = new Box();
        double vol;
        myBox2.width = 3;
        myBox.width = 5;
        System.out.println(myBox.width);
        System.out.println(myBox2.width);
        System.out.println(myBox.height);
        System.out.println(myBox2.width * myBox.width);
        vol= myBox.width+ myBox2.width;
        System.out.println(vol);
    }
}
