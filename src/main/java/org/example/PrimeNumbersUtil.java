package org.example;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

    public class PrimeNumbersUtil {

        public static List<Integer> getPrimeNumbersInRange(int lowerLimit, int upperLimit) {
            return IntStream.rangeClosed(lowerLimit, upperLimit)
                    .filter(PrimeNumbersUtil::isPrime)
                    .boxed()
                    .collect(Collectors.toList());
        }

        private static boolean isPrime(int number) {
            if (number <= 1) {
                return false;
            }
            return IntStream.rangeClosed(2, (int) Math.sqrt(number))
                    .allMatch(divisor -> number % divisor != 0);
        }
    }


