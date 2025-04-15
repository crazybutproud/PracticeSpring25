package org.example.Tasks.OOP.Second;

public class Main {
    public static void main(String[] args) {
        Person nullPerson = new Person();
        Person person = new Person("Олег Александрович",34);

        nullPerson.talk();
        nullPerson.move();

        person.talk();
        person.move();
    }
}
