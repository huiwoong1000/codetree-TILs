import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] cowHeight = new int[n];

        for (int i = 0; i < n; i++) {
            cowHeight[i] = sc.nextInt();
        }

        int count = 0;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                for (int k = j + 1; k < n; k++) {
                    if (cowHeight[i] <= cowHeight[j] && cowHeight[j] <= cowHeight[k]) {
                        count++;
                    }
                }
            }
        }

        System.out.print(count);
    }
}