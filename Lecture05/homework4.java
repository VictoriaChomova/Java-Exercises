package Lecture05;

import java.util.Scanner;

public class homework4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = scanner.nextInt();

        double[] numbersArr = new double[count];
        double[] newArr = new double[count];

        for (int i = 0; i < count; i++) {
            numbersArr[i] = scanner.nextDouble();
        }

        for (int i = 0; i < count; i++) {
            newArr[i] = numbersArr[i] / 2;
        }

        for (int i = 0; i < count; i++) {
            System.out.println(newArr[i]);
        }
    }
}
