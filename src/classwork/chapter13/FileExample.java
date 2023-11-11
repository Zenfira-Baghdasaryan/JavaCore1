package classwork.chapter13;

import java.io.File;

public class FileExample {
    public static void main(String[] args) {
        File file=new File("\"C:\\Users\\zenfi\\IdeaProjects\\JavaCore1\\src\\classwork\\chapter13\"FileExample.java");
        System.out.println(file.exists());
    }
}
