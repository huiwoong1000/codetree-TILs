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

        int lengthJ = 0;
        int maxJ = 0;
        int minJ = maxLength;
        for (int i = 0; i < maxLength; i++) {
            boolean flag = false;
            for (int j = 0; j < maxLength; j++) {
                if (arr[i][j] == 1) {
                    if (j - offset < minJ) {
                        minJ = j - offset;
                    } 
                    
                    lengthJ = j - offset;
                    if (lengthJ > maxJ) {
                        maxJ = lengthJ + 1;
                    }
                } 
            }
        }
        // System.out.println("minJ = " + minJ);
        // System.out.println("maxJ = " + maxJ);
        int height = maxJ - minJ;
        // System.out.println("height = " + height);

        int lengthI = 0;
        int maxI = 0;
        int minI = maxLength;
        for (int j = 0; j < maxLength; j++) {
            boolean flag = false;
            for (int i = 0; i < maxLength; i++) {
                if (arr[i][j] == 1) {
                    if (i - offset < minI) {
                        minI = i - offset;
                    }

                    lengthI = i - offset;
                    if (lengthI > maxI) {
                        maxI = lengthI + 1;
                    }
                    // System.out.println("lengthI = " + lengthI);
                }
            }
        }
        int width = maxI - minI;
        // System.out.println("width = " + width);

        System.out.println(height * width);
    }
}