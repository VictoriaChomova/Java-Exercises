import java.util.Scanner;

public class problem2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        String modifiedInput = input.replace("s", "ab").replace("a", "bb").replace("bbb", "x");

        System.out.println(modifiedInput);
    }
}
