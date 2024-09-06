import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int b = sc.nextInt();

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