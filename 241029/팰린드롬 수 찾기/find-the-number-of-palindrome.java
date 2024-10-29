import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();

        int count = 0;
        for (int i = x; i <= y; i++) {
            char[] charNumArr = Integer.toString(i).toCharArray();
            int size = charNumArr.length;
            int mid = (size - 1) / 2;

            boolean isPalindrome = true;
            for (int j = 0; j <= mid; j++) {
                if (charNumArr[j] != charNumArr[size - j - 1]) {
                    isPalindrome = false;
                }
            }

            if (isPalindrome) {
                count++;
            }
        }

        System.out.print(count);
    }
}