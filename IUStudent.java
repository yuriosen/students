package org.example;

public class IUStudent extends Student {
    public IUStudent(String fullName, int course, double lastExamGrade) {
        super(fullName, course, lastExamGrade);
    }

    @Override
    public void writeExam() {
        System.out.println(getFullName() + " пишет экзамен по информатике.");
    }
}
