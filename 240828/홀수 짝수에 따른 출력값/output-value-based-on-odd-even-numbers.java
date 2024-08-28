import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        System.out.print(printSum(n));
    }

    private static int printSum(int n) {

        if (n == 1 || n == 2) {
            return n;
        }

        return printSum(n - 2) + n;
    }
}