import java.util.*;

public class Main {

    private static int[] numbers = new int[100];

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        String[] strNumbers = sc.nextLine().split(" ");

        for (int i = 0; i < n; i++) {
            numbers[i] = Integer.parseInt(strNumbers[i]);
        }

        int max = 0;
        System.out.print(findMax(n, max));
    }

    private static int findMax(int count, int max) {

        count--;
        if (count < 0) {
            return max;
        }

        if (numbers[count] > max) {
            max = numbers[count];
        }

        return findMax(count, max);
    }
}