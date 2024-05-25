package exercicios;

import java.util.Scanner;

public class Exercicio15 {
    public static void main(String[] args) {
        System.out.println(
                "15. A série de Fibonacci é formada pela seqüência 1,1,2,3,5,8,13,21,34,55,... Faça um programa capaz" +
                " de gerar a série até o n−ésimo termo.\n");

        Scanner scanner = new Scanner(System.in);
        UserInterface ui = new UserInterface(scanner);

        ui.runFibonacciProgram();
        scanner.close();
    }

    static class UserInterface {
        private final Scanner scanner;
        private final FibonacciGenerator generator;

        public UserInterface(Scanner scanner) {
            this.scanner = scanner;
            this.generator = new FibonacciGenerator();
        }

        public void runFibonacciProgram() {
            System.out.println("Insira o número de elementos que você deseja gerar:");
            int sequenceSize = scanner.nextInt();

            generator.generate(sequenceSize);
        }
    }

    static class FibonacciGenerator {
        public void generate(int sequenceSize) {
            int firstNumber = 0;
            int secondNumber = 1;

            System.out.println("\nSérie de Fibonacci:");

            for (int i = 0; i < sequenceSize; i++) {
                if (i > 0) {
                    System.out.print(", ");
                }

                System.out.print(firstNumber);

                int nextNumber = firstNumber + secondNumber;
                firstNumber = secondNumber;
                secondNumber = nextNumber;
            }
        }
    }
}