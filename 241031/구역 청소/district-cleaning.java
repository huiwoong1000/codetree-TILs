import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();

        int[] area = new int[101];
        for (int i = a; i < b; i++) {
            area[i] = 1;
        }
        for (int j = c; j < d; j++) {
            area[j] = 1;
        }

        int sum = 0;
        for (int i = 0; i < 101; i++) {
            if (area[i] == 1) {
                sum++;
            }
        }

        System.out.print(sum);
    }
}