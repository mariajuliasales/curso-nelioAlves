import java.util.Scanner;

public class Exercise06 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();
        double x1, x2, x3;
        double mediaPonderada;

        for (int i = 0; i < n; i++) {
            x1 = scan.nextDouble();
            x2 = scan.nextDouble();
            x3 = scan.nextDouble();

            mediaPonderada = (x1 * 2 + x2 * 3 + x3 * 5) / (2 + 3 + 5);
            System.out.printf("%.1f\n", mediaPonderada);

        }

        scan.nextInt();

    }
}
