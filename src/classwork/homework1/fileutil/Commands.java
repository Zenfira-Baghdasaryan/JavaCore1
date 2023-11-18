package classwork.homework1.fileutil;

import classwork.homework1.Sort;

public interface Commands {
    //numberOne
   String PATH="1";
   String FILE_NAME="2";
   //numberTwo
    String KEYWORD="2";
    //numberThree
    String TXT_PATH="1";
    //numberFive
    String PATH_LOCATION="1";
    String CONTENT="3";
    static void numberOneCommands(){
        System.out.println("Please input "+PATH+"for PATH");
        System.out.println("Please input "+FILE_NAME+"for FILE_NAME");
    }
    static void numberTwoCommands(){
        System.out.println("Pleas input "+PATH+"for PATH");
        System.out.println("Pleas input "+KEYWORD+"to find .txt");

    }
    static void numberThreeCommands(){
        System.out.println("Please input "+TXT_PATH+"for TXT_PATH");
        System.out.println("Pleas input "+KEYWORD+"to find .txt words");
    }
    static void numberFourCommands(){
        System.out.println("Please input "+PATH+"for PATH");

    }
    static void numberFiveCommands(){
        System.out.println("Please input"+PATH_LOCATION+"to find file location");
        System.out.println("Please input "+FILE_NAME+"for FILE_NAME");
        System.out.println("Please input"+CONTENT+"to find file contents");

    }



}
