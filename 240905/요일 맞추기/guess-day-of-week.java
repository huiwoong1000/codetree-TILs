import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int m1 = sc.nextInt();
        int d1 = sc.nextInt();
        int m2 = sc.nextInt();
        int d2 = sc.nextInt();

        int diffDays = (getAfterDays(m2, d2) - getAfterDays(m1, d1)) % 7;
        diffDays = diffDays < 0 ? diffDays += 7 : diffDays;

        String result = "Mon";
        switch (diffDays) {
            case 1: result = "Tue";
            case 2: result = "Wed";
            case 3: result = "Thu";
            case 4: result = "Fri";
            case 5: result = "Sat";
            case 6: result = "Sun";
        }

        System.out.println(result);
    }

    private static int getAfterDays(int m, int d) {

        int[] days = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        int afterDays = d;
        for (int i  = 0; i < m; i++) {
            afterDays += days[i];
        }

        return afterDays;
    }
}