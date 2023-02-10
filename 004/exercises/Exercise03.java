/*
 * Faça um programa para ler o valor do raio de um círculo, e depois mostrar o valor da área deste círculo com quatro 
casas decimais conforme exemplos.
Fórmula da área: area = π . raio2
Considere o valor de π = 3.14159
 */

package exercises;

import java.util.Scanner;

public class Exercise03 {
    public static void main(String[]args) {
        
        Scanner scan = new Scanner (System.in);
    
        double constantePi = 3.14159;

        System.out.printf("Entre com o valor do raio do circulo: ");
        double r = scan.nextDouble();

        double valorArea = constantePi * Math.pow(r,2);

        System.out.printf("A area do circulo é: %.4f", valorArea);

    }
}
