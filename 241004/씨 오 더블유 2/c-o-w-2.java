import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        char[] charArr = sc.next().toCharArray();
        int count = 0;

        for (int i = 0; i < n - 2; i++) {
            for (int j = i + 1; j < n - 1; j++) {
                for (int k = j + 1; k < n; k++) {
                    if (charArr[i] == 'C'
                     && charArr[j] == 'O'
                     && charArr[k] == 'W') {
                       count++;
                    }
                }
            }
        }

        System.out.print(count);
    }
}