package Lecture04;

import java.util.Scanner;

public class problem14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("o");
        for (int rows = 1; rows <= 4 ; rows++) {
            System.out.print("o");
            for (int cols = 2; cols <= rows ; cols++) {
                System.out.print(" ");
            }
            System.out.print("o");
            System.out.println("");
        }
        for (int rows = 1; rows <=6 ; rows++) {
            System.out.print("o");
        }
    }
}
