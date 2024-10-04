import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        char[] charArr = sc.next().toCharArray();
        if (charArr.length < 4) {
            System.out.print(0);
            return;
        }

        int count = 0;
        for (int i = 0; i < charArr.length - 3; i++) {
            for (int j = i + 2; j < charArr.length - 1; j++) {
                if (charArr[i] == '('
                && charArr[i + 1] == '('
                && charArr[j] == ')'
                && charArr[j + 1] == ')') {
                    count++;
                }
            }
        }

        System.out.print(count);
    }
}