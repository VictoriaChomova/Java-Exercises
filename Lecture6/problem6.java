package Lecture6;

import java.util.Scanner;

public class problem6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = scanner.nextInt();
        int firstSum = 0;
        int secondSum = 0;

        while (number > 99) {
            int currentDig = number % 10;
            firstSum += currentDig;
            number /= 10;
        }

        while (number > 0) {
            int currentDig = number % 10;
            secondSum += currentDig;
            number /= 10;
        }

        System.out.println(firstSum>secondSum);


    }
}
