package Lecture04;

import java.util.Scanner;

public class problem11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int counter = 0;
        for (int i = -1; i >= x; i--) {
            if (i % 7 == 0) {
                counter++;
            }
        }
        System.out.println(counter);

    }
}
