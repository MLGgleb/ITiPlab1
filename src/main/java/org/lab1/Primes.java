package org.lab1;

public class Primes {
    public static void main(String[] args) {
        int cnt = 0;
        for (int i = 2; i <= 100; i++){
            if (isPrime(i)) {
                System.out.println(i);
                cnt += 1;
            }
        }
        System.out.println("Кол-во простых чисел: " + cnt);
    }
    public static boolean isPrime(int n) {
        for (int i = 2; i <= (int) Math.pow(n, 0.5); i++) {
            if (n % i == 0)
                return false;
        }
        return true;
    }
}