package exercicios;

import java.util.Scanner;

public class Exercicio17 {
    public static void main(String[] args) {
        System.out.println(
                "17. Faça um programa que calcule o fatorial de um número inteiro fornecido pelo usuário. Ex.: 5!=5.4" +
                ".3.2.1=120\n");

        System.out.println("Qual número inteiro você deseja fatorar?");

        Scanner scanner = new Scanner(System.in);
        calculateFactorial(scanner);
        scanner.close();
    }

    private static void calculateFactorial(Scanner scanner) {
        int number = scanner.nextInt();
        long result = 1;

        System.out.print("\n" + number + "!=");
        for (int i = number; i >= 1; i--) {
            result = result * i;

            if (i == 1) {
                System.out.print(i + "=");
            } else {
                System.out.print(i + ".");
            }
        }

        System.out.print(result);
        System.out.println();
    }
}
