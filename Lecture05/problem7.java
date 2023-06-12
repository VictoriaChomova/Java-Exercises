package Lecture05;

import java.util.Scanner;

public class problem7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] firstNumArr = new int[10];
        int[] secondNumArr = new int[10];
        int[] sumArr = new int[10];

        for (int index = 0; index < 10; index++) {
            firstNumArr[index] = scanner.nextInt();
        }
        for (int index = 0; index < 10; index++) {
            secondNumArr[index] = scanner.nextInt();
        }
        for (int index = 0; index < 10; index++) {
            int sum = firstNumArr[index] + secondNumArr[index];
            sumArr[index] = sum;
        }
        for (int index : sumArr) {
            System.out.println(index);
        }

    }
}
