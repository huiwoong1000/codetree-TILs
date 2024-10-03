import java.util.*;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] numbers = new int[n];

        for (int i = 0; i < n; i++) {
            numbers[i] =  sc.nextInt();
        }

        int sumMove = 0;
        int minSumMove = Integer.MAX_VALUE;

        for (int position = 0; position < 5; position++) {
            for (int i = 0; i < 5; i++) {
                sumMove += numbers[i] * Math.abs(i - position);
            }

            if (sumMove < minSumMove) {
                minSumMove = sumMove;
            }
            sumMove = 0;
        }

        System.out.print(minSumMove);
    }
}