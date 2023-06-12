package Lecture05;

import java.util.Scanner;

public class problem6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = scanner.nextInt();
        int[] numbersArr = new int[count];

        for (int i = 0; i < count; i++) {
            numbersArr[i] = scanner.nextInt();
        }
        int maxNum = Integer.MIN_VALUE;
        int minNum = Integer.MAX_VALUE;

        for (int i = 0; i < count; i++) {
            if(numbersArr[i] > maxNum) {
                maxNum = numbersArr[i];
            } else if (numbersArr[i] < minNum) {
                minNum = numbersArr[i];
            }
        }

        System.out.println("Tha max number is: " + maxNum);
        System.out.println("Tha min number is: " + minNum);
    }
}
