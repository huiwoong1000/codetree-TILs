import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = 4;
        int[] rec1 = new int[n];
        for (int i = 0; i < n; i++) {
            rec1[i] = sc.nextInt();
        }
        int[] rec2 = new int[n];
        for (int i = 0; i < n; i++) {
            rec2[i] = sc.nextInt();
        }

        System.out.print((rec1[2] < rec2[0] || rec2[2] < rec1[0] || rec2[3] < rec1[1] || rec1[3] < rec2[1]) ? "nonoverlapping" : "overlapping");
    }
}