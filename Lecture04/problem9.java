package Lecture04;

import java.util.Scanner;

public class problem9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        double sum = 0;

        for (int i = 1; i <= x; i++) {
            double result = (i * i - 1) * 1.0 / (i * i + 1) ;
            sum += result;
        }
        System.out.println(sum);
    }
}
