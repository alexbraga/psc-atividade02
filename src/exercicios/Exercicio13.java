package exercicios;

import java.util.Scanner;

public class Exercicio13 {
    public static void main(String[] args) {
        System.out.println(
                "13. Faça um programa que peça dois números, base e expoente, calcule e mostre o primeiro número " +
                "elevado ao segundo número. Não utilize a função de potência da linguagem.\n");

        Scanner scanner = new Scanner(System.in);
        UserInterface ui = new UserInterface(scanner);

        ui.runPowProgram();
        scanner.close();
    }

    static class UserInterface {
        private final Scanner scanner;
        private final Calculator calculator;

        public UserInterface(Scanner scanner) {
            this.scanner = scanner;
            this.calculator = new Calculator();
        }

        public int readInt() {
            return scanner.nextInt();
        }

        public void runPowProgram() {
            System.out.println("Digite o número que será a base:");
            int base = readInt();
            System.out.println("Digite o número que será o expoente:");
            int exponent = readInt();

            System.out.println("\nO resultado da exponenciação de " + base + " elevado a " + exponent + " é igual a " +
                               calculator.calculatePow(base, exponent));
        }

        static class Calculator {
            private int calculatePow(int base, int exponent) {
                int result = 1;
                for (int i = 0; i < exponent; i++) {
                    result *= base;
                }

                return result;
            }
        }
    }
}
