package exercicios;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Exercicio19 {
    public static void main(String[] args) {
        System.out.println("19. Altere o programa anterior para que ele aceite apenas números entre 0 e 1000.\n");

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
                    "Digite os valores desejados entre 0 e 1000. Quando estiver satisfeito, mantenha o valor em branco e " +
                    "pressione 'Enter' para finalizar a operação\n");

            while (true) {
                System.out.print("Insira um número inteiro: ");
                String input = scanner.nextLine();

                if (input.isEmpty()) {
                    System.out.println("Finalizando a operação...\n");
                    break;
                }

                int number = Integer.parseInt(input);
                if (number < 0 || number > 1000) {
                    System.out.println("Número inválido. Os valores aceitos vão de 0 a 1000. Tente novamente");
                    continue;
                }

                numbers.add(number);
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