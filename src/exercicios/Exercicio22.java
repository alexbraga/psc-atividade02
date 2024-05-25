package exercicios;

import java.util.*;

public class Exercicio22 {
    public static void main(String[] args) {
        System.out.println(
                "22. Altere o programa de cálculo dos números primos, informando, caso o número não seja primo, por " +
                "quais número ele é divisível.\n");

        System.out.println("Digite um número para saber se ele é um número primo:");
        Scanner scanner = new Scanner(System.in);

        System.out.println(isPrimeNumber(scanner));
        scanner.close();
    }

    private static String isPrimeNumber(Scanner scanner) {
        int number = scanner.nextInt();
        String isNotPrime = "O número " + number + " não é um número primo";
        String isPrime = "O número " + number + " é um número primo";

        if (number <= 1) {
            findDivisors(number);
            return isNotPrime;
        }

        if (number == 2 || number == 3) {
            return isPrime;
        }

        if (number % 2 == 0 || number % 3 == 0) {
            findDivisors(number);
            return isNotPrime;
        }

        for (int i = 5; i <= Math.sqrt(number); i = i + 6) {
            if (number % i == 0 || number % (i + 2) == 0) {
                findDivisors(number);
                return isNotPrime;
            }
        }

        return isPrime;
    }

    private static void findDivisors(int number) {
        List<Integer> primeFactors = new ArrayList<>();
        List<Integer> divisors = new ArrayList<>();
        divisors.add(1);
        int dividend = number;

        for (int i = 2; i <= number; i++) {
            while (dividend % i == 0) {
                primeFactors.add(i);
                dividend /= i;
            }
        }

        for (int prime : primeFactors) {
            List<Integer> newDivisors = new ArrayList<>();
            for (int divisor : divisors) {
                int newDivisor = prime * divisor;

                if (!divisors.contains(newDivisor)) {
                    newDivisors.add(newDivisor);
                }
            }
            divisors.addAll(newDivisors);
        }

        divisors.sort(null);
        System.out.println("Divisores: " + divisors);
    }
}
