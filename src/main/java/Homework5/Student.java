package Homework5;

public class Student extends Person {
    double score;

    Student(String name, int age, boolean isMan, double score) {
        super(name,age,isMan);
        if (score < 2 || score > 6) {
            this.score = 2;
        } else {
            this.score = score;
        }
    }

    public void showStudentInfo() {
        showPersonInfo();
        System.out.print(" and their grade is: " + score);
        System.out.println();
    }
}