package org.example;

public class Main {
    public static void main(String[] args) {
        Student iuStudent = new IUStudent("yuriosen", 1, 5);
        Student mathStudent = new MathStudent("arina", 1, 5);

        iuStudent.writeExam();
        mathStudent.writeExam();

        System.out.println(iuStudent);
        System.out.println(mathStudent);
    }
}
