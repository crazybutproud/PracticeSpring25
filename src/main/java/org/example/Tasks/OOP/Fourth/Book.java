package org.example.Tasks.OOP.Fourth;

public class Book {
    private String name;
    private String book;

    public Book(String name, String book) {
        this.name = name;
        this.book = book;
    }

    public String getName() {
        return name;
    }

    public String getBook() {
        return book;
    }

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", book='" + book + '\'' +
                '}';
    }
}
