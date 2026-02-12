package com.example;

/**
 * Simple class that adds two integers.
 */
public class Add {
    /**
     * Returns the sum of a and b.
     */
    public int add(int a, int b) {
        return a + b;
    }

    /**
     * Small demo runner.
     */
    public static void main(String[] args) {
        Add adder = new Add();
        int result = adder.add(2, 3);
        System.out.println(result);
    }
}
