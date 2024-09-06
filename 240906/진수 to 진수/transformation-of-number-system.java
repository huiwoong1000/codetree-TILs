import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        String strNumber = sc.next();

        int n = 0;
        for (int i = 0; i < strNumber.length(); i++) {
            n = n * a + (strNumber.charAt(i) - '0');
        }

        List<Integer> digits = new ArrayList<>();
        while (n > 0) {
            digits.add(n % b);
            n /= b;
        }

        for (int i = digits.size() - 1; i >= 0; i--) {
            System.out.print(digits.get(i));
        }
    }
}