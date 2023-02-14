/*
 * Escreva um programa para ler as coordenadas (X,Y) de uma quantidade indeterminada de pontos no sistema 
cartesiano. Para cada ponto escrever o quadrante a que ele pertence. O algoritmo será encerrado quando pelo 
menos uma de duas coordenadas for NULA (nesta situação sem escrever mensagem alguma).
 */

import java.util.Scanner;

public class Exercise02 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        double valorX, valorY;

        do {
            System.out.printf("Insira a coordenada de X: ");
            valorX = scan.nextDouble();
            System.out.printf("Insira a coordenada de Y: ");
            valorY = scan.nextDouble();

            if (valorX > 0 && valorY > 0) {
                System.out.println("Q1");
            } else if (valorX < 0 && valorY > 0) {
                System.out.println("Q2");
            } else if (valorX < 0 && valorY < 0) {
                System.out.println("Q3");
            } else if (valorX > 0 && valorY < 0) {
                System.out.println("Q4");
            }

        } while (!(valorX == 0 || valorY == 0));

        scan.close();
    }

}
