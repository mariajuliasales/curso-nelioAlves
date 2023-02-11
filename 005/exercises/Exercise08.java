package exercises;

import java.util.Scanner;

public class Exercise08 {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner (System.in);

        System.out.printf("Insira o salario:");
        double salario = scan.nextDouble();

        double imposto;


        if (salario>=0 && salario<=2000.00){
            System.out.println("Isento.");
        } else if(salario<3000.00){
            imposto = salario * 8 / 100;
            System.out.printf("O imposto é de R$.2f", imposto);
        } else if (salario<4500.00){
            imposto = 1000* 8 / 100;
            imposto = imposto + (salario - 3000) * 18 / 100;
            System.out.printf("O imposto é de R$.2f", imposto);
        } else {
            imposto = 1000* 8 / 100;
            imposto = imposto + 1500 * 18 / 100;
            imposto = imposto + (salario - 4500) * 28 / 100;
            System.out.printf("O imposto é de R$.2f", imposto);
        }

        scan.close();
    }
}
