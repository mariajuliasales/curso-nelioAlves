/*
 * Fazer um programa para ler um número inteiro e dizer se este número é par ou ímpar
 */

package exercises;

import java.util.Scanner;

public class Exercise02 {
    
    public static void main(String[]args) {

        Scanner scan = new Scanner(System.in);
        
        System.out.println("Digite um número inteiro: ");
        int x = scan.nextInt();

        if(x%2==0){
            System.out.println("O número " + x + " é par");
        } else {
            System.out.println("O número " + x + " é impar");
        }

        scan.close();
    }
}
