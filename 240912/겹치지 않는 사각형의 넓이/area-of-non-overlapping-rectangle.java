import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int offset = 1000;
        int maxlength = offset * 2 + 1;
        int[] arrA = new int[4];
        int[] arrB = new int[4];
        int[] arrM = new int[4];

        for (int i = 0; i < 4; i++) {
            arrA[i] = sc.nextInt() + offset;
        }
        
        for (int i = 0; i < 4; i++) {
            arrB[i] = sc.nextInt() + offset;
        }

        for (int i = 0; i < 4; i++) {
            arrM[i] = sc.nextInt() + offset;
        }

        int rec[][] = new int[maxlength][maxlength];
        for (int i = arrA[0]; i < arrA[2]; i++) {
            for (int j = arrA[1]; j < arrA[3]; j++) {
                rec[i][j] = 1;
            }
        }

        for (int i = arrB[0]; i < arrB[2]; i++) {
            for (int j = arrB[1]; j < arrB[3]; j++) {
                rec[i][j] = 1;
            }
        }

        for (int i = arrM[0]; i < arrM[2]; i++) {
            for (int j = arrM[1]; j < arrM[3]; j++) {
                rec[i][j] = 0;
            }
        }

        int count = 0;
        for (int i = 0; i < maxlength; i++) {
            for (int j = 0; j < maxlength; j++) {
                if (rec[i][j] != 0) {
                    count++;
                }
            }
        }

        System.out.print(count);
    }
}