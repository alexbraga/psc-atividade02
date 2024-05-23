package exercicios;

import java.util.Scanner;

public class Exercicio02 {
    public static void main(String[] args) {
        System.out.println(
                "2. Faça um programa que leia um nome de usuário e a sua senha e não aceite a senha igual ao nome do " +
                "usuário, mostrando uma mensagem de erro e voltando a pedir as informações.\n");

        Scanner scanner = new Scanner(System.in);
        getCredentials(scanner);
        scanner.close();
    }

    private static void getCredentials(Scanner scanner) {
        boolean validInput = false;

        do {
            System.out.println("Nome de usuário:");
            String name = scanner.nextLine();

            System.out.println("Senha:");
            String password = scanner.nextLine();

            if (!name.equals(password)) {
                validInput = true;
            } else {
                System.out.println("\nA senha não pode ser igual ao nome de usuário. Tente novamente\n");
            }

        } while (!validInput);
    }
}
