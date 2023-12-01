package Homework5;

public class Person {
    String name;
    int age;
    boolean isMan;

    Person(String name, int age, boolean isMan) {
        this.name = name;
        this.age = age;
        this.isMan = isMan;
    }

    Person(){};

    public void showPersonInfo() {
        String genderPlaceholder = " he is a man";
        String result;
        if (!isMan) {
            genderPlaceholder = " she is a woman";
        }
        result = name + " is " + age + " years old " + "and" + genderPlaceholder;
        System.out.println(result);
    }
}
