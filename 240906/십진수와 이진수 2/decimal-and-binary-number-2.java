import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String strNum = sc.next();

        int n10 = 0;
        for (int i = 0; i < strNum.length(); i++) {
            n10 = n10 * 2 + (strNum.charAt(i) - '0');
        }

        n10 *= 17;

        List<Integer> digits = new ArrayList<>();
        while (n10 > 0) {
            digits.add(n10 % 2);
            n10 /= 2;
        }

        for (int i = digits.size() - 1; i >= 0; i--) {
            System.out.print(digits.get(i));
        }
    }
}