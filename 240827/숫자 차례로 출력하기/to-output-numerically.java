import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        printNumberAsc(n);
        System.out.println();        
        printNumberDesc(n);
    }

    private static void printNumberAsc(int n) {

        if (n <= 0) {
            return;
        }

        printNumberAsc(n - 1);
        System.out.print(n + " ");
    }

    private static void printNumberDesc(int n) {

        if (n <= 0) {
            return;
        }

        System.out.print(n + " ");
        printNumberDesc(n - 1);
    }
}