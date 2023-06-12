package Lecture05;

import java.util.Scanner;

public class w3resourceEx07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Length of the Array:");
        int count = scanner.nextInt();
        int[] numbersArr = new int[count];
        int[] newArr = new int[count - 1];

        System.out.println("Write the numbers:");

        for (int i = 0; i < count; i++) {
            numbersArr[i] = scanner.nextInt();
        }

        System.out.println("Number to remove:");
        int numberToRemove = scanner.nextInt();
        int numCount = 0;

        for (int i = 0; i < numbersArr.length; i++) {
            if (numbersArr[i] == numberToRemove) {
                continue;
            } else {
                newArr[numCount] = numbersArr[i];
                numCount++;
            }
        }
        System.out.println("The new Array is:");
        for (int i = 0; i < newArr.length; i++) {
            System.out.println(newArr[i]);
        }

    }
}
