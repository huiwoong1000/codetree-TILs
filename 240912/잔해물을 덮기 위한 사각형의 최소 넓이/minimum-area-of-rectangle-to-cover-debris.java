import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int offset = 1000;
        int maxLength = offset * 2 + 1;
        int[] first = new int[4];
        int[] second = new int[4];
        int[][] arr = new int[maxLength][maxLength];

        for (int i = 0; i < 4; i++) {
            first[i] = sc.nextInt() + offset;
        }

        for (int i = 0; i < 4; i++) {
            second[i] = sc.nextInt() + offset;
        }

        for (int i = first[0]; i < first[2]; i++) {
            for (int j = first[1]; j < first[3]; j++) {
                arr[i][j] = 1;
            }
        }

        for (int i = second[0]; i < second[2]; i++) {
            for (int j = second[1]; j < second[3]; j++) {
                arr[i][j] = 0;
            }
        }

        int maxJ = 0;
        for (int i = 0; i < maxLength; i++) {
            int countJ = 0;
            for (int j = 0; j < maxLength; j++) {
                if (arr[i][j] == 1) {
                    countJ++;
                    if (countJ > maxJ) {
                        maxJ = countJ;
                    }
                }
            }
        }

        int maxI = 0;
        for (int i = 0; i < maxLength; i++) {
            int countI = 0;
            for (int j = 0; j < maxLength; j++) {
                if (arr[j][i] == 1) {
                    countI++;
                    if (countI > maxI) {
                        maxI = countI;
                    }
                }
            }
        }
        
        System.out.println(maxI * maxJ);
    }
}