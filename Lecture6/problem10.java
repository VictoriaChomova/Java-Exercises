package Lecture6;

import java.util.Scanner;

public class problem10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbersArr = new int[10];

        for (int i = 0; i < 10; i++) {
            numbersArr[i] = scanner.nextInt();
        }

        for (int i = 0; i < 10; i +=2) {
            int currentNum = numbersArr[i];
            numbersArr[i] = numbersArr[i+1];
            numbersArr[i+1] = currentNum;
        }

        for (int i = 0; i < 10; i++) {
            System.out.println(numbersArr[i]);
        }
    }
}
