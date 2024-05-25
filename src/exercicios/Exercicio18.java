package exercicios;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Exercicio18 {
    public static void main(String[] args) {
        System.out.println(
                "18. Faça um programa que, dado um conjunto de N números, determine o menor valor, o maior valor e a " +
                "soma dos valores.\n");

        Scanner scanner = new Scanner(System.in);
        UserInterface ui = new UserInterface(scanner);

        ui.runMinMaxSumProgram();
        scanner.close();
    }

    static class UserInterface {
        private final NumberReader numberReader;
        private final MinMaxSumCalculator calculator;

        public UserInterface(Scanner scanner) {
            this.numberReader = new NumberReader(scanner);
            this.calculator = new MinMaxSumCalculator();
        }

        public void runMinMaxSumProgram() {
            List<Integer> numbers = numberReader.readNumbers();
            calculator.calculateMinMaxSum(numbers);
        }
    }

    static class NumberReader {
        private final Scanner scanner;

        public NumberReader(Scanner scanner) {
            this.scanner = scanner;
        }

        public List<Integer> readNumbers() {
            List<Integer> numbers = new ArrayList<>();
            System.out.println(
                    "Digite os valores desejados. Quando estiver satisfeito, mantenha o valor em branco e pressione 'Enter' " +
                    "para finalizar a operação\n");

            while (true) {
                System.out.print("Insira um número inteiro: ");
                String input = scanner.nextLine();

                if (input.isEmpty()) {
                    System.out.println("Finalizando a operação...\n");
                    break;
                }

                numbers.add(Integer.parseInt(input));
            }
            return numbers;
        }
    }

    static class MinMaxSumCalculator {
        public void calculateMinMaxSum(List<Integer> numbers) {
            int max = Integer.MIN_VALUE;
            int min = Integer.MAX_VALUE;
            int sum = 0;

            for (int number : numbers) {
                if (number > max) {
                    max = number;
                }

                if (number < min) {
                    min = number;
                }

                sum += number;
            }

            System.out.println("Maior valor: " + max);
            System.out.println("Menor valor: " + min);
            System.out.println("Soma dos elementos: " + sum);
        }
    }
}