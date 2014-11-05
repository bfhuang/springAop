package advice;

public class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void printName() {
        System.out.println("Person name: " + this.name);
    }

    public void printAge() {
        System.out.println("Person age: " + this.age);
    }

    public void throwException() {
        throw new IllegalArgumentException();
    }
}

