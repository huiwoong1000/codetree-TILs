import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
        int c = sc.nextInt();
        String[][] board = new String[r][c];

        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                board[i][j] = sc.next();
            }
        }

        int count = 0;
        for (int i = 1; i < r; i++) {
            for (int j = 1; j < c; j++) {
                for (int k = i + 1; k < r - 1; k++) {
                    for (int l = j + 1; l < c - 1; l++) {
                        if (!board[0][0].equals(board[i][j])
                            && !board[i][j].equals(board[k][l])
                            && !board[k][l].equals(board[r - 1][c - 1])) {
                                count++;
                        }
                    }
                }
            }
        }

        System.out.print(count);
    }
}