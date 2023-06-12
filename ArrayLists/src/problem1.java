import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class problem1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numbersList = new ArrayList<>();

        String input = scanner.nextLine();

        while (!input.equals("end")) {
            int number = Integer.parseInt(input);
            numbersList.add(number);
            input = scanner.nextLine();
        }
        List<Integer> splitNumbersLeft = new ArrayList<>();
        List<Integer> splitNumbersRight = new ArrayList<>();

        int numberToSplit = Integer.parseInt(scanner.nextLine());
        int indexToSplit = 0;
        for (int i = 0; i < numbersList.size(); i++) {
            if (numbersList.get(i) != numberToSplit) {
                splitNumbersLeft.add(numbersList.get(i));
            } else {
                indexToSplit = i;
                break;
            }
        }

        for (int j = indexToSplit + 1; j < numbersList.size(); j++) {
            splitNumbersRight.add(numbersList.get(j));
        }

        System.out.println(splitNumbersLeft.toString().replaceAll("[\\[\\]]", ""));
        System.out.println(splitNumbersRight.toString().replaceAll("[\\[\\]]", ""));
    }
}
