package exercicios;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exercicio01 {
    public static void main(String[] args) {
        System.out.println(
                "1. Faça um programa que peça uma nota entre zero e dez. Mostre uma mensagem caso o valor seja inválido" +
                " e continue pedindo até que o usuário informe um valor válido.\n");

        Scanner scanner = new Scanner(System.in);
        getValidScore(scanner);
        scanner.close();
    }

    private static void getValidScore(Scanner scanner) {
        int score;
        boolean validInput = false;

        do {
            System.out.println("Insira uma nota entre 0 (zero) e 10 (dez):");

            try {
                score = scanner.nextInt();

                if (score >= 0 && score <= 10) {
                    validInput = true;
                } else {
                    System.out.println("\nNúmero inválido. Tente novamente.\n");
                }
            } catch (InputMismatchException e) {
                System.out.println("\nEntrada inválida. Tente novamente.\n");
                scanner.next();
            }
        } while (!validInput);
    }
}
