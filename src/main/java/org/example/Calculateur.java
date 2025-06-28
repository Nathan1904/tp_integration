package org.example;

public class Calculateur {

    public int add(int a, int b) {
        return a + b;
    }

    public int substract(int a, int b) {
        return a - b;
    }

    public int multiply(int a, int b) {
        return a * b;
    }

    public int divide(int a, int b) {
        if (b == 0) throw new IllegalArgumentException("Division par zéro");
        return a / b;
    }

    public boolean isEven(int number) {
        return number % 2 == 0;
    }
}