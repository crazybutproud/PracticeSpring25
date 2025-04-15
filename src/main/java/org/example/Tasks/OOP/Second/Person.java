package org.example.Tasks.OOP.Second;

public class Person {
    private String fullName;
    private int age;

    public Person(String fullName, int age) {
        this.fullName = fullName;
        this.age = age;
    }

    public Person() {
        this("Unknown",0);
    }

    public void move() {
        System.out.println("Идет " + this.fullName + " возрастом " + this.age + " лет");
    }

    public void talk() {
        System.out.println( this.fullName +" говорит");
    }
    public String getFullName() {
        return fullName;
    }

    public int getAge() {
        return age;
    }
}
