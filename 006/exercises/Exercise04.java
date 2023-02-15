import java.util.Scanner;

public class Exercise04 {

    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);

        System.out.println("Insera um valor inteiro entre 1 e 1000.");
        int x = scan.nextInt();

        for(int i=1; i<=x; i=i+2){
            System.out.println(i);
        }

        scan.close();

    }
}