import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<Integer> digits = new ArrayList<>();

        if (n == 0) {
            digits.add(0);
        }

        while (n > 0) {
            digits.add(n % 2);
            n /= 2;
        }

        for (int i = digits.size() - 1; i >= 0; i--) {
            System.out.print(digits.get(i));
        }
    }
}