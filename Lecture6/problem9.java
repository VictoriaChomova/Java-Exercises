package Lecture6;

import java.util.Scanner;

public class problem9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbersArr = new int[10];
        int[] newArr = new int[10];

        for (int i = 0; i < 10; i++) {
            numbersArr[i] = scanner.nextInt();
        }
        for (int i = 0; i < 10; i +=2) {
            newArr[i] = numbersArr[i+1];
            newArr[i+1] = numbersArr[i];
        }

        for (int i = 0; i < 10; i++) {
            System.out.println(newArr[i]);
        }
    }
}
