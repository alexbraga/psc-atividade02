package exercicios;

import java.util.Scanner;

public class Exercicio03 {
    public static void main(String[] args) {
        System.out.println("3. Faça um programa que leia e valide as seguintes informações:\n" +
                           "\n\ta) Nome: maior que 3 caracteres;" +
                           "\n\tb) Idade: entre 0 e 150;" +
                           "\n\tc) Salário: maior que zero;" +
                           "\n\td) Sexo: 'f' ou 'm';" +
                           "\n\te) Estado Civil: 's', 'c', 'v', 'd';\n");

        Scanner scanner = new Scanner(System.in);
        Validator validator = new Validator(scanner);

        validator.validateName();
        validator.validateAge();
        validator.validateSalary();
        validator.validateGender();
        validator.validateStatus();

        scanner.close();
    }

    static class Validator {
        private final Scanner scanner;
        private boolean validInput;
        private final String retry = "Resposta inválida. Tente novamente\n";

        public Validator(Scanner scanner) {
            this.scanner = scanner;
        }

        public void validateName() {
            String name;

            do {
                System.out.println("Nome (maior que 3 caracteres):");
                name = scanner.nextLine();

                if (name.length() > 3) {
                    validInput = true;
                } else {
                    System.out.println(retry);
                    validInput = false;
                }
            } while (!validInput);
        }

        public void validateAge() {
            int age;

            do {
                System.out.println("Idade (0-150):");
                age = scanner.nextInt();

                if (age > 0 && age < 150) {
                    validInput = true;
                } else {
                    System.out.println(retry);
                    validInput = false;
                }
            } while (!validInput);
        }

        public void validateSalary() {
            double salary;

            do {
                System.out.println("Salário (insira um valor maior que 0.00):");
                System.out.print("R$ ");
                salary = scanner.nextDouble();

                if (salary > 0) {
                    validInput = true;
                } else {
                    System.out.println(retry);
                    validInput = false;
                }
            } while (!validInput);
        }

        public void validateGender() {
            char gender;

            do {
                System.out.println("Sexo (f/m):");
                gender = scanner.next().charAt(0);

                if (gender == 'f' || gender == 'm') {
                    validInput = true;
                } else {
                    System.out.println(retry);
                    validInput = false;
                }
            } while (!validInput);
        }

        public void validateStatus() {
            char status;

            do {
                System.out.println("Estado civil (s/c/v/d):");
                status = scanner.next().charAt(0);

                if (status == 's' || status == 'c' || status == 'v' || status == 'd') {
                    validInput = true;
                } else {
                    System.out.println(retry);
                    validInput = false;
                }
            } while (!validInput);
        }
    }
}
