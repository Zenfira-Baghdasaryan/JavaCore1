package classwork.homework1.fileutil;

import classwork.homework1.onlineStore.model.Order;
import classwork.homework1.onlineStore.model.Product;

import java.io.File;
import java.io.Serializable;

public class FileStorage implements Serializable {
    private File[] files=new File[10];
    private int size;
    public void add(File file) {
        if (files.length == size) {
            extend();
        }
        files[size++] = file;
    }   private void extend() {
        File[] tmp = new File[files.length + 10];
        System.arraycopy(files, 0, tmp, 0, files.length);
        files = tmp;
    }
    public void print() {
        for (int i = 0; i < size; i++) {
            System.out.println(files[i]);

//        }
//    }public File getFile(String file) {
//        for (int i = 0; i < size; i++) {
//            if (files[i].getFile().equals(file) && !files[i].isRemoved()) {
//                return files[i];
//            }
//        }
//        return null;
//    }
//
//}
        }}}