import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Point[] checkPoints = new Point[n];
        for (int i = 0; i < n; i++) {
            int x = sc.nextInt();
            int y = sc.nextInt();
            checkPoints[i] = new Point(x, y);
        }

        int totalDistance = 0;
        int minDistance = Integer.MAX_VALUE;
        for (int i = 1; i < n - 1; i++) {
            for (int j = 0; j < n - 1; j++) {
                if (i == j + 1) {
                    totalDistance += getDistance(checkPoints[j].getX(), checkPoints[j].getY(), checkPoints[j + 2].getX(), checkPoints[j + 2].getY());
                    j++;
                } else {
                    totalDistance += getDistance(checkPoints[j].getX(), checkPoints[j].getY(), checkPoints[j + 1].getX(), checkPoints[j + 1].getY());
                }
            }
            minDistance = Math.min(totalDistance, minDistance);
            totalDistance = 0;
        }

        System.out.print(minDistance);
    }

    private static int getDistance(int x1, int y1, int x2, int y2) {
        return (Math.abs(x1 - x2) + Math.abs(y1 - y2));
    }

}

class Point {

    int x;
    int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }
}