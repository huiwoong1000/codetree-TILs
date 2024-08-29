import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        System.out.print(sol(n));
    }

    private static int sol(int n) {

        if (n == 1 || n == 2) {
            return n;
        }

        return sol(n / 3) + sol(n - 1);
    }
}