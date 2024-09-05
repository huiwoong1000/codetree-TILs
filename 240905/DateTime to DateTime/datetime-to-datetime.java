import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int d = sc.nextInt();
        int h = sc.nextInt();
        int m = sc.nextInt();

        int result = getMinutes(d, h, m) - getMinutes(11, 11, 11);
        System.out.println(result < 0 ? -1 : result);
    }

    private static int getMinutes(int d, int h, int m) {
        int minutes = m;
        minutes += h * 60;
        minutes += d * 24 * 60;

        return minutes;
    }
}