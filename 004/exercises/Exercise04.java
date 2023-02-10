/*
 * Fazer um programa para ler quatro valores inteiros A, B, C e D. A seguir, calcule e mostre a diferença do produto 
de A e B pelo produto de C e D segundo a fórmula: DIFERENCA = (A * B - C * D).
 */

package exercises;

import java.util.Scanner;

public class Exercise04 {
    
    public static void main(String[]args) {
        
        Scanner scan = new Scanner (System.in);
    
        System.out.printf("Entre com o primeiro número inteiro:");
        int a = scan.nextInt();

        System.out.printf("Entre com o segundo número inteiro:");
        int b = scan.nextInt();
    
        System.out.printf("Entre com o terceiro número inteiro:");
        int c = scan.nextInt();

        System.out.printf("Entre com o quarto número inteiro:");
        int d = scan.nextInt();

        int diferencaProduto = a*b - c*d;

        System.out.println("Diferença: " + diferencaProduto);
    }
}
