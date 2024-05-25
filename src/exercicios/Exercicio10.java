package exercicios;

import java.util.Scanner;

public class Exercicio10 {
    public static void main(String[] args) {
        System.out.println(
                "10. Faça um programa que receba dois números inteiros e gere os números inteiros que estão no " +
                "intervalo compreendido por eles.\n");

        Scanner scanner = new Scanner(System.in);
        UserInterface ui = new UserInterface(scanner);

        ui.runNumberRangeProgram();
        scanner.close();
    }

    static class UserInterface {
        private final Scanner scanner;
        private final RangePrinter printer;

        public UserInterface(Scanner scanner) {
            this.scanner = scanner;
            this.printer = new RangePrinter();
        }

        public int readInt() {
            return scanner.nextInt();
        }

        public void runNumberRangeProgram() {
            System.out.println("Insira o primeiro número do intervalo:");
            int first = readInt();
            System.out.println("Insira o segundo número do intervalo:");
            int second = readInt();

            System.out.println("\nNúmeros entre " + first + " e " + second + ":");
            printer.printRange(first, second);
        }

        private static class RangePrinter {
            private void printRange(int first, int second) {
                for (int i = first + 1; i < second; i++) {
                    System.out.println(i);
                }
            }
        }
    }
}