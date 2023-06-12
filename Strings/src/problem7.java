import java.util.Scanner;

public class problem7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().replaceAll("[.!?,:;]", "").split(" ");
        String maxWord = "";
        for (int i = 0; i < input.length; i++) {
            if (input[i].length() > maxWord.length()) {
                maxWord = input[i];
            }
        }

        System.out.println(maxWord);
    }
}
