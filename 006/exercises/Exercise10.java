import java.util.Scanner;

public class Exercise10 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();

        for (int i = 1; i <= n; i++) {
            System.out.println(i + " " + Math.pow(i, 2) + " " + Math.pow(i, 3));
        }

        scan.close();
    }

}
