import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int x = 0;
        int y = 0;
        int[] dx = {1, 0, -1, 0};
        int[] dy = {0, 1, 0, -1}; //E:0, N:1, W:2, S:3

        for (int i = 0; i < n; i++) {

            switch (sc.next().charAt(0)) {
                case 'E':
                    x += dx[0] * sc.nextInt();
                    break;
                case 'N':
                    y += dy[1] * sc.nextInt();
                    break;
                case 'w':
                    x += dx[2] * sc.nextInt();
                    break;
                case 'S':
                    y += dy[3] * sc.nextInt();
                    break;
            }
        }

        System.out.print(x + " " + y);
    }
}