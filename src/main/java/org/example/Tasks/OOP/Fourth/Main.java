package org.example.Tasks.OOP.Fourth;

public class Main {
    public static void main(String[] args) {
        Reader reader
                = new Reader("Вараксин А.Р.", 54321, "Прикладная физика", "23/12/01", 543214);

        Book book1 = new Book("Пушкин А.С.","Сборник произведений");
        Book book2 = new Book("Лермонтов С.С.","Сборник произведений");

        reader.returnBook(5);
        reader.returnBook("Настройка 1с","Над пропастью во ржи");
        reader.returnBook(book1,book2);

        System.out.println();

        reader.takeBook(5);
        reader.takeBook("Настройка 1с","Над пропастью во ржи");
        reader.takeBook(book1,book2);
    }
}
