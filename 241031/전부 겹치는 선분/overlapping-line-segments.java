import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int minX2 = Integer.MAX_VALUE;
        int maxX1 = 0;

        for (int i = 0; i < n; i++) {
            int x1 = sc.nextInt();
            int x2 = sc.nextInt();
            maxX1 = Math.max(maxX1, x1);
            minX2 = Math.min(minX2, x2);
        }

        System.out.print(maxX1 <= minX2 ? "Yes" : "No");
    }
}