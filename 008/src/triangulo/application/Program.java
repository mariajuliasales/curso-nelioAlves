package triangulo.application;

import java.util.Scanner;

import triangulo.entities.Triangulo;

public class Program {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		Triangulo x = new Triangulo();
		Triangulo y = new Triangulo();

		System.out.println("Digite as medidas do triangulo X:");
		x.a = scan.nextDouble();
		x.b = scan.nextDouble();
		x.c = scan.nextDouble();

		System.out.println("Digite as medidas do triangulo Y:");
		y.a = scan.nextDouble();
		y.b = scan.nextDouble();
		y.c = scan.nextDouble();

		System.out.println("Area triangulo x: " + x.calcularArea());
		System.out.println("Area triangulo y: " + y.calcularArea());

		scan.close();
	}

}
