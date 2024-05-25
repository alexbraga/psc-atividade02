package exercicios;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Exercicio07 {
    public static void main(String[] args) {
        System.out.println("7. Faça um programa que leia 5 números e informe o maior número.\n");

        List<Integer> numbers = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        UserInputHandler inputHandler = new UserInputHandler(scanner, numbers);
        Calculator calculator = new Calculator(numbers);

        inputHandler.readUserInput();
        calculator.calculateMaxNumber();

        scanner.close();
    }

    static class UserInputHandler {
        private final Scanner scanner;
        private final List<Integer> numbers;

        public UserInputHandler(Scanner scanner, List<Integer> numbers) {
            this.scanner = scanner;
            this.numbers = numbers;
        }

        public void readUserInput() {
            System.out.println("Insira o primeiro número:");
            int first = scanner.nextInt();
            numbers.add(first);
            System.out.println("Insira o segundo número:");
            int second = scanner.nextInt();
            numbers.add(second);
            System.out.println("Insira o terceiro número:");
            int third = scanner.nextInt();
            numbers.add(third);
            System.out.println("Insira o quarto número:");
            int fourth = scanner.nextInt();
            numbers.add(fourth);
            System.out.println("Insira o quinto número:");
            int fifth = scanner.nextInt();
            numbers.add(fifth);
        }
    }

    static class Calculator {
        private final List<Integer> numbers;

        public Calculator(List<Integer> numbers) {
            this.numbers = numbers;
        }

        public void calculateMaxNumber() {
            int max = numbers.get(0);

            for (int number : numbers) {
                if (number > max) {
                    max = number;
                }
            }

            System.out.println("\nO maior número é o " + max);
        }
    }
}
