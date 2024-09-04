import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        Dot[] dots = new Dot[n];
        for (int i = 0; i < n; i++) {
            dots[i] = new Dot(sc.nextInt(), sc.nextInt());
        }

        Arrays.sort(dots);
        for (Dot dot : dots) {
            System.out.println(dot.getNumber());
        }
    }
}

class Dot implements Comparable<Dot> {

    private Integer distance;
    private Integer number;
    private static int sequence = 0;

    public Dot(int x, int y) {
        this.distance = Math.abs(x) + Math.abs(y);
        this.number = ++sequence;
    }

    public Integer getDistance() {
        return distance;
    }

    public Integer getNumber() {
        return number;
    }

    @Override
    public int compareTo(Dot d) {
        if (distance.equals(d.getDistance())) {
            return number.compareTo(d.getNumber());
        } else {
            return distance.compareTo(d.getDistance());
        }
    }
}