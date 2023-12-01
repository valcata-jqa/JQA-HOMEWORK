package Homework5;

public class Employee extends Person {
    double daySalary;
    Employee(String name, int age, boolean isMan, double daySalary) {
        super(name,age,isMan);
        this.daySalary = daySalary;
    }

    double calculateOverTime(double hours) {
        if (this.age < 18) {
            return 0;
        }
        double hourlyRate = daySalary / 8;
        return hours * hourlyRate * 1.5;
    }

    void showEmployeeInfo() {
            showPersonInfo();
            System.out.print(" and their daily salary is: " + daySalary);
            System.out.println();
    }
}