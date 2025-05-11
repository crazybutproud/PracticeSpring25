package org.example.Tasks.Recursion.Twelve;

public class BinarySearchTree {
    Node root;      // Корень дерева

    public BinarySearchTree() {
        root = null;
    }

    // Рекурсивный метод для вставки нового значения
    private Node insertRec(Node root, int value) {
        // Если дерево пустое или достигли места вставки
        if (root == null) {
            root = new Node(value);
            return root;
        }

        // Иначе рекурсивно идем по дереву
        if (value < root.value) {
            root.left = insertRec(root.left, value);
        } else if (value > root.value) {
            root.right = insertRec(root.right, value);
        }

        // Возвращаем неизмененный указатель узла
        return root;
    }

    // Публичный метод для вставки (обертка над рекурсивным)
    public void insert(int value) {
        root = insertRec(root, value);
    }

    // Рекурсивный метод для поиска значения
    private boolean containsRec(Node root, int value) {
        // Базовый случай: узел пустой или значение найдено
        if (root == null) {
            return false;
        }
        if (root.value == value) {
            return true;
        }

        // Рекурсивный случай: идем влево или вправо
        if (value < root.value) {
            return containsRec(root.left, value);
        } else {
            return containsRec(root.right, value);
        }
    }

    // Публичный метод для поиска
    public boolean contains(int value) {
        return containsRec(root, value);
    }

    // Рекурсивный обход дерева в порядке "in-order" (левый-корень-правый)
    private void inOrderRec(Node root) {
        if (root != null) {
            inOrderRec(root.left);
            System.out.print(root.value + " ");
            inOrderRec(root.right);
        }
    }

    // Публичный метод для обхода
    public void inOrder() {
        inOrderRec(root);
    }
}
