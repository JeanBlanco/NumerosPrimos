package org.example;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> primeNumbersList = PrimeNumbersUtil.getPrimeNumbersInRange(10, 30);
        System.out.println(primeNumbersList);
    }
}
