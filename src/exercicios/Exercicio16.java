package exercicios;

public class Exercicio16 {
    public static void main(String[] args) {
        System.out.println(
                "16. A série de Fibonacci é formada pela seqüência 0,1,1,2,3,5,8,13,21,34,55,... Faça um programa que" +
                " gere a série até que o valor seja maior que 500.\n");

        fibonacciGenerator();
    }

    public static void fibonacciGenerator() {
        int firstNumber = 0;
        int secondNumber = 1;
        int nextNumber;

        System.out.println("Série de Fibonacci:");

        while (true) {
            if (firstNumber > 0) {
                System.out.print(", ");
            }

            if (firstNumber > 500) {
                System.out.print(firstNumber);
                break;
            }

            System.out.print(firstNumber);

            nextNumber = firstNumber + secondNumber;
            firstNumber = secondNumber;
            secondNumber = nextNumber;

        }
    }
}
