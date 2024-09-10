import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int offset = n * 100;
        int[] result = new int[offset * 2 + 1];
        int start = offset;

        for (int i = 0; i < n; i++) {
            int move = sc.nextInt();

            if (sc.next().charAt(0) == 'R') {
                for (int j = start; j < start + move; j++) {
                    result[j] = 2;
                }
                start += move - 1;  // 마지막으로 칠한 타일 위치 조정
            } else {
                for (int j = start; j > start - move; j--) {
                    result[j] = 1;
                }
                start -= move - 1;
            }
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