package Lecture05;

import java.util.Scanner;

public class homework5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numArrLength = scanner.nextInt();
        int[] numbersArrFirst = new int[numArrLength];
        int[] numbersArrSecond = new int[numArrLength];
        int[] newArr = new int[numArrLength];

        for (int indexFirst = 0; indexFirst < numArrLength; indexFirst++) {
            numbersArrFirst[indexFirst] = scanner.nextInt();
        }

        for (int indexSecond = 0; indexSecond < numArrLength; indexSecond++) {
            numbersArrSecond[indexSecond] = scanner.nextInt();
        }

        for (int index = 0; index < numArrLength; index++) {
            newArr[index] = numbersArrFirst[index] * numbersArrSecond[numArrLength - 1 - index];
        }

        for (int index = 0; index < numArrLength; index++) {
            System.out.println(newArr[index]);
        }

    }
}
