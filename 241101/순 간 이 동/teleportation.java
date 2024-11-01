import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int x = sc.nextInt();
        int y = sc.nextInt();

        int[] candidate = new int[5];
        candidate[0] = Math.abs(b - a);
        candidate[1] = Math.abs(x - a) + Math.abs(b - x);
        candidate[2] = Math.abs(y - a) + Math.abs(b - y);
        candidate[3] = Math.abs(x - a) + Math.abs(b - y);
        candidate[4] = Math.abs(y - a) + Math.abs(b - x);

        Arrays.sort(candidate);
        System.out.print(candidate[0]);
    }
}