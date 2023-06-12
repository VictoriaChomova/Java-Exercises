package Lecture03;

import java.util.Scanner;

public class problem13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double meters = scanner.nextDouble();
        char operation = scanner.next().charAt(0);
        double result = 0;

        switch (operation) {
            case 'k':
                result = meters / 1000;
                break;
            case 'c':
                result = meters * 100;
                break;
            case 'm':
                result = meters * 0.000621371;
                break;
            case 'i':
                result = meters * 39.3701;
                break;
            default:
                System.out.println("Unknown operation.");
        }

        System.out.println(result);
    }
}
