import java.util.*;

public class Main {

    private static int count = 0;

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        recursiveCount(n);

        System.out.print(count);
    }

    private static void recursiveCount(int n) {

        if (n == 1) {
            return;
        }
        count++;

        if (n % 2 == 0) {
            recursiveCount(n / 2);
        } else {
            recursiveCount(n / 3);
        }

        return;
    }
}