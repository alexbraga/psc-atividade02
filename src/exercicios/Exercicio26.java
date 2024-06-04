package exercicios;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Exercicio26 {
    public static void main(String[] args) {
        System.out.println(
                "26. Numa eleição existem três candidatos. Faça um programa que peça o número total de eleitores. " +
                "Peça para cada eleitor votar e ao final mostrar o número de votos de cada candidato.\n"
        );

        Scanner scanner = new Scanner(System.in);
        List<Integer> votes = new ArrayList<>();

        runElectionsProgram(scanner, votes);
        scanner.close();
    }

    private static void runElectionsProgram(Scanner scanner, List<Integer> votes) {
        handleUserInput(scanner, votes);
    }

    private static void handleUserInput(Scanner scanner, List<Integer> votes) {
        System.out.print("Insira o número total de eleitores: ");
        int voters = scanner.nextInt();
        System.out.println();

        for (int i = 0; i < voters; i++) {
            System.out.print("Insira o número do candidato em que deseja votar (1, 2 ou 3): ");
            int vote = scanner.nextInt();

            if (vote != 1 && vote != 2 && vote != 3) {
                System.out.println("Voto inválido");
            } else {
                votes.add(vote);
            }
        }

        countVotes(votes);
    }

    private static void countVotes(List<Integer> votes) {
        int candidate1 = 0;
        int candidate2 = 0;
        int candidate3 = 0;

        for (int vote : votes) {
            if (vote == 1) {
                candidate1++;
            } else if (vote == 2) {
                candidate2++;
            } else {
                candidate3++;
            }
        }

        System.out.print("\nCandidato 1: " + candidate1 + (candidate1 == 1 ? " voto" : " votos"));
        System.out.print("\nCandidato 2: " + candidate2 + (candidate2 == 1 ? " voto" : " votos"));
        System.out.print("\nCandidato 3: " + candidate3 + (candidate3 == 1 ? " voto" : " votos"));
    }
}
