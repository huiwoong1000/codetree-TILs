import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] numbers = new int[n];
        for (int i = 0; i < n; i++) {
            numbers[i] = sc.nextInt();
        }

        Arrays.sort(numbers);
        List<Integer> elements = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            elements.add(numbers[i]);

            if (!(elements.get(elements.size() - 1) - elements.get(0) <= k)) {
                break;
            }
        }

        System.out.print(elements.size() - 1);
    }
}