import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Stack;

public class problem3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = Integer.parseInt(scanner.nextLine());

        Stack<Integer> numbersList = new Stack<>();

        for (int i = 0; i < num; i++) {
            numbersList.push((int)(Math.pow(2, i)));
        }

        System.out.println(numbersList.toString().replaceAll("[\\[\\],]", ""));
    }
}
