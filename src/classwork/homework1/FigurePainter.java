package classwork.homework1;

public class FigurePainter {
        public static void main(String[] args) {
            System.out.println();
            //homework 1
            for (int i = 0; i < 5; i++) {
                for (int j = 0; j <= i; j++) {
                    System.out.print("* ");
                }
                System.out.println();
            }
            System.out.println();
            System.out.println();
            //homework 2
            for (int i = 5; i > 0; i--) {
                for (int j = 0; j < i; j++) {
                    System.out.print("* ");
                }
                System.out.println();
            }
            System.out.println();
            System.out.println();
            //homework 3
            for (int i = 5; i > 0; i--){
                for (int j = 0; j <=i ; j++) {
                    System.out.print("  ");
                }
                for (int j = 0; j <= (5 - i); j++) {
                    System.out.print("* ");
                }
                System.out.println();
            }
            System.out.println();
            System.out.println();
            //homework 4
            for (int i = 5; i > 0; i--) {
                System.out.print("    ");
                for (int j = 0; j<(5-i) ; j++) {
                    System.out.print("  ");
                }
                for (int j = 0; j <= (i-1); j++) {
                    System.out.print("* ");
                }
                System.out.println();}
            System.out.println();
            System.out.println();
            //homework 5
            for (int i = 5; i >0; i--) {
                for (int j = 0; j <=i ; j++) {
                    System.out.print(" ");
                }
                for (int j = 0; j <= (5 - i); j++) {
                    System.out.print("* ");
                }
                System.out.println();
            }
            for (int i = 4; i > 0; i--) {
                System.out.print("  ");
                for (int j = 0; j<(5-i) ; j++) {
                    System.out.print(" ");
                }
                for (int j = 0; j <= (i-1); j++) {
                    System.out.print("* ");
                }
                System.out.println();

            }

        }}
