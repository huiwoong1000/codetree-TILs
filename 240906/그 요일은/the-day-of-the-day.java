import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int m1 = sc.nextInt();
        int d1 = sc.nextInt();
        int m2 = sc.nextInt();
        int d2 = sc.nextInt();
        String strDay = sc.next();

        int diffDays = getAfterDays(m2, d2) - getAfterDays(m1, d1);

        switch (strDay) {
            case "Mon": diffDays += 7; break;
            case "Tue": diffDays += 6; break;
            case "Wed": diffDays += 5; break;
            case "Thu": diffDays += 4; break;
            case "Fri": diffDays += 3; break;
            case "Sat": diffDays += 2; break;
            case "Sun": diffDays += 1; break;
        }

        System.out.println(diffDays / 7);
    }

    private static int getAfterDays(int m, int d) {

        int[] days = {0, 31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        int afterDays = d;
        for (int i = 0; i < m; i++) {
            afterDays += days[i];
        }

        return afterDays;
    }
}