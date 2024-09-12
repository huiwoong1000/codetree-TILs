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

        int maxValue = 0;
        int maxJ = 0;
        int minValue = maxLength;
        int minJ = maxLength;
        for (int i = 0; i < maxLength; i++) {
            for (int j = 0; j < maxLength; j++) {
                if (arr[i][j] == 1) {
                    
                    minValue = j;
                    if (minValue < minJ) {
                        minJ = minValue;
                    } 
                    
                    maxValue = j;
                    if (maxValue > maxJ) {
                        maxJ = maxValue;
                    }
                } 
            }
        }
        // System.out.println("minJ = " + minJ);
        // System.out.println("maxJ = " + maxJ);
        int height = maxJ - minJ + 1;
        // System.out.println("height = " + height);

        int lengthI = 0;
        int maxI = 0;
        int minI = maxLength;
        for (int j = 0; j < maxLength; j++) {
            for (int i = 0; i < maxLength; i++) {
                if (arr[i][j] == 1) {
                    
                    if (i < minI) {
                        minI = i;
                    }

                    lengthI = i;
                    if (lengthI > maxI) {
                        maxI = lengthI;
                    }
                }
            }
        }
        // System.out.println("minI = " + minI);
        // System.out.println("maxI = " + maxI);
        int width = maxI - minI + 1;
        // System.out.println("width = " + width);

        int result = height * width;
        System.out.println(result >= 4000000 ? 0 : result);
    }
}