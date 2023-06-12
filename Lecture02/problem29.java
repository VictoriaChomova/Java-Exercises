package Lecture02;

public class problem29 {
    public static void main(String[] args) {
        //(not True or not False) or (not (True or (False and True)))
        System.out.println((!true || !false) || (!(true || (false && true))));
    }
}
