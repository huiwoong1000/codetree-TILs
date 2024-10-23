import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int h = sc.nextInt();
        int t = sc.nextInt();
        int[] heights = new int[n];

        for (int i = 0; i < n; i++) {
            heights[i] = sc.nextInt();
        }

        int minCost = Integer.MAX_VALUE;
        for (int i = 0; i < n - 3; i++) {
            int cost = 0;
            for (int j = i; j < i + 3; j++) {
                cost += Math.abs(heights[j] - h);
            }

            minCost = Math.min(minCost, cost);
        }

        System.out.print(minCost);
    }
}