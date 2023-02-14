import java.util.Scanner;

public class Exercise03 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Digite a sua preferencia");
        System.out.println("1 - Alcool");
        System.out.println("2 - Gasolina");
        System.out.println("3 - Diesel");
        System.out.println("4 - Fim");
		
		int alcool = 0;
		int gasolina = 0;
		int diesel = 0;
		
		int opc = scan.nextInt();
		
		while (opc != 4) {
			if (opc == 1) {
				alcool = alcool + 1;
			}
			else if (opc == 2) {
				gasolina = gasolina + 1;
			}
			else if (opc == 3) {
				diesel = diesel + 1;
			}
			
			opc = scan.nextInt();
		}

		System.out.println("MUITO OBRIGADO");
		System.out.println("Alcool: " + alcool);
		System.out.println("Gasolina: " + gasolina);
		System.out.println("Diesel: " + diesel);
		
		scan.close();

    }
    
}
