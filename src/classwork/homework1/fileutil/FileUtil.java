package classwork.homework1.fileutil;

import classwork.homework1.onlineStore.command.Commands;
import classwork.homework1.onlineStore.model.User;
import classwork.homework1.onlineStore.model.enums.UserType;

import java.io.File;
import java.util.Scanner;

public class FileUtil {
    private static Scanner scanner=new Scanner(System.in);

    public static void main(String[] args) {
        boolean isRun = true;
        while (isRun) {
            Commands.printMainCommands();
            String command = scanner.nextLine();
            switch (command) {
//                case PATH:
//                    isRun = false;
//                    break;
//                case FILE_NAME:
//                    filename();
//                    break;
//                case REGISTER:
//                    register();
//                    break;
//                default:
//                    System.out.println("Unknown Command!");
//            }
//        }
//    }
//
//    private static void filename() {
//            System.out.println("Please input email,password");
//            String loginDataStr = scanner.nextLine();
//            String[] loginDataArr = loginDataStr.split(",");
//            File file = FileStorage.(loginDataArr[0]);
//            if (file == null || !file.getPassword().equals(loginDataArr[1])) {
//                System.out.println("email or password is incorrect!");
//                return;
//
//
//        }
//
//    }

}}}}
