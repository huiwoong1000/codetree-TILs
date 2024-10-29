import java.util.*;

public class Main {

    private static int n, C, G, H;
    private static int[] Ta, Tb;

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        C = sc.nextInt();
        G = sc.nextInt();
        H = sc.nextInt();
        Ta = new int[n];
        Tb = new int[n];
        for (int i = 0; i < n; i++) {
            Ta[i] = sc.nextInt();
            Tb[i] = sc.nextInt();
        }

        int maxWork = 0;
        for (int i = 0; i <= 1000; i++) {
            int work = 0;
            for (int j = 0; j < n; j++) {
                work += getWorkQuantity(Ta[j], Tb[j], i);
            }

            maxWork = Math.max(maxWork, work);
        }

        System.out.print(maxWork);
    }

    private static int getWorkQuantity(int tA, int tB, int temp) {
        
        if (temp < tA) {
            return C;
        } else if (tA <= temp && temp <= tB) {
            return G;
        } else {
            return H;
        }
    }
}