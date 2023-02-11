package exercises;

import java.util.Scanner;

public class Exercise05 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o codigo do produto.");
        int codigo = scan.nextInt();

        System.out.println("Digite a quantidade deste item.");
        int quant = scan.nextInt();

        double total;

        switch (codigo) {
            case 1:
                total = 4.00 * quant;
                System.out.printf("Total: R$%.2f", total);
                break;
            case 2:
                total = 4.50 * quant;
                System.out.printf("Total: R$%.2f", total);
                break;
            case 3:
                total = 5.00 * quant;
                System.out.printf("Total: R$%.2f", total);
                break;
            case 4:
                total = 2.00 * quant;
                System.out.printf("Total: R$%.2f", total);
                break;
            case 5:
                total = 1.50 * quant;
                System.out.printf("Total: R$%.2f", total);
                break;
        }

        scan.close();

    }
}
