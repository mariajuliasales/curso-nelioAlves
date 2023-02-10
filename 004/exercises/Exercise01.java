package exercises;

import java.util.Locale;

public class Exercise01 {
    public static void main(String[]args) {

        String product01 = "Computer";
        String product02 = "Office desk";

        int age = 30;
        int code = 5290;
        
        char gender = 'F';

        double price01 = 2100.0;
        double price02 = 650.50;
        double measure = 53.234567;

        System.out.println("Products:");
        System.out.println(product01 + ", which price is R$" + price01);
        System.out.println(product02 + ", which price is R$" + price02);

        System.out.println();

        System.out.println("Record: " + age + " years old, code " + code + " and gender: " + gender);

        System.out.println();

        System.out.println("Measue with eight decimal places: " + measure);
        System.out.printf("Rouded (three decimal plates): %.3f\n", measure);
        Locale.setDefault(Locale.US);
        System.out.printf("US decimal point: %.3f", measure);
    }
}