/*
 * Fazer um programa para ler o código de uma peça 1, o número de peças 1, o valor unitário de cada peça 1, o 
código de uma peça 2, o número de peças 2 e o valor unitário de cada peça 2. Calcule e mostre o valor a ser pago.
 */

package exercises;

import java.util.Locale;
import java.util.Scanner;

public class Exercise06 {
    public static void main(String[]args) {
        
        Locale.setDefault(Locale.US);

        Scanner scan = new Scanner (System.in);
    
        System.out.printf("Entre com o codigo da peça 01: ");
        int codigo01 = scan.nextInt();

        System.out.printf("Entre com a quantidade de pecas 01: ");
        int quant01 = scan.nextInt();
    
        System.out.printf("Entre com o valor da peca 01: ");
        double valorPeca01 = scan.nextDouble();

        System.out.printf("Entre com o codigo da peça 02: ");
        int codigo02 = scan.nextInt();

        System.out.printf("Entre com a quantidade de pecas 02: ");
        int quant02 = scan.nextInt();
    
        System.out.printf("Entre com o valor da peca 02: ");
        double valorPeca02 = scan.nextDouble();

        double valorPagar = (quant01*valorPeca01)+ (quant02*valorPeca02);

        System.out.printf("Valor a pagar: R$%.2f", valorPagar);
    }
}
