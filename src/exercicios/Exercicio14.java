package exercicios;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Exercicio14 {
    public static void main(String[] args) {
        System.out.println(
                "14. Faça um programa que peça 10 números inteiros, calcule e mostre a quantidade de números pares e " +
                "a quantidade de números impares.\n");

        Scanner scanner = new Scanner(System.in);
        UserInterface ui = new UserInterface(scanner);

        ui.runOddEvenProgram();
        scanner.close();
    }

    static class UserInterface {
        private final NumberReader numberReader;
        private final OddEvenCalculator calculator;

        public UserInterface(Scanner scanner) {
            this.numberReader = new NumberReader(scanner);
            this.calculator = new OddEvenCalculator();
        }

        public void runOddEvenProgram() {
            List<Integer> numbers = numberReader.readNumbers();
            calculator.countOddAndEven(numbers);
        }
    }

    static class NumberReader {
        private final Scanner scanner;

        public NumberReader(Scanner scanner) {
            this.scanner = scanner;
        }

        public List<Integer> readNumbers() {
            List<Integer> numbers = new ArrayList<>();
            for (int i = 1; i <= 10; i++) {
                System.out.println("Insira o " + i + "º número:");
                int number = scanner.nextInt();
                numbers.add(number);
            }
            return numbers;
        }
    }

    static class OddEvenCalculator {
        public void countOddAndEven(List<Integer> numbers) {
            int odd = 0;
            int even = 0;

            for (int number : numbers) {
                if ((number % 2 == 0)) {
                    even++;
                } else {
                    odd++;
                }
            }

            System.out.println("\nTotal de números pares: " + even);
            System.out.println("Total de números ímpares: " + odd);
        }
    }
}