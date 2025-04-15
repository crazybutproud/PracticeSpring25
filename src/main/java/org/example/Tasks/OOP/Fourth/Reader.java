package org.example.Tasks.OOP.Fourth;

import java.util.Date;

public class Reader {
    private String fio;
    private int ticketNumber;
    private String faculty;
    private String date;
    private int phoneNumber;

    public Reader(String fio, int ticketNumber, String faculty, String date, int phoneNumber) {
        this.fio = fio;
        this.ticketNumber = ticketNumber;
        this.faculty = faculty;
        this.date = date;
        this.phoneNumber = phoneNumber;
    }

    public void takeBook(int count){
        System.out.println(this.fio + " взял(а) " + count + " книг.");
    }
    public void takeBook(String... books){
        System.out.println(this.fio + " взял(а): " );
        for (String book : books) {
            System.out.print(book + ",");
        }
    }
    public void takeBook(Book... books){
        System.out.println(this.fio + " взял(а): " );
        for (Book book : books) {
            System.out.print(book + ",");
        }
    }

    public void returnBook(int count) {
        System.out.println(this.fio + " вернул(а) " + count + " книг.");
    }
    public void returnBook(String... books) {
        System.out.println(this.fio + " вернул(а): " );
        for (String book : books) {
            System.out.print(book + ",");
        }
    }
    public void returnBook(Book... books) {
        System.out.println(this.fio + " вернул(а): " );
        for (Book book : books) {
            System.out.print(book + ",");
        }
    }
}
