package classwork.chapter9;

import java.util.Date;

public class Null {
    public static void main(String[] args) {
       Date date=getToday(true);
       if (date!=null){
        System.out.println(date.getTime());
    }}
    static Date getToday(boolean a){
        if (a){
            return new Date();
        }
        return null;
    }
}
