/*
 * Leia 2 valores inteiros (A e B). Após, o programa deve mostrar uma mensagem "Sao Multiplos" ou "Nao sao 
Multiplos", indicando se os valores lidos são múltiplos entre si. Atenção: os números devem poder ser digitados em 
ordem crescente ou decrescente
 */

package exercises;

import java.util.Scanner;

public class Exercise03 {
    public static void main(String[]args) {
        
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o primeiro número inteiro");
        int a = scan.nextInt();
        System.out.println("Digite o segundo número inteiro");
        int b = scan.nextInt();

        if(a%b == 0 || b%a==0){
            System.out.println("Os números " + a + " e " + b + " são multiplos.");
        } else {
            System.out.println("Os números " + a + " e " + b + " não são multiplos.");
        }

        scan.close();
    }
}
