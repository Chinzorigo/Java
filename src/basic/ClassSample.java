package basic;

import java.util.Arrays;

public class ClassSample {

    public static void main(String[] args) {
        Student Chinzo = new Student();
        Chinzo.rno = 99;
        Chinzo.name = "Chinzorig";
        Chinzo.marks = 99.99f;

        System.out.println(Chinzo.rno);

    }

}
class Student {
    int rno;
    String name;
    Float marks;
}
