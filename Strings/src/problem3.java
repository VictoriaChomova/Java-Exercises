import java.util.Scanner;

public class problem3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        int index = input.lastIndexOf("s") ;
        String modifiedInput = input.substring(0, index + 1);
        System.out.println(modifiedInput);
    }
}
