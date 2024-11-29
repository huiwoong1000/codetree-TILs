import java.util.*;

public class Main {

    private static int n, t;
    private static int[] arr1, arr2;

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        t = sc.nextInt();
        arr1 = new int[n];
        arr2 = new int[n];
        for (int i = 0; i < n; i++) {
            arr1[i] = sc.nextInt();
        }
        for (int i = 0; i < n; i++) {
            arr2[i] = sc.nextInt();
        }

        for (int i = 0; i < t; i++) {
            int temp1 = arr1[n - 1];
            int temp2 = arr2[n - 1];
            for (int j = n - 1; j > 0; j--) {
                arr1[j] = arr1[j - 1];
                arr2[j] = arr2[j - 1];
            }
            arr1[0] = temp2;
            arr2[0] = temp1;
        }
        
        for (int i = 0; i < n; i++) {
            System.out.print(arr1[i] + " ");
        }
        System.out.println();
        for (int i = 0; i < n; i++) {
            System.out.print(arr2[i] + " ");
        }
    }
}