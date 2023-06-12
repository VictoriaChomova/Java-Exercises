package Lecture05;

import java.util.Scanner;

public class homework2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = scanner.nextInt();

        int[] numbersArr = new int[count];
        int[] evenNumbersArr = new int[count];
        int[] oddNumbersArr = new int[count];
        int evenCount = 0;
        int oddCount = 0;

        for (int index = 0; index < count; index++) {
            numbersArr[index] = scanner.nextInt();
        }

        for (int i = 0; i < count; i++) {
            if(numbersArr[i] % 2 == 0) {
                evenNumbersArr[evenCount] = numbersArr[i];
                evenCount++;
            } else {
                oddNumbersArr[oddCount] = numbersArr[i];
                oddCount++;
            }
        }

        for (int i = 0; i < evenCount; i++) {
            System.out.println(evenNumbersArr[i]);
        }

        System.out.println("");

        for (int i = 0; i < oddCount; i++) {
            System.out.println(oddNumbersArr[i]);
        }


    }
}
