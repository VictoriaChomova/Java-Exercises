import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Stack;

public class problem1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Stack<Integer> numbersList = new Stack<>();

        String input = scanner.nextLine();

        while (!input.equals("end")) {
            int number = Integer.parseInt(input);
            numbersList.push(number);
            input = scanner.nextLine();
        }
        Stack<Integer> splitNumbersLeft = new Stack<>();
        Stack<Integer> splitNumbersRight = new Stack<>();

        int numberToSplit = Integer.parseInt(scanner.nextLine());
        int indexToSplit = 0;
        for (int i = numbersList.size(); i > 0; i--) {
            if (numbersList.peek() != numberToSplit) {
                splitNumbersRight.push(numbersList.pop());
            } else {
                indexToSplit = i - 1;
                numbersList.pop();
                break;
            }
        }

        for (int j = indexToSplit; j > 0; j--) {
            splitNumbersLeft.push(numbersList.pop());
        }

        for (int i = splitNumbersLeft.size() - 1; i >= 0  ; i--) {
            System.out.print(splitNumbersLeft.pop());
            System.out.print(" ");
        }
        System.out.println("");

        for (int i = splitNumbersRight.size() - 1; i >= 0 ; i--) {
            System.out.print(splitNumbersRight.pop());
            System.out.print(" ");
        }

    }
}
