package exercicios;

import java.util.Scanner;

public class Exercicio21 {
    public static void main(String[] args) {
        System.out.println(
                "21. Faça um programa que peça um número inteiro e determine se ele é ou não um número primo. Um " +
                "número primo é aquele que é divisível somente por ele mesmo e por 1.\n");

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
            return isNotPrime;
        }

        if (number == 2 || number == 3) {
            return isPrime;
        }

        if (number % 2 == 0 || number % 3 == 0) {
            return isNotPrime;
        }

        for (int i = 5; i <= Math.sqrt(number); i = i + 6)
            if (number % i == 0 || number % (i + 2) == 0) {
                return isNotPrime;
            }

        return isPrime;
    }
}
