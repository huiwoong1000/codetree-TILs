import java.util.*;

public class Main {

    private static int[] numbers;

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        String[] strNumbers = sc.nextLine().split(" ");

        numbers = new int[n];
        for (int i = 0; i < n; i++) {
            numbers[i] = Integer.parseInt(strNumbers[i]);
        }

        System.out.print(getLcm());
    }

    private static int getLcm() {

        int lcm = numbers[0];
        for (int i = 0; i < numbers.length - 1; i++) {
            lcm = lcm * numbers[i + 1] / getGcd(lcm, numbers[i + 1]);
        }

        return lcm;
    }

    private static int getGcd(int a, int b) {

        if (a % b == 0) {
            return b;
        }

        return getGcd(b, a % b);
    }
}