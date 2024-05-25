package exercicios;

import java.util.Scanner;

public class Exercicio12 {
    public static void main(String[] args) {
        System.out.println(
                "12. Desenvolva um gerador de tabuada, capaz de gerar a tabuada de qualquer número inteiro entre 1 a " +
                "10. O usuário deve informar de qual numero ele deseja ver a tabuada.\n");

        Scanner scanner = new Scanner(System.in);
        getMultiplicationTable(scanner);
        scanner.close();
    }

    private static void getMultiplicationTable(Scanner scanner) {
        System.out.println("Insira um número inteiro de 1 a 10 para visualizar sua tabuada:");
        int number = scanner.nextInt();

        System.out.println("\nTabuada de " + number + ":");
        for (int i = 1; i <= 10; i++) {
            int multiplication = number * i;
            System.out.println(number + " X " + i + " = " + multiplication);
        }
    }
}
