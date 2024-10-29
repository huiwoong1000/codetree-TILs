import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] start = new int[n];
        int[] end = new int[n];
        for (int i = 0; i < n; i++) {
            start[i] = sc.nextInt();
            end[i] = sc.nextInt();
        }

        int[] lines = new int[101];
        for (int i = 0; i < n; i++) {
            for (int j = start[i]; j <= end[i]; j++) {
                lines[j]++;
            }
        }

        int[] candidateLines = new int[101];
        int count = 0;
        for (int i = 0; i < n - 2; i++) {
            for (int j = i + 1; j < n - 1; j++) {
                for (int k = j + 1; k < n; k++) {
                    if (i != j && j != k && i != k) {
                        System.arraycopy(lines, 0, candidateLines, 0, lines.length);

                        for (int l = start[k]; l <= end[k]; l++) {
                            candidateLines[l]--;
                        }
                        for (int l = start[j]; l <= end[j]; l++) {
                            candidateLines[l]--;
                        }
                        for (int l = start[i]; l <= end[i]; l++) {
                            candidateLines[l]--;
                        }

                        boolean passed = true;
                        for (int l = 0; l < candidateLines.length; l++) {
                            if (candidateLines[l] != 1 && candidateLines[l] != 0) {
                                passed = false;
                            }
                        }

                        if (passed) {
                            System.out.println("passed, i=" + i + ", j=" + j + ", k=" + k);
                            count++;
                        }
                    }
                }
            }
        }
        
        System.out.println(count);
    }
}