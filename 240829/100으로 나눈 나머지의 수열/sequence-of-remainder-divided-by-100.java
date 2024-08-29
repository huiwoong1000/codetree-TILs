import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        System.out.print(sol(n));
    }

    private static int sol(int n) {

        if (n == 1) {
            return 2;
        }
        if (n == 2) {
            return 4;
        }

        return (sol(n - 2) * sol(n - 1) % 100);
    }
}