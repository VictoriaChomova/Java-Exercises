package problem5;

import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Stack<Student> studentsList = new Stack<>();

        for (int i = 0; i < 10; i++) {
            String name = scanner.nextLine();
            int age = Integer.parseInt(scanner.nextLine());
            int grade = Integer.parseInt(scanner.nextLine());
            String gender = scanner.nextLine();
            studentsList.push(new Student(name, age, grade, gender));
        }

        String studentWanted = scanner.nextLine();
        for (Student student : studentsList) {
            if (student.name.equals(studentWanted)) {
                Student.showStudent(studentsList, student);
                break;
            }
        }
    }
}
