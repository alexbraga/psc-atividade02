package exercicios;

import java.util.Scanner;

public class Exercicio23 {
    private static int divisionsCounter = 0;

    public static void main(String[] args) {
        System.out.println(
                "23. Faça um programa que mostre todos os primos entre 1 e N sendo N um número inteiro fornecido pelo" +
                " usuário. O programa deverá mostrar também o número de divisões que ele executou para encontrar os " +
                "números primos. Serão avaliados o funcionamento, o estilo e o número de testes (divisões) executados.\n"
        );

        Scanner scanner = new Scanner(System.in);
        startUI(scanner);
        scanner.close();
    }

    private static void startUI(Scanner scanner) {
        int number = handleUserInput(scanner);
        System.out.println("\nNúmeros primos entre 1 e " + number + ":");
        findPrimeNumbers(number);
    }

    private static int handleUserInput(Scanner scanner) {
        System.out.println("Insira um número inteiro:");
        return scanner.nextInt();
    }

    private static void findPrimeNumbers(int intervalLimit) {
        divisionsCounter = 0;

        StringBuilder primes = new StringBuilder();
        for (int i = 1; i <= intervalLimit; i++) {
            if (isPrimeNumber(i)) {
                primes.append(i).append(", ");
            }
        }
        if (!primes.isEmpty()) {
            // Remove the last comma and space
            primes.setLength(primes.length() - 2);
        }
        System.out.println(primes);
        System.out.println("Number of divisions performed: " + divisionsCounter);
    }

    private static boolean isPrimeNumber(int number) {
        if (number <= 1) {
            return false;
        }

        if (number == 2 || number == 3) {
            return true;
        }

        if (number % 2 == 0 || number % 3 == 0) {
            divisionsCounter += 2;
            return false;
        }

        for (int i = 5; i <= Math.sqrt(number); i = i + 6)
            if (number % i == 0 || number % (i + 2) == 0) {
                divisionsCounter += 2;
                return false;
            }

        return true;
    }
}
