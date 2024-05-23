package exercicios;

public class Exercicio04 {
    public static void main(String[] args) {
        System.out.println(
                "4. Supondo que a população de um país A seja da ordem de 80000 habitantes com uma taxa anual de " +
                "crescimento de 3% e que a população de B seja 200000 habitantes com uma taxa de crescimento de 1.5%." +
                " Faça um programa que calcule e escreva o número de anos necessários para que a população do país A " +
                "ultrapasse ou iguale a população do país B, mantidas as taxas de crescimento.\n");

        calculateYears();
    }

    private static void calculateYears() {
        int countryA = 80000;
        int countryB = 200000;
        int years = 0;

        for (int i = 1; countryA <= countryB; i++) {
            countryA += (int) (countryA * 0.03);
            countryB += (int) (countryB * 0.015);
            years = i;
        }

        System.out.println("Mantendo-se as condições, serão necessários " + years +
                           " anos para que a população do país A ultrapasse ou iguale a população do país B.");
    }
}
