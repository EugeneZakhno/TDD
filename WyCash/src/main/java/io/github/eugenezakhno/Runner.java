package io.github.eugenezakhno;

import org.junit.Assert;

public class Runner {
    public static void main(String[] args) {
        System.out.println(testMultiplication());
    }

    public static void testMultiplication() {
        Dollar five = new Dollar(5);
        five.times(2);
        Assert.assertEquals(10, five.amount);
    }

}
