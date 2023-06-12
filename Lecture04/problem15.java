package Lecture04;

import java.util.Scanner;

public class problem15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        for (int rows = 1; rows <= 5 ; rows++) {
            if (rows % 2 == 0) {
                System.out.println("o");
            } else {
                for (int cols = 1; cols <=5; cols++) {
                    System.out.print("o");
                }
                System.out.println("");
            }
        }
    }
}
