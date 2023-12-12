package org.example.Exceptionhandling;

public class Sum {
    public static void main(String[] args) {
        int data = 0;
        try {
            data = 100 / 0;
        } catch (ArithmeticException e) {
            System.err.println("This is Arithmetic Exception.....");
        }
        System.out.println("your data is " + data);
    }
}
