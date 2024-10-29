import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        List<Integer> sumList = new ArrayList<>();

        int maxSum = 0;
        for (int i = x; i <= y; i++) {
            maxSum = Math.max(maxSum, getDigitSum(i));
        }

        System.out.print(maxSum);
    }

    private static int getDigitSum(int n) {

        if (n < 10) {
            return n;
        }

        return getDigitSum(n / 10) + (n % 10);
    }
}