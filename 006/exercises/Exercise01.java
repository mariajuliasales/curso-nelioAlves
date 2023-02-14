import java.util.Scanner;

/*
 * Escreva um programa que repita a leitura de uma senha até que ela seja válida. Para cada leitura de senha 
incorreta informada, escrever a mensagem "Senha Invalida". Quando a senha for informada corretamente deve ser 
impressa a mensagem "Acesso Permitido" e o algoritmo encerrado. Considere que a senha correta é o valor 2002.
 */

public class Exercise01 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Digite a sua senha:");
        String senha = scan.next();

        while (!senha.equals("2002")) {
            System.out.println("Senha incorreta. Digite novamente.");
            senha = scan.next();
        }

        System.out.println("Acesso permitido.");

        scan.close();

    }
}
