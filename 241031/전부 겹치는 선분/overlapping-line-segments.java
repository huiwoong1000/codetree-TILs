import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] area = new int[101];
        
        boolean isIntersecting = false;
        for (int i = 0; i < n; i++) {
            int x1 = sc.nextInt();
            int x2 = sc.nextInt();

            for (int j = x1; j <= x2; j++) {
                area[j]++;
            }
        }

        for (int i = 0; i < 101; i++) {
            if (area[i] == n) {
                isIntersecting = true;
            }
        }

        System.out.print(isIntersecting ? "Yes" : "No");
    }
}