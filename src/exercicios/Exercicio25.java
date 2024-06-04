package exercicios;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Exercicio25 {
    public static void main(String[] args) {
        System.out.println(
                "25. Faça um programa que peça para n pessoas a sua idade, ao final o programa deverá verificar se a " +
                "média de idade da turma varia entre 0 e 25, 26 e 60 e maior que 60; e então, dizer se a turma é " +
                "jovem, adulta ou idosa, conforme a média calculada.\n"
        );

        Scanner scanner = new Scanner(System.in);
        List<Integer> numbers = new ArrayList<>();

        runClassAverageAge(scanner, numbers);
        scanner.close();
    }

    private static void runClassAverageAge(Scanner scanner, List<Integer> numbers) {
        handleUserInput(scanner, numbers);
        ageClassification(numbers);
    }

    private static void handleUserInput(Scanner scanner, List<Integer> numbers) {
        int number = 0;

        while (number != -1) {
            System.out.println("Insira uma idade (digite -1 quando quiser finalizar):");
            number = scanner.nextInt();

            if (number != -1) {
                numbers.add(number);
            }
        }
    }

    private static void ageClassification(List<Integer> numbers) {
        double average = calculateAverage(numbers);

        if (average == 0) {
            System.out.println("Não foi possível calcular a média de idade da turma: nenhuma idade foi fornecida");
        } else if (average > 0 && average < 26) {
            System.out.println("A turma é jovem");
        } else if (average >= 26 && average < 60) {
            System.out.println("A turma é adulta");
        } else {
            System.out.println("A turma é idosa");
        }
    }

    private static double calculateAverage(List<Integer> numbers) {
        if (numbers.isEmpty()) {
            return 0;
        }

        int sum = 0;

        for (int number : numbers) {
            sum += number;
        }

        return (double) sum / numbers.size();
    }
}
