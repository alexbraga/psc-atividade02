package exercicios;

import java.util.Scanner;

public class Exercicio20 {
    public static void main(String[] args) {
        System.out.println(
                "20. Altere o programa de cálculo do fatorial, permitindo ao usuário calcular o fatorial várias vezes" +
                " e limitando o fatorial a números inteiros positivos e menores que 16.\n");

        Scanner scanner = new Scanner(System.in);
        runFactorialProgram(scanner);
        scanner.close();
    }

    private static void runFactorialProgram(Scanner scanner) {
        Integer number;

        while (true) {
            number = readNumber(scanner);

            if (number == null) {
                break;
            }

            if (number <= 0 || number >= 16) {
                System.out.println(
                        "\nNúmero inválido. São aceitos somente números inteiros positivos e menores que 16. Tente " +
                        "novamente.");
                System.out.println("Para encerrar, pressione 'Enter' sem inserir qualquer valor.");

                continue;
            }

            calculateAndPrintFactorial(number);
        }
    }

    private static Integer readNumber(Scanner scanner) {
        System.out.println("Qual número inteiro você deseja fatorar?");
        String input = scanner.nextLine();

        if (input.isEmpty()) {
            System.out.println("Finalizando a operação...\n");
            return null;
        }

        return Integer.parseInt(input);
    }

    private static void calculateAndPrintFactorial(int number) {
        long result = 1;
        System.out.print(number + "!=");
        for (int i = number; i >= 1; i--) {
            result = result * i;

            if (i == 1) {
                System.out.print(i + "=");
            } else {
                System.out.print(i + ".");
            }
        }
        System.out.print(result);
        System.out.println("\n");
        System.out.println("Para encerrar, pressione 'Enter' sem inserir qualquer valor.");
    }
}