import java.util.*;

public class Main {

    private static int[] numbers = new int[6];

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 6; i++) {
            numbers[i] = sc.nextInt();
        }

        int minDiff = Integer.MAX_VALUE;
        for (int i = 0; i < 4; i++) {
            for (int j = i + 1; j < 5; j++) {
                for (int k = j + 1; k < 6; k++) {
                    minDiff = Math.min(minDiff, getDiff(i, j, k));
                }
            }
        }

        System.out.print(minDiff);
    }

    private static int getDiff(int i, int j, int k) {
        int sum1 = numbers[i] + numbers[j] + numbers[k];
        int sum2 = 0;
        for (int x = 0; x < numbers.length; x++) {
            sum2 += numbers[x];
        }
        sum2 -= sum1;

        return Math.abs(sum1 - sum2);
    }
}