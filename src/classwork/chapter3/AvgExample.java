package classwork.chapter3;

public class AvgExample {
    public static void main(String[] args) {
        double[]numbers={1.1,1.2,1.3,1.4};
        double sum=0;
        for(int i=0;i<numbers.length;i++){
            sum=sum+numbers[i];
        }
        System.out.println(sum);
        System.out.println(sum/numbers.length);
    }}