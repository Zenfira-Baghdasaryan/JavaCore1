package classwork.homework1.bracechecker;

import classwork.chapter6.Stack;

public class BraceChecker {
    public static void main(String[] args) {
        String text = "Hello (from) [Java} ";
        int count = 0;
        for (int i = 0; i < text.length(); i++) {
            switch (text.charAt(i)) {
                case '(':
                    count++;
                case '{', '[':
                    count += 2;
                case ')':
                    count--;
                case '}', ']':
                    count -=2;
            }
        }
        if( count==0){
            System.out.println("Brackets are valid");
        }
    else{
            System.out.println("Brackets are invalid");
    }

}}

