/*
 * Faça um programa para ler dois valores inteiros, e depois mostrar na tela a soma desses números com uma 
mensagem explicativa.
 */

package exercises;

import java.util.Scanner;

public class Exercise02 {

    public static void main(String[]args) {
        
        Scanner scan = new Scanner (System.in);
    
        System.out.printf("Entre com o primeiro número inteiro:");
        int a = scan.nextInt();

        System.out.printf("Entre com o segundo número inteiro:");
        int b = scan.nextInt();

        int soma = a+b;

        System.out.println("Soma = " + soma);
    }
}
