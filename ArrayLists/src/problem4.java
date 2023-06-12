import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class problem4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numbersList = Arrays.stream(scanner.nextLine().split(", "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        int numToAdd = Integer.parseInt(scanner.nextLine());


        for (int i = 0; i < numbersList.size(); i += 2) {
            numbersList.add(i, numToAdd);
        }

        System.out.println(numbersList.toString().replaceAll("[\\[\\]]", ""));

    }
}
