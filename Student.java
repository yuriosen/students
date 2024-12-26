package org.example;


public abstract class Student {
    private final String fullName;
    private final int course;
    private final double lastExamGrade;

    public Student(String fullName, int course, double lastExamGrade) {
        this.fullName = fullName;
        this.course = course;
        this.lastExamGrade = lastExamGrade;
    }

    public String getFullName() {
        return fullName;
    }

    public int getCourse() {
        return course;
    }

    public double getLastExamGrade() {
        return lastExamGrade;
    }

    public abstract void writeExam();

    @Override
    public String toString() {
        return "Student{" +
                "fullName='" + fullName + '\'' +
                ", course=" + course +
                ", lastExamGrade=" + lastExamGrade +
                '}';
    }
}
