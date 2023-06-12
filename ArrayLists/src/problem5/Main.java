package problem5;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Student> studentsList = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            System.out.println("Write student's name:");
            String name = scanner.nextLine();
            System.out.println("Write student's age:");
            int age = Integer.parseInt(scanner.nextLine());
            System.out.println("Write student's grade:");
            int grade = Integer.parseInt(scanner.nextLine());
            System.out.println("Write student's gender:");
            String gender = scanner.nextLine();
            studentsList.add(new Student(name, age, grade, gender));
        }
        System.out.println("Write the name of the student you are looking for:");
        String studentWanted = scanner.nextLine();
        for (Student student : studentsList) {
            if (student.name.equals(studentWanted)) {
                Student.showStudent(studentsList, student);
                break;
            }
        }
    }
}


