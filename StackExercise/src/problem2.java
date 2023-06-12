import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Stack;

public class problem2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = Integer.parseInt(scanner.nextLine());

        Stack<Integer> numbersList = new Stack<>();
        //-x2+3x-2
        for (int i = 0; i < x; i++) {
            numbersList.push((-i * -i) + 3 * i - 2);
        }

        System.out.println(numbersList.toString().replaceAll("[\\[\\]]", ""));
    }
}
