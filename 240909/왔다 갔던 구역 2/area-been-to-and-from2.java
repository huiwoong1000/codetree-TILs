import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int offset = n * 10;
        int[] result = new int[(offset * 2 + 1)];
        int count = 0;

        int start = offset;
        int end = offset;

        for (int i = 0; i < n; i++) {
            int move = sc.nextInt();
            if (sc.next().charAt(0) == 'R') {
                end = end + move;
            } else {
                end = end - move;
            }

            if (start > end) {
                for (int j = end; j < start; j++) {
                    result[j]++;
                }   
            } else {
                for (int j = start; j < end; j++) {
                    result[j]++;
                }
            }

            start = end;
        }

        for (int i = 0; i < result.length; i++) {
            if (result[i] >= 2) {
                count++;
            }
        }

        System.out.print(count);
    }
}