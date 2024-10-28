import java.util.*;

public class Main {

    private static int[] numbers = new int[5];
    private static int sumAll = 0;

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 5; i++) {
            numbers[i] = sc.nextInt();
            sumAll += numbers[i];
        }

        int minResult = Integer.MAX_VALUE;
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                for (int k = 0; k < 5; k++) {
                    if (i == j || i == k || j == k) {
                        continue;
                    }

                    minResult = Math.min(minResult, getDiff(i, j, k));
                }
            }
        }

        System.out.print(minResult != Integer.MAX_VALUE ? minResult : -1);
    }

    private static int getDiff(int i, int j, int k) {
        int sum1 = numbers[i];
        int sum2 = numbers[j] + numbers[k];
        int sum3 = sumAll - sum1 - sum2;
        int[] sums = {sum1, sum2, sum3};
        Arrays.sort(sums);

        if (sum1 == sum2 || sum2 == sum3 || sum3 == sum1) {
            return Integer.MAX_VALUE;
        }

        return sums[2] - sums[0];
    }
}