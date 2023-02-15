import java.util.Scanner;

public class Exercise07 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();

        for (int i = 0; i < n; i++) {
            double x = scan.nextInt();
            double y = scan.nextInt();

            if (y == 0) {
                System.out.println("Divisao impossivel");
            } else {
                System.out.println(x / y);
            }
        }

        scan.close();

    }

}
