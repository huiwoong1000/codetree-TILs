import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt() * sc.nextInt() * sc.nextInt();

        System.out.print(calc(n));
    }

    private static int calc(int n) {
        if (n < 10) {
            return n;
        }

        return calc(n / 10) + n % 10;
    }
}