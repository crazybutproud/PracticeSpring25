package org.example.Tasks.OOP.First;

public class Phone {
    private int number;
    private String model;
    private double weight;

    public Phone(int number, String model, double weight) {
        this.number = number;
        this.model = model;
        this.weight = weight;
    }

    public Phone(int number, String model) {
        this(number, model, 0.0);
    }

    public Phone() {
        this(0, "Unknown", 0.0);
    }

    private void openConnection() {
        System.out.println("Open connection...");
    }

    public void receiveCall(String name) {
        openConnection();
        System.out.println("Звонит " + name);
    }

    public void receiveCall(String name, int number) {
        openConnection();
        System.out.println("Звонит " + name + " c номера " + number);
    }

    public void printInfo() {
        System.out.println("Number: " + number + ", Model: " + model + ", Weight: " + weight);
    }

    public void sendMessage(int... numbers) {
        System.out.println("Отправка сообщения на номера:");
        for (int num : numbers) {
            System.out.println(num);
        }
    }

    public int getNumber() {
        return number;
    }

    public String getModel() {
        return model;
    }

    public double getWeight() {
        return weight;
    }
}
