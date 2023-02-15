import java.util.Scanner;

public class Exercise08 {

    public static int fatorial(int n) {

        if (n == 0) {
            return 1;
        }

        return n * fatorial(n - 1);
    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();

        System.out.println(fatorial(n));

        scan.close();

    }
}
