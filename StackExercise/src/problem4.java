import java.util.*;
import java.util.stream.Collectors;

public class problem4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Stack<Integer> numbersList = new Stack<>();

        String input = scanner.nextLine();

        while (!input.equals("end")) {
            int number = Integer.parseInt(input);
            numbersList.push(number);
            input = scanner.nextLine();
        }

        int numToAdd = Integer.parseInt(scanner.nextLine());

        Stack<Integer> tempStack = new Stack<>();

        Iterator<Integer> iter = numbersList.iterator();

        while (iter.hasNext()) {
            tempStack.push(numbersList.pop());
            tempStack.push(numToAdd);

        }

        Stack<Integer> finalStack = new Stack<>();

        int finalStackSize = tempStack.size();

        for (int i = 0; i < finalStackSize; i++) {
            finalStack.push(tempStack.pop());
        }

        System.out.println(finalStack.toString().replaceAll("[\\[\\]]", ""));
    }
}
