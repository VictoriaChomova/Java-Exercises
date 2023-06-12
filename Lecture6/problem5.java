package Lecture6;

import java.util.Scanner;

public class problem5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int sum = 0;
        while (number > 0) {

            int currentDig = number % 10;
            sum += currentDig;

            number = number / 10;
        }

        System.out.println(sum);
    }
}
