import java.util.Scanner;

public class problem10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split(" ");
        for (String word:input) {
            System.out.print(word.charAt(2) + " ");
        }
    }
}
