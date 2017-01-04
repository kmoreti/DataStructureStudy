package day2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by moreti on 1/3/17.
 */
public class Prime {
    public static boolean isPrime(long number) {
        for (long divisor = 2; divisor < number; divisor++) {
            if (number % divisor == 0) {
                return false;
            }
        }
        return true;
    }

    public static void printPrimes(int number) {
        boolean [] primes = new boolean [number + 1];
        for (int i = 2; i <= number; i++) {
            primes[i] = true;
        }

        for (int divisor = 2; divisor * divisor <= number; divisor++) {
            if (isPrime(divisor)) {
                for (int i = divisor * 2;  i <= number; i = i + divisor) {
                    primes[i] = false;
                }
            }
        }

        for (int i = 2; i <= number; i++) {
            if (primes[i]) {
                System.out.println(" " + i);
            }
        }
    }

    public static void main(String[] args) throws IOException {
        int number = 0;
        do {
            BufferedReader keyboard = new BufferedReader(new InputStreamReader(System.in));
            number = Integer.parseInt(keyboard.readLine());
            printPrimes(number);
        } while (number >= 0);

    }
}
