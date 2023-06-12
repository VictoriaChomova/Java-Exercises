package Lecture02;

public class problem26 {
    public static void main(String[] args) {
        //) False and not (True or not (False or True ))
        System.out.println(false && !(true || !(false || true)));
    }
}
