import java.util.Scanner;

public class problem4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

//        String newString = "";
//
//       newString += input.charAt(0);
//       newString += input.charAt(1);
//       newString += input.charAt(input.length()-2);
//       newString += input.charAt(input.length()-1);
//
//        System.out.println(newString);

        StringBuilder newString = new StringBuilder();

        newString.append(input.substring(0, 2));
        newString.append(input.substring(input.length()-2, input.length()));
        System.out.println(newString);


    }
}
