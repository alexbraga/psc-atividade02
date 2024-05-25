package exercicios;

import java.util.Scanner;

public class Exercicio11 {
    public static void main(String[] args) {
        System.out.println("11. Altere o programa anterior para mostrar no final a soma dos números.\n");

        Scanner scanner = new Scanner(System.in);
        UserInterface ui = new UserInterface(scanner);

        ui.runNumberRangeProgram();
        scanner.close();
    }

    static class UserInterface {
        private final Scanner scanner;
        private final RangeCalculator calculator;

        public UserInterface(Scanner scanner) {
            this.scanner = scanner;
            this.calculator = new RangeCalculator();
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
            calculator.printRangeAndSum(first, second);
        }

        static class RangeCalculator {
            private void printRangeAndSum(int first, int second) {
                int sum = 0;
                for (int i = first + 1; i < second; i++) {
                    System.out.println(i);
                    sum += i;
                }

                System.out.println("\nA soma dos números contidos no intervalo é igual a " + sum);
            }
        }
    }
}
