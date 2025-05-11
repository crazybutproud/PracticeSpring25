package org.example.Tasks.Recursion.Twelve;

//Реализация бинарного дерева поиска
public class Main {
    public static void main(String[] args) {
        BinarySearchTree bst = new BinarySearchTree();

        // Вставка элементов
        bst.insert(50);
        bst.insert(30);
        bst.insert(20);
        bst.insert(40);
        bst.insert(70);
        bst.insert(60);
        bst.insert(80);

        // Обход дерева
        System.out.println("In-order обход:");
        bst.inOrder();  // Выведет: 20 30 40 50 60 70 80

        // Поиск элементов
        System.out.println("\nПоиск 40: " + bst.contains(40));  // true
        System.out.println("Поиск 90: " + bst.contains(90));  // false
    }
}
