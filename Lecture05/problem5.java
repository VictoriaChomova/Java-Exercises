package Lecture05;

import java.util.Scanner;

public class problem5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numbersArr = new int[10];
        int[] checkedNumbersArr = new int[10];

        for (int index = 0; index < 10; index++) {
            numbersArr[index] = scanner.nextInt();
        }

        for (int i = 0; i < 10; i++) {
            boolean isFound = false;
            int firstNum = numbersArr[i];
            int counter = 0;

            for (int j = 0; j < 10; j++) {
                if (firstNum == checkedNumbersArr[j]) {
                    isFound = true;
                    break;
                }
            }

            for (int j = 0; j < 10; j++) {
                if (firstNum == numbersArr[j] && !isFound) {
                    counter++;
                }
            }

            if (!isFound) {
                checkedNumbersArr[i] = firstNum;
                System.out.println("The number " + firstNum + " is contained " + counter + " times in the Array.");
            }
        }


//        int[] numbersArr = new int[10];
//        int[] repeatedNumbersArr = new int[5];
//        int counter = 0;
//
//        for (int index = 0; index < 10; index++) {
//            numbersArr[index] = scanner.nextInt();
//        }
//        for (int i = 0; i < 10; i++) {
//            int firstNum = numbersArr[i];
//            for (int j = i + 1; j < 10; j++) {
//                int secondNum = numbersArr[j];
//                boolean isFound = false;
//                for (int k = 0; k < repeatedNumbersArr.length; k++) {
//                    if (firstNum == repeatedNumbersArr[k]) {
//                        isFound = true;
//                        break;
//                    }
//                }
//                if (firstNum == secondNum && !isFound) {
//                    repeatedNumbersArr[counter] = firstNum;
//                    counter++;
//                }
//            }
//        }
//        for (int i = 0; i < counter; i++) {
//            System.out.println(repeatedNumbersArr[i]);
//        }
    }
}
