import java.util.*;

public class Main {

    private static int[] numbers;

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        numbers = new int[6];
        for (int i = 0; i < 6; i++) {
            numbers[i] = sc.nextInt();
        }

        int minResult = Integer.MAX_VALUE;
        for (int i1 = 0; i1 <= 5; i1++) {
            for (int i2 = 0; i2 <= 5; i2++) {
                for (int j1 = 0; j1 <= 5; j1++) {
                    for (int j2 = 0; j2 <= 5; j2++) {
                        if (i1 == i2 || i1 == j1 || i1 == j2 || i2 == j1 || i2 == j2 || j1 == j2) {
                            continue;
                        }

                        minResult = Math.min(minResult, getDiff(i1, i2, j1, j2));
                    }
                }
            }
        }

        System.out.print(minResult);

    }

    private static int getDiff(int i1, int i2, int j1, int j2) {
        int sum1 = numbers[i1] + numbers[i2];
        int sum2 = numbers[j1] + numbers[j2];
        int sum3 = 0;
        for (int i = 0; i < 6; i++) {
            sum3 += numbers[i];
        }
        sum3 = sum3 - sum1 - sum2;

        int[] sums = {sum1, sum2, sum3};
        Arrays.sort(sums);

        return sums[2] - sums[0];
    }
}