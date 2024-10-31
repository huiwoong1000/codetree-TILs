import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int x1 = sc.nextInt();
        int x2 = sc.nextInt();
        
        boolean isIntersecting = true;
        for (int i = 0; i < n - 1; i++) {
            int a1 = sc.nextInt();
            int a2 = sc.nextInt();
            if (x2 < a1 || a2 < x1) {
                isIntersecting = false;
            }
        }

        System.out.print(isIntersecting ? "Yes" : "No");
    }
}