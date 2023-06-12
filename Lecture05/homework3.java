package Lecture05;

import java.util.Scanner;

public class homework3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = scanner.nextInt();

        int[] numbersArr = new int[count];
        int[] evenIndexArr = new int[count];
        int[] oddIndexArr = new int[count];

        for (int index = 0; index < count; index++) {
            numbersArr[index] = scanner.nextInt();
        }

        for (int index = 0; index < count; index++) {
            if (index % 2 == 0) {
                evenIndexArr[index / 2] = numbersArr[index];
            } else {
                oddIndexArr[index / 2] = numbersArr[index];
            }
        }
        for (int i = 0; i < count / 2 + 1; i++) {
            if (count % 2 == 0 && i == count / 2) {
                break;
            }
            System.out.println(evenIndexArr[i]);
        }

            System.out.println(" ");

            for (int i = 0; i < count / 2; i++) {
                System.out.println(oddIndexArr[i]);
            }
        }
    }
