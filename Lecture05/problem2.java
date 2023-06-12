package Lecture05;

import java.util.Scanner;

public class problem2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numbersArr = new int[10];
        int sum = 1;
        int product = 1;

        for (int index = 0; index < 10; index++) {
            numbersArr[index] = scanner.nextInt();
        }

        for (int i = 0; i < 10; i++) {
            product *= numbersArr[i];
            sum += numbersArr[i];
        }

        double avg = sum * 1.0 / numbersArr.length;
        System.out.println("The product is " + product + ".");
        System.out.println("The sum is " + sum + ".");
        System.out.println("The average number is " + avg + ".");
    }
}
