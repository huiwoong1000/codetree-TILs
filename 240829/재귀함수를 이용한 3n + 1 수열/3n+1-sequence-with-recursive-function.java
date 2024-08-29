import java.util.*;

public class Main {

    private static int count = 0;

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        System.out.print(getCount(n));
    }


    private static int getCount(int n) {

        if (n == 1) {
            return count;
        }

        count++;

        if (n % 2 == 0) {
            return getCount(n / 2);
        } else {
            return getCount(n * 3 + 1);
        }
    }
}