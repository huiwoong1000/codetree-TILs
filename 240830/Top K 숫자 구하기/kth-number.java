import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int findIndex = sc.nextInt();

        Integer[] numbers = new Integer[n];
        for (int i = 0; i < n; i++) {
            numbers[i] = sc.nextInt();
        }

        Arrays.sort(numbers);
        System.out.print(numbers[findIndex - 1]);
    }
}