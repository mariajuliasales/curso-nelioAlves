package exercises;

import java.util.Scanner;

public class Exercise07 {
    
    public static void main(String[] args) {
        
        Scanner scan = new Scanner (System.in);

        System.out.printf("Insira o primeiro valor:");
        double valorX = scan.nextDouble();
        System.out.printf("Insira o segundo valor:");
        double valorY = scan.nextDouble();

        if(valorX==0 && valorY==0){
            System.out.println("Origem.");
        } else if (valorX==0){
            System.out.println("Eixo X");
        } else if (valorY==0){
            System.out.println("Eixo Y");
        } else if (valorX>0 && valorY>0){
            System.out.println("Q1");
        } else if (valorX<0 && valorY>0){
            System.out.println("Q2");
        } else if (valorX<0 && valorY<0){
            System.out.println("Q3");
        } else {
            System.out.println("Q4");
        }
        
        scan.close();

    }

}
