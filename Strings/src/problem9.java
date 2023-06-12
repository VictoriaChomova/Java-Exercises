import java.util.Scanner;

public class problem9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split(" ");

        for (String word:input) {
            String currentWord = word.replaceAll("a", "@");
            System.out.print(currentWord + " ");
        }
    }
}
