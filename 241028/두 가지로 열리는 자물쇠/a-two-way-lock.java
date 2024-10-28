import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] numbers1 = new int[3];
        int[] numbers2 = new int[3];
        for (int i = 0; i < 3; i++) {
            numbers1[i] = sc.nextInt();
        }
        for (int i = 0; i < 3; i++) {
            numbers2[i] = sc.nextInt();
        }

        int count = 0;

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                for (int k = 1; k <= n; k++) {
                    if ((Math.abs(numbers1[0] - i) <= 2 || Math.abs(numbers1[0] - i) >= n - 2) 
                    && (Math.abs(numbers1[1] - j) <= 2 || Math.abs(numbers1[1] - j) >= n - 2) 
                    && (Math.abs(numbers1[2] - k) <= 2 || Math.abs(numbers1[2] - k) >= n - 2)) {
                        count++;
                    } else if ((Math.abs(numbers2[0] - i) <= 2 || Math.abs(numbers2[0] - i) >= n - 2) 
                    && (Math.abs(numbers2[1] - j) <= 2 || Math.abs(numbers2[1] - j) >= n - 2) 
                    && (Math.abs(numbers2[2] - k) <= 2 || Math.abs(numbers2[2] - k) >= n - 2)) {
                        count++;
                    }
                }
            }
        }

        System.out.print(count);
    }
}