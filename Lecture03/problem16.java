package Lecture03;

import java.util.Scanner;

public class problem16 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double x = scanner.nextDouble();
        double y = scanner.nextDouble();

        if (x > 0) {
            if (y == 0) {
                System.out.println("The point lays on the positive side of the axe x.");
            } else if (y > 0) {
                System.out.println("The point is in square 1.");
            } else {
                System.out.println("The point is in square 4");
            }
        } else if (x < 0) {
            if (y == 0) {
                System.out.println("The point lays on the negative side of the axe x.");
            } else if (y > 0) {
                System.out.println("The point is in square 2");
            } else {
                System.out.println("The point is in square 3");
            }
        } else {
            if (y == 0) {
                System.out.println("The point lays in the beginning of the coordinate system.");
            } else if (y > 0) {
                System.out.println("The point lays on the positive side of the axe y.");
            } else {
                System.out.println("The point lays on the negative side of the axe y.");
            }
        }
    }
}
