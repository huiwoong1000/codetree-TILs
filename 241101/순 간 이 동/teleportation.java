import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int x = sc.nextInt();
        int y = sc.nextInt();

        int minDist = Integer.MAX_VALUE;
        minDist = Math.min(minDist, Math.abs(b - a));
        minDist = Math.min(minDist, Math.abs(x - a) + Math.abs(b - y));
        minDist = Math.min(minDist, Math.abs(y - a) + Math.abs(b - x));

        System.out.print(minDist);
    }
}