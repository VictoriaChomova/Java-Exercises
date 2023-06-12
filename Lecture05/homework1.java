package Lecture05;

import java.util.Scanner;

public class homework1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please, enter an even number.");
        int count = scanner.nextInt();

        int[] numbersArr = new int[count];
        int[] newArr = new int[count];

        if (count % 2 != 0) {
            System.out.println("Invalid input!");
        } else {
            for (int index = 0; index < count; index++) {
                numbersArr[index] = scanner.nextInt();
            }

            for (int i = 0; i < count / 2; i++) {
                int firstNum = numbersArr[i];
                int secondNum = numbersArr[count / 2 + i];
                newArr[count / 2 + i] = firstNum;
                newArr[i] = secondNum;
            }

            for (int i = 0; i < count; i++) {
                System.out.println(newArr[i]);
            }
        }
    }
}
