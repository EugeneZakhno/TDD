package io.github.eugenezakhno;

import static org.junit.Assert.*;

public class Runner {
    public static void main(String[] args) {
        testMultiplication();
    }

    public static void testMultiplication() {
        Dollar five = new Dollar(5);
        five.times(2);
        assertEquals(10, five.amount);

    }

}
