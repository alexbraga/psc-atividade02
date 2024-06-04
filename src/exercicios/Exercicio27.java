package exercicios;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Exercicio27 {
    public static void main(String[] args) {
        System.out.println(
                "27. Faça um programa que calcule o número médio de alunos por turma. Para isto, peça a quantidade de" +
                " turmas e a quantidade de alunos para cada turma. As turmas não podem ter mais de 40 alunos.\n"
        );

        Scanner scanner = new Scanner(System.in);
        List<Integer> studentsPerClass = new ArrayList<>();

        runAvgStudentsPerClass(scanner, studentsPerClass);
        scanner.close();
    }

    private static void runAvgStudentsPerClass(Scanner scanner, List<Integer> studentsPerClass) {
        double result = handleUserInput(scanner, studentsPerClass);
        System.out.println("\nCada turma possui em média " + result + " alunos");
    }

    private static double handleUserInput(Scanner scanner, List<Integer> studentsPerClass) {
        System.out.print("Insira a quantidade de turmas: ");
        int numberOfClasses = scanner.nextInt();
        int i = 1;

        while (i <= numberOfClasses) {
            System.out.print("Insira o número de alunos da turma " + i + ": ");
            int numberOfStudents = scanner.nextInt();

            if (numberOfStudents > 40) {
                System.out.println("O número máximo de alunos permitidos por turma é 40. Tente novamente");
                continue;
            } else {
                studentsPerClass.add(numberOfStudents);
            }

            i++;
        }

        return calculateAvgNumberOfStudents(studentsPerClass, numberOfClasses);
    }

    private static double calculateAvgNumberOfStudents(List<Integer> studentsPerClass, int classes) {
        if (studentsPerClass.isEmpty()) {
            return 0;
        }

        int sum = 0;

        for (int students : studentsPerClass) {
            sum += students;
        }

        return (double) sum / classes;
    }
}
