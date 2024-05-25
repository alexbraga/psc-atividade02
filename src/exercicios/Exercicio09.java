package exercicios;

public class Exercicio09 {
    public static void main(String[] args) {
        System.out.println("9. Faça um programa que imprima na tela apenas os números ímpares entre 1 e 50.\n");

        printEvenNumbers();
    }

    private static void printEvenNumbers() {
        for (int i = 1; i < 50; i += 2) {
            System.out.println(i);
        }
    }
}
