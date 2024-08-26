import java.util.*;

public class Main {
    private static int[] numbers = new int[100];

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();
        numbers = getNumbers(sc, n);

        while (m > 0) {
            int startNum = sc.nextInt();
            int endNum = sc.nextInt();
            int sum = 0;
            for (int i = startNum; i <= endNum; i++) {
                sum += numbers[i - 1];
            }

            System.out.println(sum);
            m--;
        }
    }

    private static int[] getNumbers(Scanner sc, int length) {
        int[] numbers = new int[length];
        for (int i = 0; i < length; i++) {
            numbers[i] = sc.nextInt();
        }

        return numbers;
    }
}