
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class problem2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = Integer.parseInt(scanner.nextLine());

        List<Integer> numbersList = new ArrayList<>();
//-x2+3x-2
        for (int i = 0; i < x; i++) {
            numbersList.add((-i * -i) + 3 * i - 2);
        }

        System.out.println(numbersList.toString().replaceAll("[\\[\\]]", ""));
    }
}

