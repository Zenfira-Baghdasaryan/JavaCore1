package classwork.homework1.onlineStore.storage;

import classwork.homework1.onlineStore.model.User;
import classwork.homework1.onlineStore.model.enums.UserType;
import classwork.homework1.onlineStore.util.StorageSerializeUtil;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

public class UserStorage implements Serializable {
    private int size;

    public static void main(String[] args) {
        Map<String, User> myMap = new HashMap<>();


        myMap.put("zenfira@mail.com", new User("2005", "Zenfira", "zenfira@mail.com", "******", UserType.ADMIN));
        myMap.put("anna@mail.com", new User("2006", "Anna", "anna@mail.com", "******", UserType.USER));
        myMap.put("vahan@mail.ru", new User("2004", "Vahan", "vahan@mail.ru", "******", UserType.USER));

        User user = myMap.get("zenfira@mail.com");
        System.out.println(user);

//    }  public void printByType(UserType userType) {
//            for (int i = 0; i < size; i++) {
//                if (users[i].getUserType() == userType) {
//                    System.out.println(users[i]);
//                }
//    }
}}