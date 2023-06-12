package Lecture6;

import java.util.Scanner;

public class problem11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] firstArr = new int[10];
        int[] secondArr = new int[10];

        int[] newArr = new int [20];

        for (int i = 0; i < 10; i++) {
            firstArr[i] = scanner.nextInt();
        }


        for (int i = 0; i < 10; i++) {
            secondArr[i] = scanner.nextInt();
        }

        for (int i = 0; i < 20; i += 2) {
            newArr[i] = firstArr[i/2];
            newArr[i + 1] = secondArr[i/2];
        }

        for (int i = 0; i < 20; i++) {
            System.out.println(newArr[i]);
        }
    }
}
