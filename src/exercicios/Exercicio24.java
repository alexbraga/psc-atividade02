package exercicios;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Exercicio24 {
    public static void main(String[] args) {
        System.out.println("24. Faça um programa que calcule o mostre a média aritmética de N notas.\n");

        Scanner scanner = new Scanner(System.in);
        List<Integer> numbers = new ArrayList<>();

        runAverageCalculatorProgram(scanner, numbers);
        scanner.close();
    }

    private static void runAverageCalculatorProgram(Scanner scanner, List<Integer> numbers) {
        handleUserInput(scanner, numbers);
        double result = calculateAverage(numbers);
        System.out.println("\nA média aritmética das notas é igual a " + result);
    }

    private static void handleUserInput(Scanner scanner, List<Integer> numbers) {
        int number = 0;

        while (number != -1) {
            System.out.println("Insira uma nota (digite -1 quando quiser finalizar):");
            number = scanner.nextInt();

            if (number != -1) {
                numbers.add(number);
            }
        }
    }

    private static double calculateAverage(List<Integer> numbers) {
        int sum = 0;

        for (int number : numbers) {
            sum += number;
        }

        return (double) sum / numbers.size();
    }
}
