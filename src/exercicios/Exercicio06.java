package exercicios;

public class Exercicio06 {
    public static void main(String[] args) {
        System.out.println(
                "6. Faça um programa que imprima na tela os números de 1 a 20, um abaixo do outro. Depois modifique o" +
                " programa para que ele mostre os números um ao lado do outro.\n");

        printNumbers();
    }

    private static void printNumbers() {
        for (int i = 1; i <= 20; i++) {
            System.out.println(i);
        }

        System.out.println();

        for (int i = 1; i <= 20; i++) {
            System.out.print(i + " ");
        }
    }
}
