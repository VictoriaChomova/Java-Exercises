import java.util.Scanner;

public class problem6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String firstWord = scanner.nextLine();
        String secondWord = scanner.nextLine();

        boolean even = firstWord.length() % 2 == 0;
        StringBuilder newWord = new StringBuilder();
        if (even) {
            newWord.append(firstWord);
            newWord.insert(firstWord.length() / 2, secondWord);
        } else {
            newWord.append(firstWord);
            newWord.replace(firstWord.length() / 2, firstWord.length() / 2 + 1, secondWord);
        }
        System.out.println(newWord);

    }
}
