package problem5;

import java.util.List;

public class Student {
    String name;
    int age;
    int grade;
    String gender;

    public Student(String name, int age, int grade, String gender) {
        this.name = name;
        this.age = age;
        this.grade = grade;
        this.gender = gender;
    }

    public static void showStudent(List<Student> students, Student student) {
        System.out.printf("name: %s%nage: %d%ngrade: %d%ngender: %s%n", student.name, student.age, student.grade, student.gender);

    }
}
