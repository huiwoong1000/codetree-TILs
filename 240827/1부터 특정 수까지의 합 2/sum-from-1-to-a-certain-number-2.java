import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        System.out.print(recursiveSum(n));
    }

    private static int recursiveSum(int n) {

        if (n == 1) {
            return n;
        }

        return recursiveSum(n - 1) + n;
    }
}