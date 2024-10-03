import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        char[] charArr = sc.next().toCharArray();

        int count = 0;
        for (int i = 0; i < charArr.length; i++) {
            if (charArr[i] == '(') {
                for (int j = i; j < charArr.length; j++) {
                    if (charArr[j] == ')') {
                        count++;
                    }
                }
            }
        }

        System.out.print(count);
    }
}