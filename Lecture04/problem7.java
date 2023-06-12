package Lecture04;

import java.util.Scanner;

public class problem7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int x = scanner.nextInt();
        int sum = 0;
        for (int i = 1; i <= x; i++) {
            int product = i * i;
            sum += product;
        }
        System.out.println(sum);
    }
}
