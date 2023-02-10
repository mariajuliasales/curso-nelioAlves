/*
 * Fazer um programa que leia o número de um funcionário, seu número de horas trabalhadas, o valor que recebe por 
hora e calcula o salário desse funcionário. A seguir, mostre o número e o salário do funcionário, com duas casas 
decimais.
 */

package exercises;

import java.util.Locale;
import java.util.Scanner;

public class Exercise05 {
    public static void main(String[]args) {

        Locale.setDefault(Locale.US);

        Scanner scan = new Scanner (System.in);
    
        System.out.printf("Entre com o numero do funcionario: ");
        int num = scan.nextInt();

        System.out.printf("Entre com o número de horas trabalhadas: ");
        int numTrab = scan.nextInt();
    
        System.out.printf("Entre com o valor por hora: ");
        double valorHora = scan.nextDouble();

        double calcSalario = numTrab * valorHora;

        System.out.println("Numero do funcionario: " + num);
        System.out.printf("Salario do funcionario: R$%.2f", calcSalario);
    }
}
