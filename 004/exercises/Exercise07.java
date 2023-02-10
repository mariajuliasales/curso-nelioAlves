/*
 * Fazer um programa que leia três valores com ponto flutuante de dupla precisão: A, B e C. Em seguida, calcule e 
mostre: 
a) a área do triângulo retângulo que tem A por base e C por altura. 
b) a área do círculo de raio C. (pi = 3.14159) 
c) a área do trapézio que tem A e B por bases e C por altura. 
d) a área do quadrado que tem lado B. 
e) a área do retângulo que tem lados A e B.
 */

package exercises;

import java.util.Locale;
import java.util.Scanner;

public class Exercise07 {
    public static void main(String[]args) {

        Locale.setDefault(Locale.US);

        Scanner scan = new Scanner (System.in);

        double constPi = 3.14159;
        
        System.out.printf("Entre com o primeiro número: ");
        double a = scan.nextDouble();

        System.out.printf("Entre com o segundo número: ");
        double b = scan.nextDouble();
    
        System.out.printf("Entre com o terceiro número: ");
        double c = scan.nextDouble();

        double areaTriangulo = a*c/2;
        
        double areaCirculo = constPi * Math.pow(c,2);

        double areaTrapezio=(a+b)*c/2;

        double areaQuadrado =  Math.pow(b,2);

        double areaRetangulo = a*b;

        System.out.printf("Area do triangulo: %.3f\n", areaTriangulo);
        System.out.printf("Area do circulo: %.3f\n", areaCirculo);
        System.out.printf("Area do trapezio: %.3f\n", areaTrapezio);
        System.out.printf("Area do quadrado: %.3f\n", areaQuadrado);
        System.out.printf("Area do retangulo: %.3f\n", areaRetangulo);

    }
}
