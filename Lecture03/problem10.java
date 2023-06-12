package Lecture03;

import java.util.Scanner;

public class problem10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        double c = scanner.nextDouble();

        double discriminant = b * b + 4 * a * c;

        if (discriminant > 0) {
            System.out.println("The equation has two real roots.");
            System.out.print((-b + Math.sqrt(discriminant)) / (2 * a) + " ");
            System.out.println((-b - Math.sqrt(discriminant)) / (2 * a));
        } else if (discriminant == 0) {
            System.out.println("The equation has one real root.");
            System.out.println(- b / 2 * a);
        } else {
            System.out.println("The equation has two complex roots");
        }
    }
}
