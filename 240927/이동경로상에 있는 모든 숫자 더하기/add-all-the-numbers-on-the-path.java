import java.util.*;

public class Main {

    private static int n = 0;

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        int t = sc.nextInt();
        char[] instructions = sc.next().toCharArray();

        int[][] numbers = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                numbers[i][j] = sc.nextInt();
            }
        }

        int[] di = {0, -1, 0, 1};
        int[] dj = {1, 0, -1, 0};
        int currentI = n / 2;
        int currentJ = n / 2;
        int sum = numbers[currentI][currentJ];
        int dirNum = 1;

        for (int i = 0; i < t; i++) {
            switch(instructions[i]) {
                case 'L':
                dirNum = (dirNum + 1) % 4;
                break;

                case 'R':
                dirNum = (dirNum + 3) % 4;
                break;

                case 'F':
                int candidateI = currentI + di[dirNum];
                int candidateJ = currentJ + dj[dirNum];
                if (isInRange(candidateI, candidateJ)) {
                    currentI = candidateI;
                    currentJ = candidateJ;
                    sum += numbers[currentI][currentJ];
                }
                break;
            }
        }

        System.out.print(sum);
    }

    private static boolean isInRange(int i, int j) {
        return (0 <= i && i < n) && (0 <= j && j < n);
    }
}