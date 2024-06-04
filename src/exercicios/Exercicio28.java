package exercicios;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Exercicio28 {
    public static void main(String[] args) {
        System.out.println(
                "28. Faça um programa que calcule o valor total investido por um colecionador em sua coleção de CDs e" +
                " o valor médio gasto em cada um deles. O usuário deverá informar a quantidade de CDs e o valor para cada um.\n"
        );

        Scanner scanner = new Scanner(System.in);
        List<Double> cdCollection = new ArrayList<>();

        runCDCollectionProgram(scanner, cdCollection);
        scanner.close();
    }

    private static void runCDCollectionProgram(Scanner scanner, List<Double> cdCollection) {
        handleUserInput(scanner, cdCollection);
        double collectionValue = calculateCollectionValue(cdCollection);
        double avgPrice = calculateAverageCDPrice(cdCollection);

        System.out.println("\nO valor total investido na coleção é de R$ " + collectionValue);
        System.out.println("O preço médio de cada CD é de R$ " + avgPrice);
    }

    private static void handleUserInput(Scanner scanner, List<Double> cdCollection) {
        System.out.print("Informe a quantidade de CDs da coleção: ");
        int numberOfCDs = scanner.nextInt();
        int i = 1;

        while (i <= numberOfCDs) {
            System.out.print("Insira o preço do " + i + "º CD: ");
            double cdPrice = scanner.nextDouble();

            if (cdPrice < 0) {
                System.out.println("O preço de um CD não pode ser menor que R$ 0.00. Tente novamente");
                continue;
            } else {
                cdCollection.add(cdPrice);
            }

            i++;
        }
    }

    private static double calculateAverageCDPrice(List<Double> cdCollection) {
        double collectionTotalPrice = calculateCollectionValue(cdCollection);
        return collectionTotalPrice / cdCollection.size();
    }

    private static double calculateCollectionValue(List<Double> cdCollection) {
        double sum = 0;

        for (double cd : cdCollection) {
            sum += cd;
        }

        return sum;
    }
}
