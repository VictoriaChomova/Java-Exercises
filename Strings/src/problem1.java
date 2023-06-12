import java.util.Scanner;

public class problem1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
String modifiedInput = "";
        for (int i = 0; i < input.length(); i += 2) {
            modifiedInput += input.charAt(i + 1);
            modifiedInput += input.charAt(i);
        }

        System.out.println(modifiedInput);
    }
}
