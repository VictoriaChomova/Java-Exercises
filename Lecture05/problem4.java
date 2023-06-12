package Lecture05;

import java.util.Scanner;

public class problem4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numbersArr = new int[10];
        int[] multipleOfThreeArr = new int[10];
        int[] multipleOfFiveArr = new int[10];
        int counterThree = 0;
        int counterFive = 0;

        for (int index = 0; index < 10; index++) {
            numbersArr[index] = scanner.nextInt();
        }

        for (int index = 0; index < 10; index++) {
            if (numbersArr[index] % 3 == 0) {
                multipleOfThreeArr[counterThree] = numbersArr[index];
                counterThree++;
            }
            if (numbersArr[index] % 5 == 0) {
                multipleOfFiveArr[counterFive] = numbersArr[index];
                counterFive++;
            }
        }
        System.out.println("The numbers that are multiples of three are:");
        for (int i = 0; i < counterThree; i++) {
            System.out.println(multipleOfThreeArr[i]);
        }
        System.out.println("The numbers that are multiples of five are:");
        for (int i = 0; i < counterFive; i++) {
            System.out.println(multipleOfFiveArr[i]);
        }
    }
}
