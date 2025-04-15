package org.example.Tasks.OOP.Sixth;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Vector vector = new Vector(2, 6, 8);
//
//        vector.vectorLength();
//        vector.scalarProduct();
//        vector.vectorProduct();
//        vector.angleBetweenVectors();

        Vector[] vectors = Vector.generate(10);
        for (Vector vec:
             vectors) {
            System.out.println(vec);
        }
    }
}
