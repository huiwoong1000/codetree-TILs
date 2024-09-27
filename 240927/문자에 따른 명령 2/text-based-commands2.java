import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        char[] instructions = sc.nextLine().toCharArray();

        int[] dx = {1, 0, -1, 0};
        int[] dy = {0, 1, 0, -1};
        int dirNum = 1;
        int x = 0;
        int y = 0;

        for (int i = 0; i < instructions.length; i++) {
            switch(instructions[i]) {
                case 'L':
                dirNum = (dirNum + 1) % 4;
                break;

                case 'R':
                dirNum = (dirNum + 3) % 4;
                break;

                case 'F':
                x += dx[dirNum];
                y += dy[dirNum];
                break;
            }
        }

        System.out.print(x + " " + y);
    }
}