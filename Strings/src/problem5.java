import java.util.Scanner;

public class problem5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] sentence = scanner.nextLine().split(" ");
        int wordsCount = sentence.length;
        System.out.println(wordsCount);
    }
}
