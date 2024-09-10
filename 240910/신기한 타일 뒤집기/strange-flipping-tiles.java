import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int offset = 100;
        int[] result = new int[offset * 2 + 1];
        int start = offset;
        int end = offset;
        int move = 0;

        for (int i = 0; i < n; i++) {
            move = sc.nextInt();
            if (sc.next().charAt(0) == 'R') {
                end += move;
            } else {
                end -= move;
            }

            if (start < end) {
                for (int j = start; j < end; j++) {
                    result[j] = 2;
                }
            } else {
                for (int j = end; j < start; j++) {
                    result[j] = 1;
                }
            }

            start = end;
        }

        int countW = 0;
        int countB = 0;
        for (int i = 0; i < result.length; i++) {
            if (result[i] == 1) {
                countW++;
            }
            if (result[i] == 2) {
                countB++;
            }
        }

        System.out.print(countW + " " + countB);
    }
}