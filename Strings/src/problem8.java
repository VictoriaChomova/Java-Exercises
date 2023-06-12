import java.util.Scanner;

public class problem8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split(" ");

        for (int i = 0; i < input.length; i++) {
            for (int j = i + 1; j < input.length; j++) {
                if (input[i].length() > input[j].length()) {
                    String minWord = input[j];
                    input[j] = input[i];
                    input[i] = minWord;
                }
            }
        }

        for (String word : input) {
            System.out.print(word + " ");
        }
    }
}


