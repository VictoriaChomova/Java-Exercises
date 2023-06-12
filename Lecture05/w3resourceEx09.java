package Lecture05;

import java.util.Scanner;

public class w3resourceEx09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Write the length of the Array:");
        int count = scanner.nextInt();
        int[] numbersArr = new int[count];
        int[] newArr = new int[count + 1];
        System.out.println("Write the numbers:");

        for (int i = 0; i < count; i++) {
            numbersArr[i] = scanner.nextInt();
        }

        System.out.println("Write a number to insert:");
        int numberToInsert = scanner.nextInt();
        System.out.println("Index:");
        int indexPosition = scanner.nextInt();
        for (int i = 0; i < indexPosition; i++) {
            newArr[i] = numbersArr[i];
        }
        newArr[indexPosition] = numberToInsert;
        for (int i = indexPosition + 1; i < newArr.length; i++) {
            newArr[i] = numbersArr[i-1];
        }

        for (int i = 0; i < newArr.length; i++) {
            System.out.println(newArr[i]);
        }

    }
}
