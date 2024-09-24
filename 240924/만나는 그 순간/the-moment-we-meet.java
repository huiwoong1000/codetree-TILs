import java.util.*;

public class Main {

    private static final int MAX_LENGTH = 1000 * 1000 + 1;

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] arrN = new int[MAX_LENGTH];
        int[] arrM = new int[MAX_LENGTH];
        int position = 0;
        int index = 0;

        for (int i = 0; i < n; i++) {
            char d = sc.next().charAt(0);
            int t = sc.nextInt();

            for (int j = 0; j < t; j++) {
                if (d == 'R') {
                    arrN[index++] = ++position;
                } else {
                    arrN[index++] = --position;
                }
            }
        }

        position = 0;
        index = 0;
        for (int i = 0; i < m; i++) {
            char d = sc.next().charAt(0);
            int t = sc.nextInt();

            for (int j = 0; j < t; j++) {
                if (d == 'R') {
                    arrM[index++] = ++position;
                } else {
                    arrM[index++] = --position;
                }
            }
        }

        int result = -1;
        for (int i = 0; i < MAX_LENGTH; i++) {
            
            if (arrN[i] == arrM[i]) {
                result = i + 1;
                break;
            }
        }

        System.out.print(result);
    }
}