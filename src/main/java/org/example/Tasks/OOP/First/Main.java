package org.example.Tasks.OOP.First;

public class Main {
    public static void main(String[] args) {

        Phone firstPhone = new Phone(765, "IPhone 3", 120.87);
        Phone secondPhone = new Phone(864, "Samsung A541");
        Phone thirdPhone = new Phone();

        firstPhone.printInfo();
        secondPhone.printInfo();
        thirdPhone.printInfo();

        firstPhone.receiveCall("Аня");
        secondPhone.receiveCall("Катя", 6252);

        thirdPhone.sendMessage(342, 873, 40009, 1111);

    }
}
