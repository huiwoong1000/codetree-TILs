import java.util.*;

public class Main {

    private static int[][] dots;

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        dots = new int[n][2];
        for (int i = 0; i < n; i++) {
            dots[i][0] = sc.nextInt();
            dots[i][1] = sc.nextInt();
        }

        List<Integer> distanceList = new ArrayList<>();
        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                distanceList.add(getDistance(dots[i][0], dots[i][1], dots[j][0], dots[j][1]));
            }
        }

        distanceList.sort(null);
        System.out.print(distanceList.get(0));

    }

    private static int getDistance(int x1, int y1, int x2, int y2) {

        return (x1 - x2) * (x1 - x2) + (y1 - y2) * (y1 - y2);
    }
}