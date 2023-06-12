package Lecture04;

import java.util.Scanner;

public class problem10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        double product = 1;

        for (int i = 1; i <= n; i++) {
            double result = (i - 1) * 1.0 / (i + 1);
            product += result;
        }
        System.out.println(product);
    }
}
