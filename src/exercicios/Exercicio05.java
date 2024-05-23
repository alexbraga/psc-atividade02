package exercicios;

import java.util.Scanner;

public class Exercicio05 {
    public static void main(String[] args) {
        System.out.println(
                "5. Altere o programa anterior permitindo ao usuário informar as populações e as taxas de crescimento " +
                "iniciais. Valide a entrada e permita repetir a operação.\n");

        Scanner scanner = new Scanner(System.in);
        Validator validator = new Validator(scanner);

        int populationA = validator.validatePopulationA();
        double growthRateA = validator.validateGrowthRateA();
        int populationB = validator.validatePopulationB();
        double growthRateB = validator.validateGrowthRateB();

        validator.calculateYears(populationA, growthRateA, populationB, growthRateB);

        scanner.close();
    }

    static class Validator {
        private final Scanner scanner;
        private boolean validInput;

        public Validator(Scanner scanner) {
            this.scanner = scanner;
        }

        public int validatePopulationA() {
            int populationA;

            do {
                System.out.println("Informe a população do país A:");
                populationA = scanner.nextInt();

                if (populationA > 0) {
                    validInput = true;
                } else {
                    System.out.println("A população do país A deve ser maior que 0. Tente novamente.\n");
                    validInput = false;
                }
            } while (!validInput);

            return populationA;
        }

        public double validateGrowthRateA() {
            double growthRateA;

            do {
                System.out.println("Informe a taxa de crescimento do país A (%):");
                growthRateA = scanner.nextDouble() / 100;

                if (growthRateA >= 0) {
                    validInput = true;
                } else {
                    System.out.println("A taxa de crescimento do país A deve ser maior ou igual a 0. Tente novamente.\n");
                    validInput = false;
                }
            } while (!validInput);

            return growthRateA;
        }

        public int validatePopulationB() {
            int populationB;

            do {
                System.out.println("Informe a população do país B: ");
                populationB = scanner.nextInt();

                if (populationB > 0) {
                    validInput = true;
                } else {
                    System.out.println("A população do país B deve ser maior que 0. Tente novamente.\n");
                    validInput = false;
                }
            } while (!validInput);

            return populationB;
        }

        public double validateGrowthRateB() {
            double growthRateB;

            do {
                System.out.println("Informe a taxa de crescimento do país B (%):");
                growthRateB = scanner.nextDouble() / 100;

                if (growthRateB >= 0) {
                    validInput = true;
                } else {
                    System.out.println("A taxa de crescimento do país B deve ser maior ou igual a 0. Tente novamente.\n");
                    validInput = false;
                }
            } while (!validInput);

            return growthRateB;
        }
        public void calculateYears(int populationA, double growthRateA, int populationB, double growthRateB) {
            int years = 0;

            for (int i = 1; populationA <= populationB; i++) {
                populationA += (int) (populationA * growthRateA);
                populationB += (int) (populationB * growthRateB);
                years = i;
            }

            System.out.println(
                    "\nConsiderando uma taxa de crescimento anual de " + (growthRateA * 100) + "% para o país A, e " +
                    (growthRateB * 100) + "% para o país B, serão necessários " + years +
                    " anos para que a população do país A ultrapasse ou iguale a população do país B.");
        }
    }
}
