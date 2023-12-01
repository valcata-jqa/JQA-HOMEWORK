package Homework5;

public class Main {
    public static void main(String[] args) {
        Person[] personArray = new Person[10];
        Person personOne = new Person("Gosho", 20, true);
        Person personTwo = new Person("Petra", 25, false);

        Student studentOne = new Student("Angel", 15, true, 0);
        Student studentTwo = new Student("Panaiotka", 13, false, 5.23);

        Employee employeeOne = new Employee("Angel", 25, true, 80);
        Employee employeeTwo = new Employee("Kameliq", 14, false, 7);
        personArray[0] = personOne;
        personArray[1] = personTwo;
        personArray[2] = studentOne;
        personArray[3] = studentTwo;
        personArray[4] = employeeOne;
        personArray[5] = employeeTwo;

        for (Person pers: personArray) {
            if (pers instanceof Student) {
                ((Student) pers).showStudentInfo();
            } else if (pers instanceof Employee) {
                ((Employee) pers).showEmployeeInfo();
            } else if (pers != null) {
                pers.showPersonInfo();
            }
        }

        for (Person current: personArray) {
            if (current instanceof  Employee) {
                double overtime = ((Employee) current).calculateOverTime(2);
                System.out.println(current.name + " should be payed " + overtime +" leva more");
            }
        }

    }
}
