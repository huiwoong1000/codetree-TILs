import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int m1 = sc.nextInt();
        int d1 = sc.nextInt();
        int m2 = sc.nextInt();
        int d2 = sc.nextInt();

        int[] days = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        
        int startDay = d1;
        for (int i = 0; i < m1; i++) {
            startDay += days[i];
        }

        int endDay = d2;
        for (int i = 0; i < m2; i++) {
            endDay += days[i];
        }

        System.out.println(endDay - startDay + 1);
    }
}